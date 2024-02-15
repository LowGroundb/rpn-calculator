import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
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
                        int intValue = Integer.parseInt(userInput);
                        mixedList.add(intValue);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Must be an integer or a single character.");
                    }
                }
            }
            rpn mathematicExpression = new rpn(mixedList.size());
            Object[] mixedArray = mixedList.toArray();
            mathematicExpression.setObjects(mixedArray);
            for (int i = 0; i < mixedArray.length; i++) {
                System.out.println(mixedArray[i]);
            }
            int result = mathematicExpression.Calculator();
            System.out.println("Result: " + result);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput();
    }
}