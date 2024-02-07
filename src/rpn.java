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
        if(array.length == 1 ){
            return (int)array[0];
        }
           for(int i=0;i<array.length-3;i++){
            
            if (array[i] instanceof Integer && array[i + 1] instanceof Integer && array[i + 2] instanceof Character && (char) array[i + 2] == '+') {
                p=(int)array[i]+(int)array[i+1];
                Object[] temparray = new Object[array.length-2];
                    for(int j=0;j<i;j++){
                        temparray[j]=array[j];
                    }
                    temparray[i]=p;
                    for(int j=i+3;j<array.length;j++){
                        temparray[j-2]=array[j];
                }
                    return calculator(temparray);
            }
            if(array[i] instanceof Character && array[i+1] instanceof Character && ((char)array[i]=='+'||(char)array[i+1]=='+')){
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
    test[2] = 1;
    test[3] = '+';
    test[4] = '+';
    System.out.println(test.length);
    System.out.println(test[4] instanceof Integer);
    rpn peos = new rpn(5);
    int result = peos.calculator(test);
    System.out.println("Result: " + result);
}
}