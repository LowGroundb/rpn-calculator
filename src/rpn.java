public class rpn {
     rpn(Object[] n){
        int p=0;
        int numNum=0;
        int numCh=0;
       Object[] array = new Object[5];
       for(int i=0;i<n.length;i++){
        array[i]=n[i];
       }
       //elegxos gia to an to input einai apodekto.
       for(int i=0;i<array.length;i++){
        if((int)array[i]>=0){
            numNum++;
        }
        if((char)array[i]=='+'||(char)array[i]=='-'||(char)array[i]=='*'||(char)array[i]=='/'||(char)array[i]=='^')
            numCh++;
        }
       if(numNum!=numCh+1){
        System.out.println("ta egrapses xalia");
        }
       for(int i=0;i<array.length-1;i++){
        if((int)array[1]>=0 && (int)array[i+1]>=0){

        } 
    
        }




    }
    
    
    
    
    









    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

}