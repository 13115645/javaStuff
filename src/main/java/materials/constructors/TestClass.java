package materials.constructors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestClass {
    public static final Logger LOG = LoggerFactory.getLogger(TestClass.class);
    ClassWithAConstructor classWithAConstructor = new ClassWithAConstructor("lol");

    public static void main (String args[]) {
        ForcingConsistancy forcingConsistancy = new ForcingConsistancy("first","last");
        LOG.info(forcingConsistancy.getFirstName());
        LOG.info(forcingConsistancy.getLastName());

        forcingConsistancy.setFirstName("changed first name");
        forcingConsistancy.setLastName("altered last name");
        LOG.info(forcingConsistancy.getFirstName());
        LOG.info(forcingConsistancy.getLastName());
    }


}
