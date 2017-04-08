package cs4r.katas.primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static cs4r.katas.primefactors.PrimeFactors.generate;
import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {

    private List<Integer> list(int... ints) {
        List<Integer> list = new ArrayList<>();
        for (int i : ints)
            list.add(i);
        return list;
    }

    @Test
    public void testOne() {
        assertEquals(list(), generate(1));
    }

    @Test
    public void testTwo() {
        assertEquals(list(2), generate(2));
    }

    @Test
    public void testThree() {
        assertEquals(list(3), generate(3));
    }

    @Test
    public void testFour() {
        assertEquals(list(2, 2), generate(4));
    }

    @Test
    public void testSix() {
        assertEquals(list(2, 3), generate(6));
    }

    @Test
    public void testEigth() {
        assertEquals(list(2, 2, 2), generate(8));
    }

    @Test
    public void testNine() {
        assertEquals(list(3, 3), generate(9));
    }

    @Test
    public void testTen() {
        assertEquals(list(2, 5), generate(10));
    }


}
