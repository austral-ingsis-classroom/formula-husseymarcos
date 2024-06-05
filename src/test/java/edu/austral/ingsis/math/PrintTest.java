package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Constant;
import edu.austral.ingsis.math.operation.Division;
import edu.austral.ingsis.math.operation.Parenthesis;
import edu.austral.ingsis.math.operation.Product;
import edu.austral.ingsis.math.operation.Sum;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrintTest {

  MathEngine mathEngine = new MathEngine();


  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {

      Function firstConstant = new Constant(1);

      Function secondConstant = new Constant(6);


    Function sum = new Sum(firstConstant, secondConstant);


    mathEngine.setFunction(sum);

    final String expected = "1 + 6";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {

      Function firstConstant = new Constant(12);

      Function secondConstant = new Constant(2);

      Function division = new Division(firstConstant, secondConstant);

      mathEngine.setFunction(division);



    final String expected = "12 / 2";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {


      Function firstConstant = new Constant(9);
      Function secondConstant = new Constant(2);

      Function division = new Division(firstConstant, secondConstant);

      Function parenthesisDivision = new Parenthesis(division);


      Function thirdConstant = new Constant(3);

      Function multiplication = new Product(parenthesisDivision, thirdConstant);

      mathEngine.setFunction(multiplication);

    final String expected = "(9 / 2) * 3";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "(27 / 6) ^ 2";
    final String result = expected;

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    final String expected = "|value| - 8";
    final String result = expected;

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    final String expected = "|value| - 8";
    final String result = expected;

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "(5 - i) * 8";
    final String result = expected;

    assertThat(result, equalTo(expected));
  }
}
