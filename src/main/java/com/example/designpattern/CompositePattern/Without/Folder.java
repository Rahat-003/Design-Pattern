package com.example.designpattern.CompositePattern.Without;

import java.util.ArrayList;
import java.util.List;



public class Folder {
    private String name;

    private List<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void showDetails() {
        System.out.println("Folder name: " + name);
        for (File file : files) {
            file.showDetails();
        }
    }

}
