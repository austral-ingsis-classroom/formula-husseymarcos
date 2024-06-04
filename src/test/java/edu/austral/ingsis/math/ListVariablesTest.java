package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.empty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListVariablesTest {

  MathEngine mathEngine = new MathEngine();
  List<Operation> operations = new ArrayList<>();


  /** Case 1 + 6 */
  @Test
  public void shouldListVariablesFunction1() {

    Expression firstConstant = new Constant(1);
    Expression secondConstant = new Constant(6);

    operations.add(new Sum(firstConstant, secondConstant));


    Function function = new Function(operations);
    mathEngine.setFunction(function);

    final List<String> result = mathEngine.getVariablesFromFunction();

    assertThat(result, empty());
  }

  /** Case 12 / div */
  @Test
  public void shouldListVariablesFunction2() {
    Variable divVariable = new Variable("div", 10);

    Expression firstConstant = new Constant(12);

    operations.add(new Division(firstConstant, divVariable));

    Function function = new Function(operations);
    mathEngine.setFunction(function);

    final List<String> result = mathEngine.getVariablesFromFunction();

    assertThat(result, containsInAnyOrder("div"));
  }

  /** Case (9 / x) * y */
  @Test
  public void shouldListVariablesFunction3() {
    final List<String> result = Collections.emptyList();

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
