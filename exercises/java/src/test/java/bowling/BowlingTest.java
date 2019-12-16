package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {
    public Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @Test
    public void scoreWhenRollsAllEqualZero() {

        int[] rolls = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};

        Assertions.assertThat(game.score(rolls)).isEqualTo(0);
    }

    @Test
    public void scoreWhenRollsAllEqualOne() {

        int[] rolls = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(20);
    }

    @Test
    public void scoreWhenRollsContainsOneSpare() {

        int[] rolls = {1,1, 7,3, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(29);
    }

    @Test
    public void scoreWhenRollsContainsTwoSpares() {

        int[] rolls = {1,1, 7,3, 1,1, 1,1, 1,1, 7,3, 1,1, 1,1, 1,1, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(20);
    }
}
