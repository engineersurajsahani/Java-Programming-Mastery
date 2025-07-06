public class ReverseNumber {
    
    public static void main(String[] args) {
        
        // Reverse Number 1234 ---> 4321 

        int n=1234;
        int num=n;
        int sum=0;

        while(n!=0){
            int rem = n % 10 ; // rem = 1 % 10 = 1
            sum = sum * 10 + rem; // sum = 432 * 10 + 1 = 4321 
            n = n / 10; // n = 1 / 10 = 0
        }

        System.out.println("Reverse of "+num+" is "+sum);
    }
}
