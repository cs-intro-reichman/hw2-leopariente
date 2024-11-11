// Prints a crowd cheering output.

import java.util.Arrays;

public class Cheers {
        public static void main(String[] args) {
            char[] specialLetters = {'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'};
	    String cheer = args[0];
            int totalCheers = Integer.parseInt(args[1]);
            for (int i = 0; i < cheer.length(); i++) {
                char currentChar = cheer.charAt(i);
                String additionWord = Arrays.asList(specialLetters).contains(currentChar) ? "an " : "a ";
                System.out.println("Give me " + additionWord + currentChar);
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < totalCheers; i++) {
                System.out.println(cheer + "!!!");
            }
        }
}
