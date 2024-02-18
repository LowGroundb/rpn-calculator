import java.awt.EventQueue;


public class Launcher {
    public static void main(String[] args) {
        UserInput userInput = new UserInput(); 
        String mathematicExpresion = userInput.mathematicalExpresion; 
        float result = userInput.result1;
        



        EventQueue.invokeLater(new Runnable() {
            public void run(){
                gui frame = new gui(mathematicExpresion , result);
                frame.show();
            }
        });
    }

}
