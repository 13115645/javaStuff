package materials.java8.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class lambda {
    private static final Logger LOG = LoggerFactory.getLogger(lambda.class);

    public void testingLambdaOnMap() {
        Map<String,String> myMap = new HashMap<>();
        myMap.put("firstName","Yasiru");
        myMap.put("lastName","Dahanayake");

        String randomString;

        myMap.forEach( (key,value) -> {

            LOG.info("key is " + key);
            LOG.info("Value is " + value);
        });
    }

    /**
     *
     *
     * @param gender gender of the person
     * @param age age of the person
     * @return returns a map of the persons age and gender
     */

    public Map<String, Integer> setGenderAndAge(String gender, Integer age){

        Map<String,Integer> genderAndAge = new HashMap<String, Integer>(){
            {
                if (gender.equals("male") || ("female").equals(gender)) {
                    put(gender, age);
                }
                else
                {
                    LOG.info("invalid type gender of " + gender);
                }
            }
        };

        return genderAndAge;
    }

    @Test
    public void testingLambdaOnMultiMap() {
        Map<String,Map<String,Integer>> mapOfPeople= new HashMap<>();


        mapOfPeople.put("yasiru",setGenderAndAge("male",25));
        mapOfPeople.put("randomperson",setGenderAndAge("male",27));
        mapOfPeople.put("invalidPerson", setGenderAndAge("invalid",28));

        mapOfPeople.forEach((name, mapOfGenderAndAge) -> {
                mapOfGenderAndAge.forEach((gender,age) -> {
                    LOG.info("person with name " + name + " has an gender of " + gender + " and an age of " + age);
                });
        });

    }

}
