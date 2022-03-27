package p01_Database;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private static final Integer[] TEST_ARRAY_NUMBERS = {2,3,4,5,6,7};
    public   Database database;

    public DatabaseTest() throws OperationNotSupportedException {
            database=new Database(TEST_ARRAY_NUMBERS);

    }

    @Test
    public void testCreateNewBase(){

        Integer[] testArray = database.getElements();

        Assert.assertArrayEquals(testArray, TEST_ARRAY_NUMBERS);
        Assert.assertEquals(testArray.length,database.getElements().length);
        for (int i = 0; i < database.getElements().length; i++) {
            Assert.assertEquals(testArray[i],database.getElements()[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenElementsIsMoreOf16() throws OperationNotSupportedException {
        Integer [] array = new Integer[17];
        new Database(array);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenElementsAreLessThan1() throws OperationNotSupportedException {
        Integer [] array = new Integer[0];
        new Database(array);
    }
// Test Add Elements
    @Test
    public void testAddSuccesfullNewNumber() throws OperationNotSupportedException {
        database.add(232);
        Integer [] testArray = database.getElements();
        Assert.assertEquals(testArray[testArray.length-1],database.getElements()[database.getElements().length-1]);
        Assert.assertArrayEquals(testArray,database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testArrayThrowWhenElementForAddingIsNULL() throws OperationNotSupportedException {
        Integer number = null;
        database.add(number);
    }

    @Test
    public void testRemoveSuccesfullElementFromArray() throws OperationNotSupportedException {
        int startLenght = database.getElements().length;
        database.remove();
        int lenghtAfterRemove = database.getElements().length;
        Integer[] testArray = database.getElements();
        Assert.assertArrayEquals(testArray,database.getElements());
        Assert.assertEquals(startLenght-1,lenghtAfterRemove);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testThrowWhenRemoveUnexistingElement() throws OperationNotSupportedException {
        for (int i = 0; i <= database.getElements().length; i++) {
            database.remove();
            i--;
        }
    }

}