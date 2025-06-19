package academy.devdojo.maratonajava.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MangaTest {
    private Manga manga1;
    private Manga manga2;
    @BeforeEach
    void setUp() {
        manga1 = new Manga("Attack on Titan", 64);
        manga2 = new Manga("Attack on Titan", 64);
    }

    @Test
    public void accessors_ReturnData_WhenInitialized(){
        assertEquals("Attack on Titan", manga1.name());
        assertEquals(64, manga1.episodes());
    }
    @Test
    public void equals_ReturnTrue_WhenObjectsAreTheSame(){
        assertEquals(manga1, manga2);
    }
    @Test
    public void hashCode_ReturnTrue_WhenObjectsAreTheSame(){
        assertEquals(manga1.hashCode(), manga2.hashCode());
    }
}