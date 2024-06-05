package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Constant;
import edu.austral.ingsis.math.operation.*;
import edu.austral.ingsis.math.operation.Module;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionTest {

  MathEngine mathEngine = new MathEngine();


  /** Case 1 + 6 */
  @Test
  public void shouldResolveSimpleFunction1() {


      Function firstConstant = new Constant(1);
      Function secondConstant = new Constant(6);

      Function sum = new Sum(firstConstant, secondConstant);


    mathEngine.setFunction(sum);


    Double mathEngineResult = mathEngine.evaluateFunction();

    final Double result = 7d;

    assertThat(result, equalTo(mathEngineResult));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldResolveSimpleFunction2() {
      Function firstConstant = new Constant(12);

      Function secondConstant = new Constant(2);

      Function division = new Division(firstConstant, secondConstant);

      mathEngine.setFunction(division);
      Double mathEngineResult = mathEngine.evaluateFunction();


    final Double result = 6d;

    assertThat(result, equalTo(mathEngineResult));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldResolveSimpleFunction3() {

      Function firstConstant = new Constant(9);

      Function secondConstant = new Constant(2);

      Function division = new Division(firstConstant, secondConstant);

      Function parenthesis = new Parenthesis(division);

      Function three = new Constant(3);

      Function product = new Product(parenthesis, three);

      mathEngine.setFunction(product);

    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(13.5d));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldResolveSimpleFunction4() {


      Function firstConstant = new Constant(27);
      Function six = new Constant(6);

      Function division = new Division(firstConstant, six);

      Function parenthesis = new Parenthesis(division);

      Function two = new Constant(2);

      Function power = new Power(parenthesis, two);

      mathEngine.setFunction(power);

    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(20.25d));
  }

  /** Case 36 ^ (1/2) */
  @Test
  public void shouldResolveSimpleFunction5() {

      Function firstConstant = new Constant(36);


      Function one  = new Constant(1);
      Function two = new Constant(2);

      Function division = new Division(one, two);
      Function parenthesis = new Parenthesis(division);

      Function power = new Power(firstConstant, parenthesis);

      mathEngine.setFunction(power);
    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(6d));
  }

  /** Case |136| */
  @Test
  public void shouldResolveSimpleFunction6() {
      Function firstConstant = new Constant(136);

      Function module = new Module(firstConstant);


      mathEngine.setFunction(module);






    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(136d));
  }

  /** Case |-136| */
  @Test
  public void shouldResolveSimpleFunction7() {

      Function firstConstant = new Constant(-136);

      Function module = new Module(firstConstant);

      mathEngine.setFunction(module);


    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(136d));
  }

  /** Case (5 - 5) * 8 */
  @Test
  public void shouldResolveSimpleFunction8() {

      Function firstFive = new Constant(5);
      Function secondFive = new Constant(5);

      Function sub = new Subtraction(firstFive, secondFive);

      Function parenthesis = new Parenthesis(sub);

      Function eight = new Constant(8);

      Function product = new Product(parenthesis, eight);

      mathEngine.setFunction(product);
      

    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(0d));
  }
}
