package day3;

public class LambdaPower {

    public static void main(String[] args) {

        Power p = (x, y) -> (int) Math.pow(x, y);

        System.out.println(p.calculate(2, 3)); // Output: 8
        System.out.println(p.calculate(3, 2)); // Output: 9
    }
}