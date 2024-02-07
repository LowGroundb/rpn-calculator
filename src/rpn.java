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
        Object[] temparray = new Object[5];
        //
        if(array.length == 1 ){
            return (int)array[0];
        }
           for(int i=0;i<array.length-3;i++){
            if((char)array[i]=='+'||(char)array[i+1]=='+'){
                System.out.println("your input is wrong");
                break;
            }
            if ((int)array[i]>=0 && (int)array[i+1]>=0 && (char)array[i+2]=='+'){
                p=(int)array[i]+(int)array[i+1];
                    for(int j=0;j<i;j++){
                        temparray[j]=array[j];
                    }
                    temparray[i]=p;
                    for(int j=i;j<array.length-3;j++){
                        temparray[j]=array[j];
                }
                    calculator(temparray);
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
    rpn peos = new rpn(5);
    int result = peos.calculator(test);
    System.out.println("Result: " + result);
}
}