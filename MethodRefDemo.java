package day3;

public class MethodRefDemo {
	public static void main(String[] args) {

        Factorial f = MathFact::fact;   // Method Reference

        System.out.println(f.calculate(5));  // 120
        System.out.println(f.calculate(4));  // 24
    }
}
