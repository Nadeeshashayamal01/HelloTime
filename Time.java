public class Time {
    public static void main(String[] args) {
      double time = 12.59;
      if (time < 11.59) {
        System.out.println(" Hi ! Good morning.");
      } else if (time < 18.59) {
        System.out.println("Hi ! Good evening.");
      }  else {
        System.out.println("Hi ! Good night.");
      }
    }
  }
