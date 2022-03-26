package rpg_lab;

public interface Target {

    void takeAttack(int attackPoints);
    int giveExperience();
    boolean isDead();
}
