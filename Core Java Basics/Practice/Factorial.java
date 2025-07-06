public class Factorial {
    
    public static void main(String[] args) {
        
        // Factorial 

        // 5! = 1*2*3*4*5 

        int n=5;
        int result=1;

        for(int i=1;i<n+1;i++){
            result = result * i ; 
        }

        System.out.println("Factorial of "+n+" is "+result);


    }
}
