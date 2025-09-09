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


    } // end main
} // end class