package Practice;

public class CrediteCardApp {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1234, "0000");
        creditCard.setLimit(1000);
        System.out.println(creditCard);

        creditCard.deposit(1000, "0000");
        System.out.println(creditCard);

        creditCard.withdraw(500, "0000");
        System.out.println(creditCard);



    }
}
