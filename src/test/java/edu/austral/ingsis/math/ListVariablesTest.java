package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.*;
import edu.austral.ingsis.math.operation.Division;
import edu.austral.ingsis.math.operation.Product;
import edu.austral.ingsis.math.operation.Sum;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import java.util.Collections;
import java.util.List;

public class ListVariablesTest {

  MathEngine mathEngine = new MathEngine();

  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {

    Function firstConstant = new Constant(1);
    Function secondConstant = new Constant(6);

    Function sum = new Sum(firstConstant, secondConstant);

    mathEngine.setFunction(sum);

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

    mathEngine.setFunction(product);

    final List<String> result = mathEngine.collectVariablesRecursive(product);

    assertThat(result, containsInAnyOrder("x", "y"));
  }

  /** Case (27 / a) ^ b */
  @Test
  public void shouldListVariablesFunction4() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("a", "b"));
  }

  /** Case z ^ (1/2) */
  @Test
  public void shouldListVariablesFunction5() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("z"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction6() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldListVariablesFunction7() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("value"));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldListVariablesFunction8() {
    final List<String> result = Collections.emptyList();

    assertThat(result, containsInAnyOrder("i"));
  }
}
