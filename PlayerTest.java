import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        Player player = new Player(100, 10, 5);
        assertEquals(100, player.getHealth());
        assertTrue(player.isAlive());
    }

    @Test
    public void testPlayerAttackAndDefend() {
        Player player1 = new Player(100, 10, 5);
        Player player2 = new Player(100, 10, 5);
        player1.attack(player2);
        assertTrue(player2.getHealth() < 100);
    }
}
