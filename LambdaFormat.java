package day3;

public class LambdaFormat {
	public static void main(String[] args) {
	Formatter f = s -> String.join(" ", s.split(""));

    System.out.println(f.format("CG"));
    System.out.println(f.format("JAVA"));
}
}