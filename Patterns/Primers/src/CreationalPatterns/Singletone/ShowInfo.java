package CreationalPatterns.Singletone;

public class ShowInfo {
    public static void main(String[] args) {
        Vocabulary vocabulary = Vocabulary.getInfo();
        Vocabulary vocabulary1 = Vocabulary.getInfo();
        //Vocabulary vocabulary2 = new Vocabulary();
        System.out.println(vocabulary);
        System.out.println(vocabulary1);
        //System.out.println(vocabulary2);

       //if (vocabulary==vocabulary1){//условие проверки идентичности ссылок на объект
       //    System.out.println("Объект один и тот же");
       //} else {
       //    System.out.println("Объекты разные");
       //};
    }
}
