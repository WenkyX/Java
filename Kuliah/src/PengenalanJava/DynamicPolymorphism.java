package PengenalanJava;

class Hewan {
    public void sound() {
        System.out.println("Hewan makes a sound");
    }
}

class Kucing extends Hewan {
    @Override
    public void sound() {
        System.out.println("Kucing Mengeong");
    }
}

class Anjing extends Hewan {
    @Override
    public void sound() {
        System.out.println("Anjing Mengongong");
    }
}

public class DynamicPolymorphism {
    public static void main(String[] args) {
        
        Hewan Hewan1 = new Kucing();
        Hewan1.sound();

        Hewan Hewan2 = new Anjing();
        Hewan2.sound();
    }
}



