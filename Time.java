public class Time {
    public static void main(String[] args) {
        double time = 12.05;
        if (time <= 11.59) {
            System.out.println(" Hi ! Good morning.");
        } else if (time < 18) {
            System.out.println("Hi ! Good afternoon.");
        } else {
            System.out.println("Hi ! Good night.");
        }
    }
}
