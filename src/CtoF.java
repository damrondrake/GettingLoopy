import java.util.Scanner;

class CtoF {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        while (true) {
            try {
                System.out.println("Enter celsius temperature: ");
                celsius = Double.parseDouble(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: invalid number");
            }
        }
        fahrenheit = celsius*1.8 + 32;
        System.out.printf("%.2f C = %.2f F\n",celsius,fahrenheit);
    }
}