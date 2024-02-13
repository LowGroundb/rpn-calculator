import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    UserInput(){
      
         ArrayList<Object> mixedList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("type each element of your methematical expresion 1 by 1 type done when you are done");
            String userInput = scanner.nextLine();
            if (userInput.length() == 1 && "+-*/".contains(userInput)) {
                mixedList.add(userInput.charAt(0));
              

            }
            else if(userInput.equals("done") || userInput.equals("Done") || userInput.equals("DONE")) {
                    break;
            }

                else 

                
                try {
                    int intValue=Integer.parseInt(userInput);
                    mixedList.add(intValue);
                    
                }
                catch(NumberFormatException e){
                    System.out.println("Invalid input. Must be an integer or a single character.");
                    break;

                }
            }
            rpn mathematicExpresion = new rpn(mixedList.size());
            Object[] mixedArray = mixedList.toArray();
            mathematicExpresion.setObjects(mixedArray);
            for(int i =0;i<mixedArray.length;i++){
                System.out.println(mixedArray[i]);
            }
            int result = mathematicExpresion.Calculator();
            System.out.println("Result: " + result);
    }
    

public static void main(String[] args) throws Exception {
  UserInput peos = new UserInput();
}
}