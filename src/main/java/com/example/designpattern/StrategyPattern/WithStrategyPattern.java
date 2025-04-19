package com.example.designpattern.StrategyPattern;

interface PaymentStrategy {
    void processPayment();
}

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via credit card");
    }
}


class DebitCardPayment implements PaymentStrategy {
    @Override
    public void processPayment() {
        System.out.println("Making payment via dedit card");
    }
}


class PaymentService {
    private PaymentStrategy strategy;
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay() {
        strategy.processPayment();
    }
}

public class WithStrategyPattern {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        paymentService.setPaymentStrategy(new CreditCardPayment());
//        paymentService.setPaymentStrategy(new DebitCardPayment());

        paymentService.pay();
    }
}
