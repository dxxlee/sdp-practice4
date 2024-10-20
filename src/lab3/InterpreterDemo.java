package lab3;

public class InterpreterDemo {
    public static void main(String[] args) {
        // Create terminal expressions
        Expression isJava = new TerminalExpression("Java");
        Expression isPython = new TerminalExpression("Python");
        // Create or expression
        Expression isJavaOrPython = new OrExpression(isJava, isPython);
        // Create and expression
        Expression isJavaAndPython = new AndExpression(isJava, isPython);
        System.out.println("Does context contain Java or Python?");
        System.out.println(isJavaOrPython.interpret("I love Java")); // true
        System.out.println("Does context contain both Java and Python?");
        System.out.println(isJavaAndPython.interpret("I love Java and Python")); // false
    }
}
