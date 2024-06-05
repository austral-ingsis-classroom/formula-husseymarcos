package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Constant;
import edu.austral.ingsis.math.expression.Variable;
import edu.austral.ingsis.math.operation.*;
import edu.austral.ingsis.math.operation.Module;
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

      Function firstConstant = new Constant(27);
      Function secondConstant = new Constant(6);

      Function division = new Division(firstConstant, secondConstant);

      Function parenthesisDivision = new Parenthesis(division);

      Function thirdConstant = new Constant(2);

      Function power = new Power(parenthesisDivision, thirdConstant);

      mathEngine.setFunction(power);


    final String expected = "(27 / 6) ^ 2";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {

      Function value = new Variable("value", 1);

      Function moduleValue = new Module(value);

      Function eight = new Constant(8);

      Function sub = new Subtraction(moduleValue, eight);

      mathEngine.setFunction(sub);


    final String expected = "|value| - 8";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {

      Function value = new Variable("value", 1);

      Function moduleValue = new Module(value);

      Function eight = new Constant(8);

      Function sub = new Subtraction(moduleValue, eight);

      mathEngine.setFunction(sub);
    final String expected = "|value| - 8";
      final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {

      Function five = new Constant(5);

      Function value = new Variable("i", 1);

      Function sub = new Subtraction(five, value);

      Function parenthesis = new Parenthesis(sub);

      Function eight = new Constant(8);

      Function product = new Product(parenthesis, eight);

      mathEngine.setFunction(product);


    final String expected = "(5 - i) * 8";
    final String result = mathEngine.getFunctionString();

    assertThat(result, equalTo(expected));
  }
}
