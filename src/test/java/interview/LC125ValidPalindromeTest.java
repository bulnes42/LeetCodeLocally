package interview;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC125ValidPalindrome;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LC125ValidPalindromeTest {
    private LC125ValidPalindrome program;

    @BeforeMethod
    public void setUp() {
        program = new LC125ValidPalindrome();
    }


    @Test
    public void testIsPalindromeNaiveTrue() {
        assertThat(program.isPalindromeNaive(new String("A man, a plan, a canal: Panama"))).isEqualTo(true);
    }

    @Test
    public void testIsPalindromeNaiveEmptyStriing() {
        assertThat(program.isPalindromeNaive(new String(" "))).isEqualTo(true);
    }

    @Test
    public void testIsPalindromeNaiveFalse() {
        assertThat(program.isPalindromeNaive(new String("race a car"))).isEqualTo(false);
    }
}