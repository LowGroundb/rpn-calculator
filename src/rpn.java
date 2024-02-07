public class rpn {
     rpn(Object[] n){
        int p=0;
        int numNum=0;
        int numCh=0;
       Object[] array = new Object[5];
       Object[] temparray = new Object[5];
       if(array.length == 1 ){
        System.out.println("Your calculation is "+ array[0]);
       }
       for(int i=0;i<n.length;i++){
        array[i]=n[i];
       }
       //elegxos gia to an to input einai apodekto.To eixa lathos opws fainetai
       //for loop na sygkrinei 3 3 ta stoixeia an to + einai sthn thesi 1 h 2 return lathos
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
        
            //thelw edw na balw to recrusive!!
    }



    }
    
    
    
    
    









    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

}