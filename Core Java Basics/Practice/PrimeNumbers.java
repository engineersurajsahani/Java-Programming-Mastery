public class PrimeNumbers {
    
    public static void main(String[] args) {
        
        // Prime Number From 1 To 100 

        System.out.println("\nPrime Numbers :- ");

        for(int i=2;i<101;i++){
            int check=0;
            for(int j=2;j<i;j++){
                if( i % j == 0 ){
                    check=1;
                }
            }

            if(check==1){

            }
            else{
                System.out.print(i+" ");
            }
        }
    }
}
