package BehavioralPatterns.Interpreter;

public class InterpreterApp {
    public static void main(String[] args) {
        Expression experience = new TerminalExpression("experience");
        Expression english = new TerminalExpression("english");
        OrExpression orExpression = new OrExpression(experience,english);

        System.out.println(orExpression.interpret("english"));

        AndExpression andExpression = new AndExpression(experience,english);
        System.out.println(andExpression.interpret("experience nglish"));
    }
}
