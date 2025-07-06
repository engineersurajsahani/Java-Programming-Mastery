public class ArmstrongNumber {
    
    public static void main(String[] args) {
        
        // Armstrong Number 

        // 153 = 1*1*1 + 5*5*5 + 3*3*3 = 153

        int n=153;
        int num=n;
        int sum=0;

        while(n!=0){
            int rem = n % 10 ; // rem = 1 % 10 = 1
            sum = sum + rem*rem*rem; //  sum = ( 3*3*3 + 5*5*5 ) + 1*1*1 = 3*3*3 + 5*5*5 + 1*1*1 
            n = n / 10 ; // n = 1 / 10 = 0
        }

        if(num==sum){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }


    }
}
