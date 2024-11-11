// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int totalNumbers = Integer.parseInt(args[0]);
		double result = 1;
		int derometor = 3;
		boolean isAddition = false;

		for (int i = 0; i < totalNumbers; i++) {
			if (isAddition) {
				result += (1.0 / derometor);
			} else {
				result -= (1.0 / derometor);
			}
			derometor += 2;
			isAddition = !isAddition;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + result * 4);
	}
}
