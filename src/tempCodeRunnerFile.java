public class rpn {
    private Object[] array;
    
    
    public rpn(int n){
        array = new Object[n];
       for(int i=0;i<n;i++){
        array[i]=0;
       }
    }
    public void setter(Object[] n){
        this.array = n;
    }
     
      int calculator(){
        int p=0;
        
        if(array.length == 1 && array[0] instanceof Integer ){
           
            return (int)array[0];
        }
        
           for(int i=0;i<array.length-2;i++){
            
            if (array[i] instanceof Integer && array[i + 1] instanceof Integer && array[i + 2] instanceof Character && ((char) array[i + 2] == '+' ||(char) array[i + 2] == '-'||(char) array[i + 2] == '*'||(char) array[i + 2] == '/'))  {
            ////////////////////symbol check////////////////////////////////
                if(array[i+2] instanceof Character && ((char)array[i+2] == '+')){
                p=(int)array[i]+(int)array[i+1];
                }
                if(array[i+2] instanceof Character && ((char)array[i+2] == '-')){
                    p=(int)array[i]-(int)array[i+1];
                    }
                if(array[i+2] instanceof Character && ((char)array[i+2] == '*')){
                    p=(int)array[i]*(int)array[i+1];
                    }
                if( array[i+2] instanceof Character && ((char)array[i+2] == '/')){
                    if(array[i+1] instanceof Integer && ((int)array[i+1] == 0)){
                        break;
                    }
                    p=(int)array[i]/(int)array[i+1];
                    }
            ///////////////////////////////////////////////////////////////
                Object[] temparray = new Object[array.length-2];
                    for(int j=0;j<i;j++){
                        temparray[j]=array[j];
                    }
                 temparray[i]=p;
                    for(int j=i+3;j<array.length;j++){
                        temparray[j-2]=array[j];
                }
                    return calculator();
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
    test[2] = '+';
    test[3] = 12;
    test[4] = '+';
    System.out.println(test.length);
    rpn peos = new rpn(5);
    peos.setter(test);
    int result = peos.calculator();
    System.out.println("Result: " + result);
}
}