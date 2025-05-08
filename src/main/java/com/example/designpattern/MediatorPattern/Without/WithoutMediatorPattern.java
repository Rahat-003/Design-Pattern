package com.example.designpattern.MediatorPattern.Without;

class User {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void sendMessage(String message, User recipient) {
        System.out.println(this.name + " sending message \"" + message + "\" to " + recipient.getName());
    }
}


public class WithoutMediatorPattern {
    public static void main(String[] args) {
        System.out.println("---------- Without Mediator Pattern ----------");

        User rahat = new User("Rahat");
        User efat = new User("Efat");
        User boss = new User("Boss");

        rahat.sendMessage("Hello efat",efat);
        efat.sendMessage("Hello boss",boss);

    }
}
