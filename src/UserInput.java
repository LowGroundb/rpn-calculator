import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public  String mathematicalExpresion="" ;
    public float result1=0;

    public UserInput() {
        ArrayList<Object> mixedList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Type each element of your mathematical expression one by one. Type 'done' when you are done.");
                String userInput = scanner.nextLine().toLowerCase(); // Convert to lowercase
                if (userInput.equals("done")) {
                    break;
                } else if (userInput.length() == 1 && "+-*/".contains(userInput)) {
                    mixedList.add(userInput.charAt(0));
                } else {
                    try {
                        float floatValue = Float.parseFloat(userInput);
                        mixedList.add(floatValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Must be an number or a single character.");
                    }
                }
            }
            rpn mathematicExpression = new rpn(mixedList.size());
            Object[] mixedArray = mixedList.toArray();
            mathematicExpression.setObjects(mixedArray);
           
            for (int i = 0; i < mixedArray.length; i++) {
                mathematicalExpresion += mixedArray[i] + " "; 
                }
          
             result1 = mathematicExpression.Calculator();
          
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

  
}