package materials.constructors.multiconstructors;

public class MultiConstructers {

    private String firstName;
    private String lastName;
    private int age;

    public MultiConstructers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public MultiConstructers (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

}
