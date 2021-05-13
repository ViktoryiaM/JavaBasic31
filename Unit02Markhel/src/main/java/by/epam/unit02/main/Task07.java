package by.epam.unit02.main;

import static java.lang.Math.*;

public class Task07 {
  public static void main(String[] args) {
    double x = 5.2;
    double y = -20.3;
    double z = -10.89;

    if (x < 0) {
      x = pow(x, 4);

    } else {
      x = pow(x, 2);
    }
    System.out.println("x =" + x);

    if (y < 0) {
      y = pow(y, 4);

    } else {
      y = pow(y, 2);
    }
    System.out.println("y =" + y);

    if (z < 0) {
      z = pow(z, 4);

    } else {
      z = pow(z, 2);
    }
    System.out.println("z =" + z);
  }
}
