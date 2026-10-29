class Animal {
    private String name;

    Animal(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void speak() {
        System.out.println(name + " makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(getName() + " says Woof");
    }

    void fetch() {
        System.out.println(getName() + " fetches the ball");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println(getName() + " says Meow");
    }
}
 class Bird extends Animal {
        Bird(String name) {
            super(name);
        }

        @Override
        void speak() {
            System.out.println(getName() + " sings");
        }
    }