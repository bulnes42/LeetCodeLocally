package interview;
import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC125ValidPalindrome;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LC125ValidPalindromeTest {
    private LC125ValidPalindrome program;

    @BeforeMethod
    public void setUp() {
        program = new LC125ValidPalindrome();
    }


    @Test
    public void testIsPalindromeNaiveTrue() {
        assertThat(program.isPalindromeNaive("A man, a plan, a canal: Panama")).isEqualTo(true);
    }

    @Test
    public void testIsPalindromeNaiveEmptyString() {
        assertThat(program.isPalindromeNaive(" ")).isEqualTo(true);
    }

    @Test
    public void testIsPalindromeNaiveFalse() {
        assertThat(program.isPalindromeNaive("race a car")).isEqualTo(false);
    }
}