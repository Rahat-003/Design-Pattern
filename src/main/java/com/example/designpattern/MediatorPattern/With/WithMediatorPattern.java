package com.example.designpattern.MediatorPattern.With;


import java.util.ArrayList;
import java.util.List;

interface ChatMediator {
    void sendMessageToChatRoomUsers(String message, ChatUser user);
    void addUser(ChatUser user);
}

class ChatRoom implements ChatMediator {
    private List<ChatUser> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessageToChatRoomUsers(String message, ChatUser sender) {
        for (ChatUser singleUser : users) {
            if (!sender.equals(singleUser)) {
                singleUser.receiveMessage(message, sender);
            }
        }
        System.out.println();
    }

    @Override
    public void addUser(ChatUser user) {
        this.users.add(user);
    }
}

class ChatUser {
    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name, ChatMediator chatMediator) {
        this.name = name;
        this.chatMediator = chatMediator;
    }
    public String getName() {
        return name;
    }
    public void sendMessage(String message) {
        System.out.println(this.name + " sending message: \"" + message + "\" to chatRoom\n");
        this.chatMediator.sendMessageToChatRoomUsers(message, this);
    }

    public void receiveMessage(String message, ChatUser sender) {
        System.out.println(this.name + " received message: \"" + message + "\" from " + sender.getName());
    }
}

public class WithMediatorPattern {
    public static void main(String[] args) {
        System.out.println("---------- With Mediator Pattern ----------");

        ChatMediator chatMediator = new ChatRoom();

        ChatUser rahat = new ChatUser("Rahat", chatMediator );
        ChatUser hasan = new ChatUser("Hasan", chatMediator);
        ChatUser james = new ChatUser("James", chatMediator);
        ChatUser saleh = new ChatUser("Saleh", chatMediator);

        chatMediator.addUser(rahat);
        chatMediator.addUser(hasan);
        chatMediator.addUser(saleh);
//        chatMediator.addUser(james);

        rahat.sendMessage("Hello EveryOne!");
    }
}
