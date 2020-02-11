package testDemo;

public class Factorial {
public static void main(String[] args) {

long factorial = 1; // A factorial will be stored in this variable
// Loop from 1 to the value of limit
for (int i = 1; i <= 5; ++i) {
factorial = 1; // Initialize factorial
for (int factor = 2; factor <= i; ++factor) {
factorial *= factor;
}
System.out.println(i + "! is " + factorial);
}
}
}