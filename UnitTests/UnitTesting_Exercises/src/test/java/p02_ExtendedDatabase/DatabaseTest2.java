package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest2 {

    private static final Person[] PERSONS = {new Person(1,"Gosho"), new Person(2,"Richi")};
    public Database basePersons;

    public DatabaseTest2() throws OperationNotSupportedException {
        basePersons =new Database(PERSONS);

    }

    @Test
    public void testCreateNewBase(){

        Person[] testArray = basePersons.getElements();

        Assert.assertArrayEquals(testArray, PERSONS);
        Assert.assertEquals(testArray.length, basePersons.getElements().length);
        for (int i = 0; i < basePersons.getElements().length; i++) {
            Assert.assertEquals(testArray[i], basePersons.getElements()[i]);
        }
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenElementsIsMoreOf16() throws OperationNotSupportedException {
        Person [] array = new Person[17];
        new Database(array);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowWhenElementsAreLessThan1() throws OperationNotSupportedException {
        Person [] array = new Person[0];
        new Database(array);
    }
    // Test Add Elements
    @Test
    public void testAddSuccesfullNewPerson() throws OperationNotSupportedException {
        basePersons.add(new Person(5,"Kurti"));
        Person [] testArray = basePersons.getElements();
        Assert.assertEquals(testArray[testArray.length-1].getId(), basePersons.getElements()[basePersons.getElements().length-1].getId());
        Assert.assertArrayEquals(testArray, basePersons.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testArrayThrowWhenElementForAddingIsNULL() throws OperationNotSupportedException {
        Person person = null;
        basePersons.add(person);
    }

    @Test
    public void testRemoveSuccesfullElementFromArray() throws OperationNotSupportedException {
        int startLenght = basePersons.getElements().length;
        basePersons.remove();
        int lenghtAfterRemove = basePersons.getElements().length;
        Person[] testArray = basePersons.getElements();
        Assert.assertArrayEquals(testArray, basePersons.getElements());
        Assert.assertEquals(startLenght-1,lenghtAfterRemove);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void testThrowWhenRemoveUnexistingElement() throws OperationNotSupportedException {
        for (int i = 0; i <= basePersons.getElements().length; i++) {
            basePersons.remove();
            i--;
        }
    }

        @Test
    public void testFindUserByUserName() throws OperationNotSupportedException {
        String name = "Gosho";
        basePersons.findByUsername(name);
        Assert.assertTrue(true);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testThrowIfNameValueIsNULL() throws OperationNotSupportedException {
        String name = null;
        basePersons.findByUsername(name);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testThrowIfNameIsNotFinded() throws OperationNotSupportedException {
        String nameToFind = "Rimcho";
        basePersons.findByUsername(nameToFind);
    }


    @Test
    public void testFindUserById() throws OperationNotSupportedException {
        int id = 1;
        basePersons.findById(id);
        Assert.assertTrue(true);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testThrowIfIdIsNULL() throws OperationNotSupportedException {
        new Database();
        basePersons.findById(5);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void testThrowIfIdIsNotFinded() throws OperationNotSupportedException {
        int id = 50;
        basePersons.findById(id);
    }

    }
