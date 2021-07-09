package TestOfInterfaces;

public class Main {
    public static void main(String[] args) {
        Boing747 boing747 = new Boing747();
        Kukuruznik kukuruznik = new Kukuruznik();
        Mi8 mi8 = new Mi8();
        NloMars nloMars = new NloMars();
        NloUran nloUran = new NloUran();
        Samolot samolot = new Samolot();
        Raketa raketa = new Raketa();
        Nlo nlo1 = new NloMars();
        Nlo nlo2 = new NloUran();

        Test test = new Test();
        test.foo(raketa);
        boing747.gorizontalPlaner();
        nloMars.maniovrMars();

    }
}
