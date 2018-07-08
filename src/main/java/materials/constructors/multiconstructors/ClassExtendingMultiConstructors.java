package materials.constructors.multiconstructors;

public class ClassExtendingMultiConstructors extends MultiConstructers{
    public ClassExtendingMultiConstructors(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public ClassExtendingMultiConstructors(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }
}
