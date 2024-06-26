public abstract class Animal {
    abstract void sound();
    abstract void move();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Woof");
    }

    @Override
    void move() {
        System.out.println("Wheeef");
    }
}

class Bird extends Animal {

    @Override
    void sound() {
        System.out.println("Jum Jum");
    }

    @Override
    void move() {
        System.out.println("Pheb Pheb");
    }
}

class Main2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();
        d.sound();
        d.move();
        b.move();
        b.sound();
    }
}