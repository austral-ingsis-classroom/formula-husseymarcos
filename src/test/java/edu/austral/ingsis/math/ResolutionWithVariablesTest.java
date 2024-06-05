package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Constant;
import edu.austral.ingsis.math.operation.*;
import edu.austral.ingsis.math.expression.Variable;
import edu.austral.ingsis.math.operation.Module;
import org.junit.jupiter.api.Test;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionWithVariablesTest {

  MathEngine mathEngine = new MathEngine();

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {

      Function one = new Constant(1);
      Function x = new Variable("x", 3);

      Function sum = new Sum(one, x);

      mathEngine.setFunction(sum);


    Double mathEngineResult = mathEngine.evaluateFunction();

    final Double result = 4d;

    assertThat(result, equalTo(mathEngineResult));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {

      Function one = new Constant(12);

      Function div = new Variable("div", 4);

      Function division = new Division(one, div);
      mathEngine.setFunction(division);



    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {

      Function nine = new Constant(9);
      Function x = new Variable("x", 3);
      Function y = new Variable("y", 4);

      Function div = new Division(nine, x);
      Function parenthesis = new Parenthesis(div);

      Function product = new Product(parenthesis, y);

      mathEngine.setFunction(product);


    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
      Function constant = new Constant(27);
      Function a =  new Variable("a", 9);

      Function division = new Division(constant, a);
      Function parenthesis = new Parenthesis(division);
      Function b = new Variable("b", 3);
      Function power = new Power(parenthesis, b);

      mathEngine.setFunction(power);


    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
      Function one = new Constant(1);
      Function two = new Constant(2);

      Function z = new Variable("z", 36);

      Function division = new Division(one, two);
      Function parenthesis = new Parenthesis(division);

      Function power = new Power(z, parenthesis);

      mathEngine.setFunction(power);


    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {

      Function value = new Variable("value", 8);
      Function module = new Module(value);
      Function eight = new Constant(8);

      Function sub = new Subtraction(module, eight);

      mathEngine.setFunction(sub);

    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
      Function value = new Variable("value", 8);
      Function module = new Module(value);
      Function eight = new Constant(8);

      Function sub = new Subtraction(module, eight);

      mathEngine.setFunction(sub);

      final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {

      Function five = new Constant(5);
      Function eight = new Constant(8);

      Function i = new Variable("i", 2);

      Function sub = new Subtraction(five, i);
      Function parenthesis = new Parenthesis(sub);

      Function product = new Product(parenthesis, eight);

      mathEngine.setFunction(product);


    final Double result = mathEngine.evaluateFunction();

    assertThat(result, equalTo(24d));
  }
}
