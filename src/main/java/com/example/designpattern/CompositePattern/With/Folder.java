package com.example.designpattern.CompositePattern.With;



import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private String name;

    private List<FileSystemComponent> components = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFileOrFolder(FileSystemComponent component) {
        components.add(component);
    }

    public void showDetails() {
        System.out.println("Folder name: " + name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
        System.out.println();
    }

}
