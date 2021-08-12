package BehavioralPatterns.Memento;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(); // создание экземпляра класса калькулятор
        calculator.setNumber(7); // внесение числа в поле number созданного экземпляра класса Calculator - calculator
        System.out.println(calculator); //вывод в консоль состояния поля экземпляра созданного калькулятора

        File file = new File(); // создание экземпляра опекуна
        file.setSave(calculator.save()); //создание экземпляра класса Save посредством вызова calculator.save()
                                           // и внесение ссылки на Save в поле Save объекта класса File
                                           // теперь в file хранится ссылка на класс Save со значением поля 7
      
      //  calculator.setNumber(8); // внесение нового числа в ранее созданный объект класса Calculator
      //  System.out.println(calculator); // вывод в консоль состояния поля экземпляра созданного калькулятора
      //
      //  calculator.load(file.getSave()); //обращение к методу calculator.load, который посредством вызова file.getSave()
      //                                     // изменяет значение поля calculator то поле, которое сохранено
      //                                     // в поле Save класса file
      //  System.out.println(calculator);  // вывод состояния поля calculator в консоль

    }
}
