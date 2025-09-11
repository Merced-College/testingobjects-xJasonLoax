// Jason Loa
// 9/11/25
// Create Bird class, choose 3 variables

public class Bird {

    // Describes the bird, data variables
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Bird () {
        this.name = "Piff";
        this.age = 4;
        this.breed = "Budgie";
    }

    // Constructor 2
    public Bird (String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    // setters / accessors
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // getters / mutators
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + breed + ", ";
    }
} // end of bird class
