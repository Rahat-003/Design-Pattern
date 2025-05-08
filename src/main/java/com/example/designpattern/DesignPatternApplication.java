package com.example.designpattern;


import com.example.designpattern.BuilderPattern.BuilderPatternMain;
import com.example.designpattern.IteratorPattern.IteratorPatternMain;
import com.example.designpattern.MediatorPattern.MediatorPatternMain;
import com.example.designpattern.SingletonPattern.SingletonPatternMain;
import com.example.designpattern.StatePattern.StatePatternMain;
import com.example.designpattern.TemplateMethodPattern.TemplateMethodPatternMain;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {

//        TemplateMethodPatternMain.main(args);
//        IteratorPatternMain.main(args);
//        StatePatternMain.main(args);
//        MediatorPatternMain.main(args);
//        SingletonPatternMain.main(args);
        BuilderPatternMain.main(args);
    }

}
