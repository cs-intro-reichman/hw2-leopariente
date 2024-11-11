// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String cheer = args[0];
            int totalCheers = Integer.parseInt(args[1]);
            for (int i = 0; i < cheer.length(); i++) {
                System.out.println("Give me a " + cheer.charAt(i));
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < totalCheers; i++) {
                System.out.println(cheer + "!!!");
            }
        }
}
