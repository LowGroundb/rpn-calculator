import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gui {

    private JFrame frame;
    private JPanel panel1;
    private JPanel panel2;
    private JLabel label1;
    private JLabel label2;

    

    public gui(String mathematicExpresion , float result){
        initialize(mathematicExpresion,  result);
      
      

    }
    private void initialize(String mathematicExpresion, float result){
        //frame
        frame = new JFrame();
        frame.setTitle("RPN Clalculator");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.yellow);
        //panels

        panel1 = new JPanel();
        panel1.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.add(panel1, BorderLayout.NORTH);
        panel1.setBackground(Color.orange);

        panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        frame.add(panel2, BorderLayout.SOUTH);
        panel2.setBackground(Color.orange);
        
        //labels
        label1 = new JLabel(mathematicExpresion);
        panel1.add(label1);
        label1.setForeground(Color.BLACK);
        
        label2 = new JLabel("The result is: " + Float.toString(result));
        panel2.add(label2);
        label2.setForeground(Color.BLACK);
    }
    
    public void show(){
        this.frame.setVisible(true);
    }
    
}