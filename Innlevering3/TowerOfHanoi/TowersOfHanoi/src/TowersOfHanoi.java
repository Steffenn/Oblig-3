import java.util.Scanner;

public class TowersOfHanoi {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Oppgi antall plater: ");
		int n = input.nextInt();

		// rekursiv Løsning

		System.out.println("Trekkene er: ");
		moveDisks(n, 'A', 'B', 'C');

		trekk(count);

	}

	private static void trekk(int count2) {
		// antall trekk
		System.out.println("Antall flyttninger: " + count);
	}

	static int count = 0;

	// Metode som flytter "n" plater fra tårn til tårn med bruk av hjelpetårn
	public static void moveDisks(int n, char fromTower, char toTower,
			char auxTower) {
		count++;
		if (n == 1) // stopp vilkår
			System.out.println("Flytt plate " + n + " fra " + fromTower
					+ " til " + toTower);

		else {
			moveDisks(n - 1, auxTower, toTower, fromTower);

			System.out.println("Flytt plate " + n + " fra " + fromTower
					+ " til " + toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);

		}

	}

}