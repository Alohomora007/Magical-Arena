public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Player opponent) {
        int attackRoll = rollDie();
        int defendRoll = rollDie();
        int damage = (attack * attackRoll) - (opponent.strength * defendRoll);
        if (damage > 0) {
            opponent.defend(damage);
        }
    }

    public void defend(int damage) {
        health -= damage;
    }

    public int getHealth() {
        return health;
    }

    private int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }
}
