public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Rocky", "German Shepherd");

        dog1.setName("Charlie");
        dog2.setBreed("Bulldog");

        dog1.printInfo();
        dog2.printInfo();
    }
}

