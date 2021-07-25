package BehavioralPatterns.ChainOfResponsibilities;

public class CheckApp {
    public static void main(String[] args) {
        Checking checkingBalance = new CheckingBalance(ActionPriority.BALANCE);
        Checking checkingDelivery = new CheckingDelivery(ActionPriority.DELIVERY);
        Checking checkingPayment = new CheckingPayment(ActionPriority.PAYMENT);

        checkingBalance.setNextStage(checkingDelivery);
        checkingDelivery.setNextStage(checkingPayment);

        checkingPayment.checkManager(ActionPriority.BALANCE);
        System.out.println();
        checkingPayment.checkManager(ActionPriority.DELIVERY);
        System.out.println();
        checkingPayment.checkManager(ActionPriority.PAYMENT);
}}
