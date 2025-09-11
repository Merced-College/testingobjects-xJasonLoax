public class ObjectTester { 

    public static void main(String[] args) {

        // made a Dog object - instantiation
        Dog dog1 = new Dog();
        System.out.println(dog1);

        // made a Dog object - Non default constructor
        Dog dog2 = new Dog("Putty", 14, "Chihuahua");
        System.out.println(dog2);  
        
        dog2.setName("Paul");
        System.out.println(dog2);

        // only print dog's name
        System.out.println(dog2.getName());

        // make a Bird object, instantiation
        Bird bird1 = new Bird();
        System.out.println(bird1);

        // make a Bird object
        Bird bird2 = new Bird("Papillon", 2, "Shoebill");
        System.out.println(bird2);

        bird2.setBreed("Cockatiel");
        System.out.println(bird2);
        
        // Print just the name of bird2
        System.out.println(bird2.getName());

    } // end main
} // end class