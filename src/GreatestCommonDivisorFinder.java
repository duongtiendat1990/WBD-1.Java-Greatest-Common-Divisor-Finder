import java.util.Scanner;

public class GreatestCommonDivisorFinder {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Greatest Common Divisor Finder");
    System.out.println("Please Enter the two number to find common divisor");
    System.out.print("a: ");
    long a = Math.abs(scanner.nextLong());
    System.out.print("b: ");
    long b = Math.abs(scanner.nextLong());
    if (a==0 && b==0){
      System.out.println("The two number has no common divisor");
    }else if (a==0 || b==0||a==b){
      System.out.printf("The greatest common divisor is %d!\n",a==0?Math.abs(b):Math.abs(a));
    }
    while (a!=b){
      if (a>b) a= a-b;
      else b=b-a;
    }
    System.out.printf("The greatest common divisor is %d!\n",a);
  }
}
