package codecheck;

public class App {

	public static String outputWithHello(String inputString) {
		return "Hello " + inputString;
	}

	public static void main(String[] args) {
		System.out.println(outputWithHello(args[0]));
	}
}
