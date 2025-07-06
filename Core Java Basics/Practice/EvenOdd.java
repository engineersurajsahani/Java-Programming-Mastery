public class EvenOdd {
    
    public static void main(String[] s){
        
        // Even Numbers From 1 To 100 

        System.out.println("\nEven Numbers :- ");

        for(int i=1;i<101;i++){
            if( i % 2 == 0 ){
                System.out.print(i+" ");
            }
        }

        // Odd Numbers From 1 To 100 

        System.out.println("\nOdd Numbers :- ");

        for(int i=1;i<101;i++){
            if( i % 2 != 0 ){
                System.out.print(i+" ");
            }
        }
    }
}
