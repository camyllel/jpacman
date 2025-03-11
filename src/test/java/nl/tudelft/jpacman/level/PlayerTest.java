package nl.tudelft.jpacman.level;

import nl.tudelft.jpacman.sprite.PacManSprites;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    private Player player;
    private PlayerFactory playerFactory;

    @BeforeEach
    void setUp() {
        PacManSprites sprites = new PacManSprites();
        playerFactory = new PlayerFactory(sprites);
        player = playerFactory.createPacMan();
    }

    @Test
    void testIsAliveInitially() {
        assertTrue(player.isAlive(), "Player should be alive initially.");
    }

    @Test
    void testIsAliveStateChange() {
        player.setAlive(false);
        assertFalse(player.isAlive(), "Player should not be alive after setting alive to false.");

        player.setAlive(true);
        assertTrue(player.isAlive(), "Player should be alive after setting alive back to true.");
    }

    /*@Test
    void testSetAlive() {
        player.setAlive(false);
        assertFalse(player.isAlive(), "Player should not be alive after setAlive(false).");

        player.setAlive(true);
        assertTrue(player.isAlive(), "Player should be alive after setAlive(true).");
    }*/
}
