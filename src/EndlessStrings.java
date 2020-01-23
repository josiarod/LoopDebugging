import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "something";



        while (userInput.equalsIgnoreCase("something")) {
           //Get user input
            System.out.println("Please type something: ");
            String something = keyboard.nextLine();
            // If input is empty break
            if(something.equals("")){
                break;
            }
            System.out.println(something);
        }

    }
}
