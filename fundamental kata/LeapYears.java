public class LeapYears {

  public static boolean isLeapYear(int year) {
    if (year % 100 == 0 && year % 400 != 0) return false;
    return year % 400 == 0 || year % 4 == 0;
  }
}