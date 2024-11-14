// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String specialLetters = "AEFHILMNORSX";
	    String cheer = args[0].toUpperCase();
            int totalCheers = Integer.parseInt(args[1]);
            for (int i = 0; i < cheer.length(); i++) {
                char currentChar = cheer.charAt(i);
                String additionWord = specialLetters.indexOf(currentChar) == -1 ? "a  " : "an  ";
                System.out.println("Give me " + additionWord + currentChar);
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < totalCheers; i++) {
                System.out.println(cheer + "!!!");
            }
        }
}
