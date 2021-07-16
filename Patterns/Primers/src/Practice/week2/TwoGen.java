package Practice.week2;

public class TwoGen<T, V, S, X extends Number> {
    private T objectT;
    private V objectV;
    private S objectS;
    private X objectX;

    public TwoGen(T t, V v, S s, X x) {
        this.objectT = t;
        this.objectV = v;
        this.objectS = s;
        this.objectX = x;
    }

    public T getObjectT() {
        return objectT;
    }

    public void setObjectT(T objectT) {
        this.objectT = objectT;
    }

    public V getObjectV() {
        return objectV;
    }

    public void setObjectV(V objectV) {
        this.objectV = objectV;
    }

    public S getObjectS() {
        return objectS;
    }

    public void setObjectS(S objectS) {
        this.objectS = objectS;
    }

    public X getObjectX() {
        return objectX;
    }

    public void setObjectX(X objectX) {
        this.objectX = objectX;
    }

    @Override
    public String toString() {
        return "TwoGen{" +
                "objectT=" + objectT +
                ", objectV=" + objectV +
                ", objectS=" + objectS +
                ", objectX=" + objectX +
                '}';
    }

    public void showInfo(){
        System.out.println(objectT.toString());
        System.out.println(objectS.toString());
        System.out.println(objectV.toString());
        System.out.println(objectX.toString());
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        Animal dog = new Animal();
        TwoGen<Animal, String, String, Integer > catDescribe = new TwoGen<>(cat, "grey", "persian", 4);
        System.out.println(catDescribe);
        System.out.println();
        catDescribe.showInfo();
        catDescribe.setObjectS("siam");
        catDescribe.setObjectV("white");
        System.out.println();
        catDescribe.showInfo();
        System.out.println();
        System.out.println(catDescribe.getObjectS());

        TwoGen<Animal, String, String, Integer > dogDescribe = new TwoGen<>(dog, "grey", "doberman", 2);
        System.out.println(dogDescribe);
    }

}

class Animal {
    public Animal() {
    }
}