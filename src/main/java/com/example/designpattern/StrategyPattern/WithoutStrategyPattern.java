package com.example.designpattern.StrategyPattern;

class ProcessPayment {

    public void processPayment(String paymentMethod) {
        if(paymentMethod.equals("cash")){
            System.out.println("Payment method is Cash");
        }
        else if(paymentMethod.equals("deposit")){
            System.out.println("Payment method is Deposit");
        }
        else if (paymentMethod.equals("DBBL")) {
            System.out.println("Payment method is DBBL");
        }
        else if(paymentMethod.equals("bkash")){
            System.out.println("Payment method is bKash");
        }
        else {
            System.out.println("Payment method is unknown");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        ProcessPayment processPayment = new ProcessPayment();
        processPayment.processPayment("bkash");
    }
}
