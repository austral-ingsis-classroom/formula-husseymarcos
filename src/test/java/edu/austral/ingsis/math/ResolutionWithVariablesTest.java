package edu.austral.ingsis.math;

import edu.austral.ingsis.math.expression.Expression;
import edu.austral.ingsis.math.expression.Sum;
import edu.austral.ingsis.math.expression.Variable;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionWithVariablesTest {

  MathEngine mathEngine = new MathEngine();
  List<Expression> expressions = new ArrayList<>();
  List<String> variables = new ArrayList<>();


  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {



    Variable variable = new Variable("x", 3);
    int x = variable.evaluate();

    expressions.add(new Sum(1, x));

    Function function = new Function(expressions, variables);
    mathEngine.addFunction(function);

    Double mathEngineResult = mathEngine.evaluateFunction();

    final Double result = 4d;

    assertThat(result, equalTo(mathEngineResult));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    final Double result = 3d;

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    final Double result = 12d;

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    final Double result = 27d;

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    final Double result = 6d;

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    final Double result = 0d;

    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    final Double result = 0d;

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    final Double result = 24d;

    assertThat(result, equalTo(24d));
  }
}
