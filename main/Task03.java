package by.epam.unit03.main;

public class Task03 {
  public static void main(String[] args) {
    long x = 3;
    long Mnozhitel = 1 + 2;
    long P = Mnozhitel;
    for (x = 3; x <= 10; x = x + 1 ){
      Mnozhitel += x;
      P *= Mnozhitel;
    }
    System.out.println(P);


//    P = (x+(x+1))*(x+(x+1)+(x+2))*(x+(x+1)+(x+2)+(x+3))*(x+(x+1)+(x+2)+(x+3)+(x+4));
//    System.out.println(P);
  }
}
