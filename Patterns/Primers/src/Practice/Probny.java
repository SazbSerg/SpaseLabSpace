package Practice;

public class Probny {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable {
    public void run(){
        for (int i=1; i<10; i++){
            System.out.println("Hi, brodddddddddddddd!" + i);
        }
    }
}

class MyThread2 extends Thread {
    public void run(){
        for (int i=1; i<10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hi, sis!"+i);
        }
    }
}