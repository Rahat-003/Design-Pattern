package com.example.designpattern;

import com.example.designpattern.ObserverPattern.ObserverPatternMain;
import com.example.designpattern.StrategyPattern.StrategyPatternMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Observer;



@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
//        ObserverPatternMain.main(args);
        StrategyPatternMain.main(args);
    }

}
