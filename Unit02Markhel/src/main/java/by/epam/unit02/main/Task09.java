package by.epam.unit02.main;

public class Task09 {
  public static void main(String[] args) {
    double x = 4;
    double F;
    if (x <= -3) {
      F = 9;
      System.out.println("F = " + F);
    }
    if (x > 3) {
      F = 1 / (Math.pow(x, 2) + 1);
      System.out.println("F = " + F);
    }
  }
}
