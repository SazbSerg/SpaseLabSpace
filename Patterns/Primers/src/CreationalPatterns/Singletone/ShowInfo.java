package CreationalPatterns.Singletone;

public class ShowInfo {
    public static void main(String[] args) {
        Vocabulary vocabulary = Vocabulary.getInfo();
        System.out.println("Доступ к экземпляру словаря открыт");
        Vocabulary vocabulary1 = Vocabulary.getInfo();
        Test test = new Test();//тестовый класс, создан для условия сравнения

        if (vocabulary==vocabulary1 && !vocabulary.equals(test)){//условие проверки идентичности ссылок на объект
            System.out.println("Объект один и тот же");
        } else {
            System.out.println("Объекты разные");
        };
    }
}
