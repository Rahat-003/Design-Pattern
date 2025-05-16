package com.example.designpattern.ProxyPattern;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadImageFromDisk(); // Expensive Operation
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName);
    }
}
