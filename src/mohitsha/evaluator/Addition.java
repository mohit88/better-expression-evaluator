package mohitsha.evaluator;

/**
 * Created by mohitsha on 1/28/14.
 */
public class Addition implements Operation {

    @Override
    public double performOperation(Expression left, Expression right) {
        return left.evaluate() + right.evaluate();
    }
}
