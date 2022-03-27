package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleTest {


    @Test
    public void testSorting(){
        int [] arr = {2,4,3,1,5};
        Bubble.sort(arr);

        int [] arr2 = {1,5,3,2,4};
        Bubble.sort(arr2);
        Assert.assertArrayEquals(arr,arr2);
    }

}