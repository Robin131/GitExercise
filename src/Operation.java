
public abstract class Operation {
	protected double a;
	protected double b;
	
	public Operation() {
		super();
	}
	
	public abstract String getName();
	
	public abstract String getOperator();
	
	public abstract double calc();
	
	public void setNumbers(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public static Operation parseOperator(String op) {
		Operation[] ops = new Operation[] {new Addition(), new Multiplication(),  new Subtraction()};
		for(Operation o : ops) {
			if(o.getOperator().equals(op)) {
				return o;
			}
		}
		return null;
	}
	
	
}
