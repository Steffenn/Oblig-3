import java.util.Scanner;

public class SnuTekst {
	public static int count = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Skriv inn tekst: ");
		String s = input.nextLine();
		System.out.print("Baklengs blir teksten: ");
		reverseDisplay(s);

		System.out.println("\nAntall tegn er i teksten er: " + count);
	}

	public static void reverseDisplay(String value) {
		reverseDisplay(value, value.length() - 1);
	}

	public static void reverseDisplay(String value, int high) {

		if (high >= 0) {
			System.out.print(value.charAt(high));
			count++;

			reverseDisplay(value, high - 1);

		}
	}
}