public class Main {
    public static void main(String[] args) {
        AnimalPrinter animalPrinter = new AnimalPrinter();

        Dog dog = new Dog();
        dog.setName("Peluche");
        dog.setAge(8);
        animalPrinter.printAnimals(dog);

        Horse horse = new Horse();
        horse.setName("Carlos");
        horse.setAge(2);
        animalPrinter.printAnimals(horse);

        Whale whale = new Whale();
        whale.setName("Paula");
        whale.setAge(3);
        animalPrinter.printAnimals(whale);
    }
}