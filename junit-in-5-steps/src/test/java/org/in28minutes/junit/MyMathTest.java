package org.in28minutes.junit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyMathTest {
    public MyMath math=new MyMath();
    @Test
    public void calculateSum_FiveMemberArray() {

        assertEquals(15, math.calculateSum(new int[]{1, 2, 3, 4, 5}));
    }
    @Test
    public void calculateSum_ZeroLengthArray() {

        assertEquals(0, math.calculateSum(new int[]{}));
    }


}