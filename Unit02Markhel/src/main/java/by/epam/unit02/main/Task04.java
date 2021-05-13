package by.epam.unit02.main;

public class Task04 {
  public static void main(String[] args) {
    double x1 = 2;
    double y1 = 2.5;
    double x2 = 4;
    double y2 = 5;
    double z;
    double x = x2 - x1;
    double y = y2 - y1;
    z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    System.out.println("Расстояние между точками = " + z);
  }
}
