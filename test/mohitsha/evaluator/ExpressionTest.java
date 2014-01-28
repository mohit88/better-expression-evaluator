package mohitsha.evaluator;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionTest {
    @Test
    public void testEvaluateExpressionOfAdditionOperator() throws Exception {
        Expression expression = new Expression(new Expression(2),new Expression(3),new Addition());
        assertEquals(5.0, expression.evaluate());
    }

    @Test
    public void testEvaluateExpressionMultipleOperationOfAddition() throws Exception {
        Expression left = new Expression(new Expression(5), new Expression(3), new Addition());
        Expression right = new Expression(new Expression(7), new Expression(5), new Addition());
        Expression expression = new Expression(left, right, new Addition());
        assertEquals(20.0, expression.evaluate());
    }
    @Test
    public void testEvaluateExpressionOfSubtraction() throws Exception {
        Expression expression = new Expression(new Expression(2),new Expression(3),new Subtraction());
        assertEquals(-1.0, expression.evaluate());
    }

    @Test
    public void testEvaluateExpressionMultipleOperationOfSubtraction() throws Exception {
        Expression left = new Expression(new Expression(5), new Expression(3), new Subtraction());
        Expression right = new Expression(new Expression(7), new Expression(5), new Addition());
        Expression expression = new Expression(left, right, new Addition());
        assertEquals(14.0, expression.evaluate());
    }

    @Test
    public void testEvaluateExpressionOfMultipication() throws Exception {
        Expression expression = new Expression(new Expression(2),new Expression(3),new Multiplication());
        assertEquals(6.0, expression.evaluate());
    }

}
