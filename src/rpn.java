public class rpn {
    private Object[] array;
    
    
    public rpn(int size){array = new Object[size];}


    public void setObjects(Object[] array){this.array = array;}

     
    int Calculator(){
        int result=0;
        
        for(int i=0;i<array.length-2;i++){
            
            if (array[i] instanceof Integer  a && array[i + 1] instanceof Integer  b && array[i + 2] instanceof Character)  {
                    //////////////////////////////symbol check/////////////////////////////////////
                    char operation = (char)array[i+2];
                    switch (operation) {
                        case '+':
                            result = a+b;
                            break;
                        case '-':
                            result = a-b;
                            break;
                        case '*':
                            result = a*b;
                            break;
                        case '/':
                            if(b==0){System.out.println("division with 0 ");return 0;}
                            result = a/b;
                            break;
                    
                        default:
                        System.out.println("wrong input");
                        return 0;
                            
                    }
                    ///////////////////////////////////////////////////////////////////
                    //////////creation of the new array after the operation////////////
                      return creationOfNewArray(result, i);
               
                   ///////////////////////////////////////////////////////////////////
            }
            
            if(array[i] instanceof Character && array[i+1] instanceof Character && ((char)array[i]=='+'||(char)array[i+1]=='+')){
                System.out.println("your input is wrong");
                    break;
            }
    }
        if(array.length == 1 && array[0] instanceof Integer ){return (int)array[0];}
        System.out.println("wrong input"); 
        System.out.println(array[0]);
        System.out.println(array[1]);
        return 0;
}
int creationOfNewArray(int resultOfExpresion, int indexOfArray){
    rpn tempRpnArray = new rpn(array.length-3);
    Object[] tempArray = new Object[array.length-2];
        
    for(int j=0;j<array.length-2;j++){
        tempArray[j]=array[j];
        if(j==indexOfArray){tempArray[j]=resultOfExpresion;}
        if(j>indexOfArray){tempArray[j]=array[j+2];}
    }
        
    tempRpnArray.setObjects(tempArray);
     return tempRpnArray.Calculator();
}
}