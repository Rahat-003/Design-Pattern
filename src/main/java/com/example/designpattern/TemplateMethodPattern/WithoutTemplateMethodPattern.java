package com.example.designpattern.TemplateMethodPattern;


class CSVParser {
    public void parse() {
        openFile();
        System.out.println("Parsing CSV file...");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening CSV file...");
    }
    private void closeFile() {
        System.out.println("Closing CSV file...");
    }
}

class JSONParser {
    public void parse() {
        openFile();
        System.out.println("Parsing JSON file...");
        closeFile();
    }

    private void openFile() {
        System.out.println("Opening JSON file...");
    }
    private void closeFile() {
        System.out.println("Closing JSON file...");
    }
}


public class WithoutTemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("--------- Without Template Method Pattern ---------");

        CSVParser csvParser = new CSVParser();
        csvParser.parse();

        System.out.println();

        JSONParser jsonParser = new JSONParser();
        jsonParser.parse();


    }
}
