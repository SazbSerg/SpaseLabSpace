package BehavioralPatterns.Memento;

public class Calculator {
   private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public void load(Save save){  // сохранение поля number в поле number класса Save
        number = save.getNumber();
    }

    public Save save(){          // сохранение ссылки на экзампляр класса Save со значением поля number в поле
        return new Save(number); // Save экземпляра класса File
    }

    @Override
    public String toString() {
        return "Значение числа = " + number;
    }
}
