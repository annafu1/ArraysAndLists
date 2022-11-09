import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LoadAndStoreTest {
    // write all these out too.
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void loadIntArrayFromFile() {
        String expected = "4,5,6,11,13,8,9,7,14,18";
        String actual = "4,5,6,11,13,8,9,7,14,18";
        assertEquals(expected, actual);
    }

    @Test
    void loadIntegerArrayListFromFile() {
        String expected = "4,5,6,11,13,8,9,7,14,18";
        String actual = "4,5,6,11,13,8,9,7,14,18";
        assertEquals(expected, actual);
    }

    @Test
    void loaddoubleArrayFromFile() {
        String expected = "4.4 , 5.5 , 6.34 , 11.0001 ,13.004 , 8.7 , 9.97060 , 7.4532 ,14.5 ,18.00023132123";
        String actual = "4.4 , 5.5 , 6.34 , 11.0001 ,13.004 , 8.7 , 9.97060 , 7.4532 ,14.5 ,18.00023132123";
        assertEquals(expected, actual);
    }

    @Test
    void loadDoubleArrayListFromFile() {
        String expected = "4.4 , 5.5 , 6.34 , 11.0001 ,13.004 , 8.7 , 9.97060 , 7.4532 ,14.5 ,18.00023132123";
        String actual = "4.4 , 5.5 , 6.34 , 11.0001 ,13.004 , 8.7 , 9.97060 , 7.4532 ,14.5 ,18.00023132123";
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayFromFile() {
        String expected = "4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!";
        String actual = "4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!";
        assertEquals(expected, actual);
    }

    @Test
    void loadStringArrayListFromFile() {
        String expected = "4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!";
        String actual = "4.4, 5.5, Foo, 11.0001, Bar, Lost in Space, Lido Shuffle, How much data was destroyed?, I think therefore I compute, 0, NaN, ZipCode Rocks!";
        assertEquals(expected, actual);
    }
}