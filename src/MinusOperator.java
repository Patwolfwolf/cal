
public class MinusOperator extends Operator {

	public MinusOperator() {
		super(10);
	}

	@Override
	public double evaluate(double a, double b) throws UnsupportedOperationException {
		return a-b;
	}

}
