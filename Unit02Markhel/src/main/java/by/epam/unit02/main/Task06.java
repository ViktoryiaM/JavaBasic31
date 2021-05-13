package by.epam.unit02.main;

public class Task06 {
  public static void main(String[] args) {
    double M = 555.1;
    double N = 46.3;
    double K = M / N;
    // System.out.println(K);
    int Q = (int ) K;
    // System.out.println("Q = " +Q);
    System.out.println(Q % 10);
    K = K - Q;
    // System.out.println(K);
    K = K * 10;
    System.out.println((int)K);
  }
}