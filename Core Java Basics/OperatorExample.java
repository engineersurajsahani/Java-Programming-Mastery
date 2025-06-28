public class OperatorExample {
    
    public static void main(String[] s){

        // Operator :- It is just a symbol or sign by which we 
        // can perform some predefined action or task.

        // Types of Operator :- 
        // (1) Arithmetic Operator ( +,-,*,/,% )
        // (2) Assignment Operator ( +=,-=,*=,/= )
        // (3) Comparision Operator ( <,<=,>,>=,==,!= )
        // (4) Logical Operator ( &&, ||, ! )

        int n1=10;
        int n2=20;

         // (1) Arithmetic Operator ( +,-,*,/,% )

         System.out.println(n1%n2);

         // (2) Assignment Operator ( +=,-=,*=,/=,%= )

         n1+=n2; // n1= n1+n2 = 10 + 20 = 30  n1=30 n2=20 
         System.out.println("n1 :- "+n1+" and n2 :- "+n2);

         n1-=n2; // n1= n1-n2 = 30 - 20 = 10 n1=10 n2=20
         System.out.println("n1 :- "+n1+" and n2 :- "+n2);

         n1*=n2; // n1= n1*n2 = 10 * 20 = 200 n1=200 n2=20
         System.out.println("n1 :- "+n1+" and n2 :- "+n2);

         n1/=n2; // n1= n1/n2 = 200 / 20 = 10 n1=10 n2=20
         System.out.println("n1 :- "+n1+" and n2 :- "+n2);

         n1%=n2; // n1= n1%n2 = 10 / 20 = 10 n1=10 n2=20
         System.out.println("n1 :- "+n1+" and n2 :- "+n2);

         // (3) Comparision Operator ( <,<=,>,>=,==,!= )

         System.out.println(n1!=n2);

         // (4) Logical Operator ( &&, ||, ! )

         System.out.println(!((n1==10) || (n2==20)));
    }
}
