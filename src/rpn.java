
public class rpn {
    private Object[] array;
    
    
    public rpn(int size){array = new Object[size];}


    public void setObjects(Object[] array){this.array = array;}

     
    int Calculator(){
        int result=0;
        
        for(int i=0;i<array.length-2;i++){
            
            if (array[i] instanceof Integer && array[i + 1] instanceof Integer && array[i + 2] instanceof Character)  {
                    //////////////////////////////symbol check/////////////////////////////////////
                    char operation = (char)array[i+2];
                    switch (operation) {
                        case '+':
                            result = (int)array[i]+(int)array[i+1];
                            break;
                        case '-':
                            result = (int)array[i]-(int)array[i+1];
                            break;
                        case '*':
                            result = (int)array[i]*(int)array[i+1];
                            break;
                        case '/':
                            if((int)array[i+1]==0){System.out.println("division with 0 ");return 0;}
                            result = (int)array[i]/(int)array[i+1];
                            break;
                    
                        default:
                        System.out.println("wrong input");
                        return 0;
                            
                    }
                    ///////////////////////////////////////////////////////////////////
                    //////////creation of the new array after the operation////////////
                rpn temprpn = new rpn(array.length-3);
                Object[] temparray = new Object[array.length-2];
                    
                for(int j=0;j<array.length-2;j++){
                    temparray[j]=array[j];
                    if(j==i){temparray[j]=result;}
                    if(j>i){temparray[j]=array[j+2];}
                }
                    
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
        System.out.println("wrong input"); 
        return 0;
}
public static void main(String[] args) throws Exception {
    Object[] test = new Object[11];
    test[0] = 1;
    test[1] = 0;
    test[2] = '+';
    test[3] = 1;
    test[4] = 1;
    test[5] = 1;
    test[6] = '+';
    test[7] = 1;
    test[8] = '+';
    test[9] = '+';
    test[10] = '+';
    rpn peos = new rpn(5);
    peos.setObjects(test);
    int result = peos.Calculator();
    System.out.println("Result: " + result);
}
}