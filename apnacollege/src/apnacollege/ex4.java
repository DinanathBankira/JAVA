package apnacollege;



//Java program to find the factorial of a number using recursion
public class ex4 {

 // Recursive function to calculate the factorial of a number
 public static int factorial(int n) {
 // Base case: if n is 0 or 1, return 1
     if (n == 0 || n == 1) {
         return 1;
     }
     // Recursive case: return n * factorial(n - 1)
     else {
         return n * factorial(n - 1);
     }
 }

 // Main method to test the program
 public static void main(String[] args) {
     // Input number
     int num = 5;
     // Call the recursive function and store the result
     int result = factorial(num);
     // Print the result
     System.out.println("Factorial of " + num + " is: " + result);
 }
}
