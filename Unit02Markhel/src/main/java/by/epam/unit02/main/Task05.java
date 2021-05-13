package by.epam.unit02.main;

public class Task05 {
  public static void main(String[] args) {
    double x = 2.3;
    double y = 1.7;
    double A;
    A = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * ((Math.sin(x * y)) / (Math.cos(x * y)));
    System.out.println("A = " + A);
  }
}
