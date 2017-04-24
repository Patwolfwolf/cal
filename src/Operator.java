
public abstract class Operator {

	private int priority;
	
	/**
	 * @param index
	 */
	public Operator(int priority) {
		super();
		this.priority = priority;
	}
	
	/**
	 * @return priority
	 */
	public int getPriority() {
		return priority;
	}
	
	public abstract double evaluate(double a, double b) throws UnsupportedOperationException;
}
