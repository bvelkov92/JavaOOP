package rpg_lab;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {

    @Before
    public void createObjectsToTests(){}
    Axe axe = new Axe(10,1);
    Dummy dummy = new Dummy(10,10);
    @Test
    public void testAxeLoseDurabilityAfterAttack(){
             axe.attack(dummy);
        Assert.assertEquals(0,axe.getDurabilityPoints());
    }

@Test(expected = IllegalStateException.class)
    public void testAttackThrowAttackedWithBrokenWeapon(){
        Axe axe1 =new Axe(10,0);

        axe1.attack(dummy);
}

    @Test
    public void testAxeGettingInsertedAttackPoints(){
        int attackPoints = axe.getAttackPoints();

        Assert.assertEquals(attackPoints,axe.getAttackPoints());
    }

}