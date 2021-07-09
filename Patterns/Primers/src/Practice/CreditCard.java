package Practice;

public class CreditCard {
    private int cardNumber = 1234;
    private String pin;
    private int balance = 0;
    private int limit;
    private int cardDebt = 0;
    byte count = 2;
    int totalMoney = limit + balance;

    public CreditCard(int cardNumber, String pin){
        this.pin = pin;
        }

    public void checkPin(String pin){
        if (!pin.equals(this.pin)) {
            System.out.println("Вы ввели неверный пинкод");
            count--; 
            System.out.println("У вас осталось " + count + " попытки");

            if (count<=0){
                System.out.println("Ваша карта заблокированна. Попробуйте через 30 минут");

            }

        }

    }

    public void setLimit(int limit){
        this.limit = limit;

    }

    public void deposit(int deposit, String pin){  //пополнить карту
          checkPin(pin);
          balance = balance + deposit;

    }
    public void withdraw(int withdraw, String pin){   //снять деньги
        checkPin(pin);
        if(withdraw<=totalMoney) {
            if(withdraw<=balance){
                balance = balance - withdraw;
            } else {
                balance=totalMoney-withdraw;
            }

        } else {
            System.out.println("Превышен кредитный лимит");
        }

    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "cardNumber=" + cardNumber +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", limit=" + limit +
                ", cardDebt=" + cardDebt +
                '}';
    }
}
