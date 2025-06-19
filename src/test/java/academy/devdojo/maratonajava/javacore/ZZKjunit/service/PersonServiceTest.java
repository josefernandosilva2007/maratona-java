package academy.devdojo.maratonajava.javacore.ZZKjunit.service;

import academy.devdojo.maratonajava.javacore.ZZKjunit.domain.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private Person adult;
    private Person notAdult;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(17);
    }

    @Test
    void isAdult_ReturnFalse_WhenAgeIsLowerThan18() {
        assertFalse(PersonService.isAdult(notAdult));
    }
    @Test
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEquals18() {
        assertTrue(PersonService.isAdult(adult));
    }
    @Test
    void isAdult_ThrowException_WhenPersonIsNull() {
        assertThrows(NullPointerException.class, () -> PersonService.isAdult(null));
    }

    @Test
    void filterRemovingNotAdult_ReturnListOnlyAdult_WhenListOfPersonWithAdultIsPassed() {
        Person p1 = new Person(17);
        Person p2 = new Person(18);
        Person p3 = new Person(21);
        List<Person> personList = List.of(p1, p2, p3);
        assertEquals(2, PersonService.filterRemovingNotAdult(personList).size());
    }
}