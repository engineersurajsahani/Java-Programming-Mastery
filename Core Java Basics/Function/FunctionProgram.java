public class FunctionProgram {

    // Function without parameter and without return statement

    public void hello(){
        System.out.println("Hello");
    }

    // Function with parameter and without return statement

    public void add(int a,int b){
        System.out.println("Addition of a and b :- "+(a+b));
    }

    // Function without parameter and with return statement

    public int data(){
        return 5;
    }

    // Function with parameter and with return statement

    public int sum(int a,int b,int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {

        FunctionProgram functionProgram=new FunctionProgram();
        
        functionProgram.hello();

        functionProgram.add(5,6);

        int a=functionProgram.data();
        System.out.println("Value of a :- "+a);

        int result=functionProgram.sum(4,5,6);
        System.out.println("Result :- "+result);

    }
}
