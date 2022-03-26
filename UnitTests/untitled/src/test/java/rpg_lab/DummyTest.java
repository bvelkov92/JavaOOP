package rpg_lab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    @Test
    public void testDummyLoseHealthWhenWillBeAttacked(){
        Dummy dummy = new Dummy(10,10);
        int attackPoint = 1;
        int attackPoints =dummy.getHealth() - attackPoint;
        dummy.takeAttack(attackPoint);

        Assert.assertEquals(attackPoints, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDummyThrowWhenIsDead(){
        Dummy dummy = new Dummy(0,10);
        int attackPoints = 1;
        dummy.takeAttack(attackPoints);
    }

      @Test
      public void testGiveXPWhenDummyIsDead(){
        Dummy dummy = new Dummy(0,10);
        int expirience = dummy.giveExperience();
        Assert.assertEquals(10, expirience);

      }
      @Test(expected = IllegalStateException.class)
      public void  testThrowWhenDummyIsNotDeadMethodGiveXP(){
        Dummy dummy =new Dummy(10,10);
        dummy.giveExperience();
      }

    @Test(expected = IllegalStateException.class)
    public void testThrowExeptionWhenDummyIsDead() {
        Axe axe = new Axe(20,10);
        Dummy dummy = new Dummy(0,10);
        dummy.takeAttack(20);
    }
}