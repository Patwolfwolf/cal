
public class PowOperator extends Operator {

	public PowOperator() {
		super(30);
	}

	@Override
	public double evaluate(double a, double b) throws UnsupportedOperationException {
		return Math.pow(a, b);
	}

}
