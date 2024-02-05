public class rpn {
    rpn(Object[] n){

        int numNum=0;
        int numCh=0;
       Object[] array = new Object[5];
       for(int i=0;i<n.length;i++){
        array[i]=n[i];
       }
       for(int i=0;i<array.length;i++){
        if((int)array[i]==1 || (int)array[i]==2 ||(int)array[i]==3 || (int)array[i]==4 || (int)array[i]==5 || (int)array[i]==6 || (int)array[i]==7 || (int)array[i]==8 || (int)array[i]==9 || (int)array[i]==0){
            numNum++;
        }
        if((char)array[i]=='+'||(char)array[i]=='-'||(char)array[i]=='*'||(char)array[i]=='/'||(char)array[i]=='^')
            numCh++;
        }
       if(numNum!=numCh+1){
        System.out.println("ta egrapses xalia");
       }
    }
    
    
    
    
    









    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    }

}