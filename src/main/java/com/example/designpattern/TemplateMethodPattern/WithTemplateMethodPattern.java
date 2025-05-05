package com.example.designpattern.TemplateMethodPattern;


abstract class DataParser {
    // Template method define the steps of the algorithm

    public final void parse() {
        openFile();
        parseFile();
        closeFile();
    }

    protected void openFile() {
        System.out.println("Opening file...");
    }

    protected void closeFile() {
        System.out.println("Closing file...");
    }

    protected abstract void parseFile();
}

// CSV Parser
class CSVParser2 extends DataParser {
    @Override
    protected void parseFile() {
        System.out.println("Parsing CSV Data");
    }
}

class JSONParser2 extends DataParser {
    @Override
    protected void parseFile() {
        System.out.println("Parsing JSON Data");
    }
}



public class WithTemplateMethodPattern {
    public static void main(String[] args) {
        System.out.println("--------- With Template Method Pattern --------");

        DataParser csvParser = new CSVParser2();
        DataParser jsonParser = new JSONParser2();

        csvParser.parse();
        System.out.println();
        jsonParser.parse();
    }
}
