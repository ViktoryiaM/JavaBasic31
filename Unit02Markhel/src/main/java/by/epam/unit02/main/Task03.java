package by.epam.unit02.main;

public class Task03 {
  public static void main(String[] args) {
    int T = 5418;
    int hour, min, sec;
    hour = T / 3600;
    min = (T - (hour * 3600)) / 60;
    sec = T - (hour * 3600) - (min * 60);
    System.out.println("Натуральное число Т = " + hour + "ч" + min + "мин" + sec + "c");
  }
}
