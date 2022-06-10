package interview;

import static org.assertj.core.api.Assertions.assertThat;

import interview.java.exercises.LC20ValidParentheses;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test()
public class LC20ValidParenthesesTest {
    private LC20ValidParentheses program;

    @BeforeMethod
    public void setUp() {program = new LC20ValidParentheses();}

    @Test(enabled = true)
    public void parens() {assertThat(program.isValid("()")).isEqualTo(true);}
    public void mixedParensBracket() {assertThat(program.isValid("(]")).isEqualTo(false);}
    public void mixedParensBrace() {assertThat(program.isValid("(}")).isEqualTo(false);}
    public void bracket() {assertThat(program.isValid("[]")).isEqualTo(true);}
    public void mixedBracketParens() {assertThat(program.isValid("[)")).isEqualTo(false);}
    public void mixedBracketBraces() {assertThat(program.isValid("[}")).isEqualTo(false);}
    public void mixedLongValidBracketBraces() {assertThat(program.isValid("{{}[][[[]]]}")).isEqualTo(true);}
    public void parensOutOfOrder() {assertThat(program.isValid(")(")).isEqualTo(false);}
}
