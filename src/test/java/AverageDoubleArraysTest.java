import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageDoubleArraysTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void count() {
        AverageDoubleArrays dArr = new AverageDoubleArrays();
        double[] arr = {2,8};
        double expected = 2;
        assertEquals(expected, dArr.count(arr));
    }

    @Test
    void sum() {
        AverageDoubleArrays dArr = new AverageDoubleArrays();
        double[] arr = {2,8};
        double expected = 10;
        assertEquals(expected,dArr.sum(arr));
    }

    @Test
    void average() {
        AverageDoubleArrays dArr = new AverageDoubleArrays();
        double[] arr = {2,8};
        double expected = 5.0;
        assertEquals(expected,dArr.average(arr));
    }
}