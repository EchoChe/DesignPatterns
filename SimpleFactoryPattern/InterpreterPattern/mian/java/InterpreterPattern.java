package mian.java;

public class InterpreterPattern {
	
	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		
		return new OrExpression(robert, john);
	}
	
	public static Expression getMarriedWomanExpression() {
		Expression Julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		
		return new AndExpression(Julie, married);
	}
	
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarried = getMarriedWomanExpression();
		System.out.println("John is male?" + isMale.interpret("John"));
		System.out.println("Julie is a married women?" + isMarried.interpret("Married Julie"));
	}
}
