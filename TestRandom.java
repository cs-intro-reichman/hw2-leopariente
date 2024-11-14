// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int totalBelow = 0;
	    int totalAbove = 0;
		int totalTimes = Integer.parseInt(args[0]);
		for (int i = 0; i < totalTimes; i++) {
			double randomNumber = Math.random();
			if (randomNumber > 0.5) totalAbove++;
			else totalBelow++;
		}
		System.out.println(totalBelow);
		System.out.println(totalAbove);
		if (totalAbove != 0) {
			double ratio = (double)totalBelow / totalAbove;
			System.out.println("Ratio: " + ratio);
		}
	}
}
