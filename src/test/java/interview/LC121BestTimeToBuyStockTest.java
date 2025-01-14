package interview;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC121BestTimeToBuyStock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC121BestTimeToBuyStockTest {

    private LC121BestTimeToBuyStock program;

    @BeforeMethod
    public void setUp() { program = new LC121BestTimeToBuyStock();
    }

    @Test
    public void testMaxProfit() {
        assertThat(program.maxProfit(new int[]{7, 1, 5, 3, 6, 4})).isEqualTo(5);
    }
    @Test
    public void noProfit() {
        assertThat(program.maxProfit(new int[]{7, 6, 4, 3, 1})).isEqualTo(0);
    }
    @Test
    public void mixedProfit() {
        assertThat(program.maxProfit(new int[]{3, 6, 5, 2, 1})).isEqualTo(3);
    }
}