package ml.pevgen.algo.hackerrank.w1.d3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TowerBreakersTest {

    private TowerBreakers towerBreakers;

    @BeforeEach
    void setUp() {
        towerBreakers = new TowerBreakers();
    }

    @Test
    void should_win_player_1_if_tower_number_1() {
        assertEquals(1, towerBreakers.towerBreakers(1, 100));
    }

    @Test
    void should_win_player_2_if_tower_height_1() {
        assertEquals(2, towerBreakers.towerBreakers(11, 1));
        assertEquals(2, towerBreakers.towerBreakers(10, 1));
    }

    @Test
    void should_win_player_2_if_tower_number_even() {
        assertEquals(2, towerBreakers.towerBreakers(2, 10));
        assertEquals(2, towerBreakers.towerBreakers(2, 11));
    }

    @Test
    void should_win_player_1_if_tower_number_odd() {
        assertEquals(1, towerBreakers.towerBreakers(3, 10));
        assertEquals(1, towerBreakers.towerBreakers(3, 11));
    }

    @Test
    void should_check_example() {
        assertEquals(2, towerBreakers.towerBreakers(2, 2));
        assertEquals(1, towerBreakers.towerBreakers(1, 4));
    }

}