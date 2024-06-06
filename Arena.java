public class Arena {
    private Player player1;
    private Player player2;

    public Arena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startFight() {
        while (player1.isAlive() && player2.isAlive()) {
            if (player1.getHealth() <= player2.getHealth()) {
                player1.attack(player2);
            } else {
                player2.attack(player1);
            }
            printStatus();
        }
        System.out.println("Game Over!");
        if (player1.isAlive()) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }

    private void printStatus() {
        System.out.println("Player 1 Health: " + player1.getHealth());
        System.out.println("Player 2 Health: " + player2.getHealth());
    }
}
