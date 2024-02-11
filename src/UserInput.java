import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    UserInput(){
         ArrayList<Object> mixedList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
        int index=0;
        while(true){
            System.out.println("type each element of your methematical expresion 1 by 1");
            String userInput = scanner.nextLine();
            if (userInput.length() == 1 && "+-*/".contains(userInput)) {
                mixedList.add(userInput.charAt(index));
                index++;

            }
            else {
                try {
                    int intValue=Integer.parseInt(userInput);
                    mixedList.add(intValue);
                    index++;

                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input. Must be an integer or a single character.");
                    break;

                }
            }

        }
    
}
public static void main(String[] args) throws Exception {
  UserInput peos = new UserInput();
}
}