package day3;

public class MathFact {
	
	public static int fact(int n) {
        int result = 1;

        for(int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}

