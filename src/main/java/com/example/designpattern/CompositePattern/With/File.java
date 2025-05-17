package com.example.designpattern.CompositePattern.With;

public class File implements FileSystemComponent{
    private String name;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File Name: " + name);
    }
}
