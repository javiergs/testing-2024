package javiergs;

public class Main {
  public static void main(String args[]) {
    System.out.println (hypothenuse(10, 20));
  }
  public static double hypothenuse(double a, double b) {
    return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
  }
}

