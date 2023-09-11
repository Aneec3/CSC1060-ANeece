// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class F_to_C_and_K_Calc {
    public static void main(String[] args) {
        System.out.print("Fahrenheit to Celsius and Kelvin Calculator\n" );
        String line;
        Scanner in = new Scanner(System.in);
        var F = 1.00;
        double C = ((F - 32.00) * 5.00 / 9.00);
        double K = (C + 273.15);
        System.out.print("Fahrenheit = ");
        line = in.nextLine();
        System.out.print("If Fahrenheit = " + line + "\n");
        System.out.printf("Celsius = %.2f %n", C);
        System.out.printf("Kelvin = %.2f %n", K);
        C:\Users\S03037036\Documents\GitHub\CSC1060-ANeece
    }}