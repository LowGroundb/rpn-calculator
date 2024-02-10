
public class rpn {
    private Object[] array;
    
    
    public rpn(int n){
        array = new Object[n];
       for(int i=0;i<n;i++){
        array[i]=0;
       }
    }
    public void setObjects(Object[] n){
        this.array = n;
    }
     
      int Calculator(){
        int result=0;
        
        for(int i=0;i<array.length-2;i++){
            
            if (array[i] instanceof Integer && array[i + 1] instanceof Integer && array[i + 2] instanceof Character && ((char) array[i + 2] == '+' ||(char) array[i + 2] == '-'||(char) array[i + 2] == '*'||(char) array[i + 2] == '/'))  {
                    //////////////////////////////symbol check/////////////////////////////////////
                if(array[i+2] instanceof Character && ((char)array[i+2] == '+')){

                    result=(int)array[i]+(int)array[i+1];
                
                }

                if(array[i+2] instanceof Character && ((char)array[i+2] == '-')){

                    result=(int)array[i]-(int)array[i+1];
                    
                }
                if(array[i+2] instanceof Character && ((char)array[i+2] == '*')){

                    result=(int)array[i]*(int)array[i+1];
                    
                }
                if( array[i+2] instanceof Character && ((char)array[i+2] == '/')){

                    if(array[i+1] instanceof Integer && ((int)array[i+1] == 0)){break;}
                    
                    result=(int)array[i]/(int)array[i+1];
                    
                }
                    ///////////////////////////////////////////////////////////////////
                    //////////creation of the new array after the operation////////////
                rpn temprpn = new rpn(array.length-3);
                Object[] temparray = new Object[array.length-2];
                    
                for(int j=0;j<i;j++){ temparray[j]=array[j];}

                temparray[i]=result;

                for(int j=i+3;j<array.length;j++){temparray[j-2]=array[j];}
                    
                temprpn.setObjects(temparray);
                return temprpn.Calculator();
                   ///////////////////////////////////////////////////////////////////
            }
            
            if(array[i] instanceof Character && array[i+1] instanceof Character && ((char)array[i]=='+'||(char)array[i+1]=='+')){
                System.out.println("your input is wrong");
                    break;
            }
    }
        if(array.length == 1 && array[0] instanceof Integer ){return (int)array[0];}
         return 0;
}
public static void main(String[] args) throws Exception {
    Object[] test = new Object[11];
    test[0] = 1;
    test[1] = 1;
    test[2] = '+';
    test[3] = 1;
    test[4] = 1;
    test[5] = 1;
    test[6] = '+';
    test[7] = 1;
    test[8] = '+';
    test[9] = '*';
    test[10] = '+';
    System.out.println(test.length);
    rpn peos = new rpn(5);
    peos.setObjects(test);
    int result = peos.Calculator();
    System.out.println("Result: " + result);
}
}