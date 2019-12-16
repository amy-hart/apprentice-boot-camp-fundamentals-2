package bowling;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class BowlingTest {
    public Game game;

    @Before
    public void setup() {
        game = new Game();
    }

    @Test
    public void convertRollsToFramesWithNoStrikes() {

    }

    @Test
    public void convertRollsToFramesWithOneStrike() {

    }

    @Test
    public void convertRollsToFramesWithTwoStrikes() {

    }

    @Test
    public void convertRollsToFramesWithBackToBackStrikes() {

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

        Assertions.assertThat(game.score(rolls)).isEqualTo(38);
    }

    @Test
    public void scoreWhenRollsContainsTwoSparesBackToBack() {

        int[] rolls = {7,3, 7,3, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(44);
    }

    @Test
    public void scoreWhenRollsContainsOneStrike() {

        int[] rolls = {1,1, 10, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(30);
    }

    @Test
    public void scoreWhenRollsContainsOneStrikeInLastFrame() {

        int[] rolls = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 10, 1,1};

        Assertions.assertThat(game.score(rolls)).isEqualTo(30);
    }
}
