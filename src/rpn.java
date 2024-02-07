public class rpn {
    private Object[] array;
    
    
    public rpn(int n){
        array = new Object[n];
       for(int i=0;i<n;i++){
        array[i]=0;
       }
     


    }
     
     int calculator(Object[] n){
        int p=0;
        for(int i=0; i<n.length;i++){
            array[i]=n[i];
        }
        
       
        //
        if(n.length == 1 ){
            return (int)n[0];
        }
           for(int i=0;i<n.length;i++){
            
            if (n[i] instanceof Integer && n[i + 1] instanceof Integer && n[i + 2] instanceof Character && (char) n[i + 2] == '+') {
                p=(int)n[i]+(int)n[i+1];
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
    test[0] = 1;
    test[1] = 1;
    test[2] = 12;
    test[3] = '+';
    test[4] = '+';
    System.out.println(test.length);
    System.out.println(test[4] instanceof Integer);
    rpn peos = new rpn(5);
    int result = peos.calculator(test);
    System.out.println("Result: " + result);
}
}