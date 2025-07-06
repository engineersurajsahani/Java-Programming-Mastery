public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        // Fibonacci Series 

        // 1 1 2 3 5 8 ...
        
        System.out.print("1 1 ");

        int firstNumber=1;
        int secondNumber=1;

        for(int i=3;i<11;i++){
            int thirdNumber=firstNumber+secondNumber;
            System.out.print(thirdNumber+" ");
            firstNumber=secondNumber;
            secondNumber=thirdNumber;
        }
    }
}
