// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int number = Integer.parseInt(args[0]);
		boolean isVerbose = args[1].equals("v");
		for (int i = 1; i <= number; i++) {
			int j = i;
			int counter = 1;
			while (j != 1 || counter == 1) {
				counter++;
				if (isVerbose) {
					System.out.print(j + " ");
				}
				if (j % 2 == 0) {
					j = j / 2;
				} else {
					j = j * 3 + 1;
				}
			}
			if (isVerbose) {
				System.out.print(j + " (" + counter + ")");
				System.out.println();
			}
		}
		System.out.print("Every one of the first " +  number + " hailstone sequences reached 1.");
	}
}
