package PatternsPractice;

public abstract class AbstractClass implements InterInterface{
     String s = "fuckU";
     abstract void aVoid();
    @Override
    public void prime1() {
        System.out.println("1 метод в абстрактном классе");
    }

    @Override
    public void prime2() {
        System.out.println("2 метод в абстрактном классе");
    }

    @Override
    public void prime3() {
        System.out.println("3 метод в абстрактном классе");

    }
}
//проверка коммита 23.07.21