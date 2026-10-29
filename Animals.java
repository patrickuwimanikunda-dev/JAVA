public class Animals {
    public static void main(String[] args) {
        Animal[] pets = {new Dog("Rex"), new Cat("Tom"), new Animal("Generic"), new Bird("Pigeon")};
        for (Animal p : pets) {
            p.speak();
        }
    }
}
