
public class DivOperator extends Operator {

	public DivOperator() {
		super(20);
	}

	@Override
	public double evaluate(double a, double b) throws UnsupportedOperationException {
		return a/b;
	}

}
