package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.*;
import edu.austral.ingsis.math.operation.*;
import edu.austral.ingsis.math.operation.Module;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import java.util.List;

public class ListVariablesTest {

  MathEngine mathEngine = new MathEngine();

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {

    Function firstConstant = new Constant(1);
    Function secondConstant = new Constant(6);

    Function sum = new Sum(firstConstant, secondConstant);


    final List<String> result = mathEngine.collectVariablesRecursive(sum);

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {

    Function firstConstant = new Constant(12);
    Function div = new Variable("div", 10);

    Function division = new Division(firstConstant, div);

    final List<String> result = mathEngine.collectVariablesRecursive(division);

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {

    Function firstConstant = new Constant(9);

    Function x = new Variable("x", 10);

    Function y = new Variable("y", 10);

    Function div = new Division(firstConstant, x);

    Function product = new Product(y, div);


    final List<String> result = mathEngine.collectVariablesRecursive(product);

    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    Function twentySeven = new Constant(27);

    Function a = new Variable("a", 10);

    Function division = new Division(twentySeven, a);

    Function b = new Variable("b", 10);

    Function power = new Power(division, b);


    final List<String> result = mathEngine.collectVariablesRecursive(power);

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {

    Function z = new Variable("z", 10);

    Function one = new Constant(1);
    Function two = new Constant(2);

    Function division = new Division(one, two);

    Function parenthesis = new Parenthesis(division);

    Function power = new Power(z, parenthesis);

    final List<String> result = mathEngine.collectVariablesRecursive(power);

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {

    Function value = new Variable("value", 10);

    Function module = new Module(value);

    Function eight = new Constant(8);

    Function sub = new Subtraction(module, eight);

    final List<String> result = mathEngine.collectVariablesRecursive(sub);

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    Function value = new Variable("value", 10);

    Function module = new Module(value);

    Function eight = new Constant(8);

    Function sub = new Subtraction(module, eight);

    final List<String> result = mathEngine.collectVariablesRecursive(sub);

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {

    Function five = new Constant(5);

    Function value = new Variable("i", 1);

    Function sub = new Subtraction(five, value);

    Function parenthesis = new Parenthesis(sub);

    Function eight = new Constant(8);

    Function product = new Product(parenthesis, eight);

    final List<String> result = mathEngine.collectVariablesRecursive(product);

    assertThat(result, containsInAnyOrder("i"));
  }
}
