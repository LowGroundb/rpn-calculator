import java.util.Scanner;  
public class rpn {
    private Object[] array;
    
    
    public rpn(int n){
        array = new Object[n];
       for(int i=0;i<n;i++){
        array[i]=0;
       }
    }
     
     static int calculator(Object[] n){
        int p=0;
        
        if(n.length == 1 && n[0] instanceof Integer ){
           
            return (int)n[0];
        }
        
           for(int i=0;i<n.length-2;i++){
            
            if (n[i] instanceof Integer && n[i + 1] instanceof Integer && n[i + 2] instanceof Character && ((char) n[i + 2] == '+' ||(char) n[i + 2] == '-'||(char) n[i + 2] == '*'||(char) n[i + 2] == '/'))  {
            ////////////////////symbol check////////////////////////////////
                if(n[i+2] instanceof Character && ((char)n[i+2] == '+')){
                p=(int)n[i]+(int)n[i+1];
                }
                if(n[i+2] instanceof Character && ((char)n[i+2] == '-')){
                    p=(int)n[i]-(int)n[i+1];
                    }
                if(n[i+2] instanceof Character && ((char)n[i+2] == '*')){
                    p=(int)n[i]*(int)n[i+1];
                    }
                if( n[i+2] instanceof Character && ((char)n[i+2] == '/')){
                    if(n[i+1] instanceof Integer && ((int)n[i+1] == 0)){
                        break;
                    }
                    p=(int)n[i]/(int)n[i+1];
                    }
            ///////////////////////////////////////////////////////////////
                Object[] temparray = new Object[n.length-2];
                    for(int j=0;j<i;j++){
                        temparray[j]=n[j];
                    }
                 temparray[i]=p;
                    for(int j=i+3;j<n.length;j++){
                        temparray[j-2]=n[j];
                }
                    return calculator(temparray);
            }
            
            if(n[i] instanceof Character && n[i+1] instanceof Character && ((char)n[i]=='+'||(char)n[i+1]=='+')){
                System.out.println("your input is wrong");
                break;
            }
    }
            return 0;
}
public static void main(String[] args) throws Exception {
    Object[] test = new Object[5];
    test = new Object[1];
    System.out.println(test.length);
   
    rpn peos = new rpn(5);
    int result = peos.calculator(test);
    System.out.println("Result: " + result);
}
}