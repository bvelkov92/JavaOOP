package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {
    private Hero hero;
    @Before
    public void createHero(){
        this.hero = new Hero("Georgi");
    }

                                                    //Test Without MOKITO//
//
//    @Test
//    public void testHeroGetExpirienceWhenKillDummy() {
//    Dummy dummy = new Dummy(10,10);
//    hero.attack(dummy);
//    Assert.assertEquals(10,hero.getExperience());
//    }
//
       @Test
       public void testSuccesfulyGetName() {

           String name = hero.getName();
           Assert.assertEquals(name,hero.getName());
       }
//
//    @Test
//    public void getExperience() {
//        Hero hero = new Hero("Georgi");
//        int XP = hero.getExperience();
//        Assert.assertEquals(XP,hero.getExperience());
//    }
//
        @Test
        public void testSuccesfullyGetWeapon() {
         Hero hero = new Hero("Georgi");
         Axe axe = hero.getWeapon();

         Assert.assertEquals(axe,hero.getWeapon());
        }


                                        // HeroTest With Mokkito

    @Test
    public void testHeroGainXPWhenTargetIsDead(){
        final String START_NAME = "Georgi";
        final  int XP = 10;
        Weapon weaponMock = Mockito.mock(Weapon.class);
        Target targetMock = Mockito.mock(Target.class);
        Mockito.when(targetMock.isDead()).thenReturn(true);
        Mockito.when(targetMock.giveExperience()).thenReturn(XP);
        Hero hero = new Hero(START_NAME);
        hero.attack(targetMock);
        Assert.assertEquals(XP,hero.getExperience());
    }
}