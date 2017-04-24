
public class AddOperator extends Operator {

	public AddOperator() {
		super(10);
	}

	@Override
	public double evaluate(double a, double b) throws UnsupportedOperationException {
		return a+b;
	}

}
