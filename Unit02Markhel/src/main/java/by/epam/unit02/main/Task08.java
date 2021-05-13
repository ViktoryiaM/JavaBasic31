package by.epam.unit02.main;

public class Task08 {
  public static void main(String[] args) {
    int x = -2;
    int y = 5;
    if (y <= 4 && y > 0) {
      if (x >= -2 && x <= 2) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    } else if (y <= 0 && y >= -3) {
      if (x >= -4 && x <= 4) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    } else {
      System.out.println("false");
    }
  }
}
