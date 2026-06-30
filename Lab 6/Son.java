class Grandfather {
    public void company() {
        System.out.println("Grandfather's Business");
    }
}

class Father extends Grandfather {
    public void car() {
        System.out.println("Father's Car");
    }
}

public class Son extends Father {
    public void mobile() {
        System.out.println("Son's Mobile");
    }

    public static void main(String[] args) {
        Son obj = new Son();
        
        obj.company();
        obj.car();
        obj.mobile();
    }
}