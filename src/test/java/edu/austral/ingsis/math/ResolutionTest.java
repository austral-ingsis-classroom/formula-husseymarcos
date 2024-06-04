//package edu.austral.ingsis.math;
//
//import edu.austral.ingsis.math.expression.Constant;
//import edu.austral.ingsis.math.expression.Expression;
//import edu.austral.ingsis.math.operation.Sum;
//import org.junit.jupiter.api.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class ResolutionTest {
//
//  MathEngine mathEngine = new MathEngine();
//  List<Operation> operations = new ArrayList<>();
//
//
//  /** Case 1 + 6 */
//  @Test
//  public void shouldResolveSimpleFunction1() {
//    Expression firstConstant = new Constant(1);
//    Expression secondConstant = new Constant(6);
//
//
//    operations.add(new Sum(firstConstant, secondConstant));
//    Function function = new Function(operations);
//
//    mathEngine.setFunction(function);
//    Double mathEngineResult = mathEngine.evaluateFunction();
//
//    final Double result = 7d;
//
//    assertThat(result, equalTo(mathEngineResult));
//  }
//
//  /** Case 12 / 2 */
//  @Test
//  public void shouldResolveSimpleFunction2() {
//    final Double result = 6d;
//
//    assertThat(result, equalTo(6d));
//  }
//
//  /** Case (9 / 2) * 3 */
//  @Test
//  public void shouldResolveSimpleFunction3() {
//    final Double result = 13.5;
//
//    assertThat(result, equalTo(13.5d));
//  }
//
//  /** Case (27 / 6) ^ 2 */
//  @Test
//  public void shouldResolveSimpleFunction4() {
//    final Double result = 20.25;
//
//    assertThat(result, equalTo(20.25d));
//  }
//
//  /** Case 36 ^ (1/2) */
//  @Test
//  public void shouldResolveSimpleFunction5() {
//    final Double result = 6d;
//
//    assertThat(result, equalTo(6d));
//  }
//
//  /** Case |136| */
//  @Test
//  public void shouldResolveSimpleFunction6() {
//    final Double result = 136d;
//
//    assertThat(result, equalTo(136d));
//  }
//
//  /** Case |-136| */
//  @Test
//  public void shouldResolveSimpleFunction7() {
//    final Double result = 136d;
//
//    assertThat(result, equalTo(136d));
//  }
//
//  /** Case (5 - 5) * 8 */
//  @Test
//  public void shouldResolveSimpleFunction8() {
//    final Double result = 0d;
//
//    assertThat(result, equalTo(0d));
//  }
//}
