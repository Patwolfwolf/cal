
public class MultOperator extends Operator {

	public MultOperator() {
		super(20);
	}

	@Override
	public double evaluate(double a, double b) throws UnsupportedOperationException {
		return a*b;
	}

}
