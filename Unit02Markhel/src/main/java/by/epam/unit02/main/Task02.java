package by.epam.unit02.main;

public class Task02 {
  public static void main(String[] args) {
    int x = 2;
    int y = 3;
    if (x < y) {
      y = x + y;
      x = y - x;
      y = y - x;
    }
    System.out.println("x = " + x + "; y = " + y);
  }
}
