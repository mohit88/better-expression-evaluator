package mohitsha.evaluator;

public class Expression {
    Expression right;
    Expression left;
    Double value = null;
    Operation operation;

    public Expression(double value) {
        this.value = value;
    }

    public Expression(Expression left, Expression right, Operation operation) {
        this.right = right;
        this.left = left;
        this.operation = operation;
    }

    public double evaluate(){
        return (value != null)? value : this.operation.performOperation(left, right) ;
    }
}