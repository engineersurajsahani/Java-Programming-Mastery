public class LoopStatements {
    
    public static void main(String[] s){

        // Loop Statements 

        // for loop 
        // while loop 
        // do while loop 

        // 2 * 1 = 2 
        // 2 * 2 = 4 
        //     i   2*i 

        for(int i=1;i<11;i++){
            System.out.println("2 * "+i+" = "+(2*i));
        }

        int i=1;
        while(i<11){
            System.out.println("3 * "+i+" = "+(3*i));
            i++;
        }

        i=1;
        do{
            System.out.println("4 * "+i+" = "+(4*i));
            i++;
        }while(i<11);
    }
}
