// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int totalNumbers = Integer.parseInt(args[0]);
		double result = 1;
		int derometor = 3;
		boolean isAddition = false;

		for (int i = 1; i < totalNumbers; i++) {
			if (isAddition) {
				result += ((double)1 / derometor);
			} else {
				result -= ((double)1 / derometor);
			}
			derometor += 2;
			isAddition = !isAddition;
		}

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + result * 4);
	}
}
