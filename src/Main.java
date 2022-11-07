public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("Peluche");
        dog.setAge(8);
        animalPrinter.printAnimal(dog);

        Horse horse = new Horse();
        horse.setName("Carlos");
        horse.setAge(2);
        animalPrinter.printAnimal(horse);

        Whale whale = new Whale();
        whale.setName("Paula");
        whale.setAge(3);
        animalPrinter.printAnimal(whale);
    }
}