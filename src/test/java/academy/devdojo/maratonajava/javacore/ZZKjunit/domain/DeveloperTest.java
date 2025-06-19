package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {


    @Test
    public void instanceOf_ExecutesChildClassMethod_WhenObjectsIsOfChildType(){
        Employee employee = new Developer("1","Java");
        if (employee instanceof Developer dev){
            assertEquals("Java", dev.getMainLanguage());
        }
    }

}