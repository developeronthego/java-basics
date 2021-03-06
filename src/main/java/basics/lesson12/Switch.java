package basics.lesson12;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 3 };

		for (int i = 0; i < intArray.length; i++) {
			int elementFromArray = intArray[i];
			if (elementFromArray == 1) {
				System.out.println("Wyświetliłeś pierwszy element");
			} else if (elementFromArray == 2) {
				System.out.println("Wyświetliłeś drugi element");
			} else {
				System.out.println("Wyświetliłeś ostatni element");
			}
		}
		
		int i = 0;
		while (i < intArray.length) {
			int elementFromArray = intArray[i];
			if (elementFromArray == 1) {
				System.out.println("Wyświetliłeś pierwszy element");
			} else if (elementFromArray == 2) {
				System.out.println("Wyświetliłeś drugi element");
			} else {
				System.out.println("Wyświetliłeś ostatni element");
			}
			i++;
		}
		
		System.out.println("Wpisz dowolną liczbę");
		
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String nextValue = sc.next();
			if (nextValue.equals("1")) {
				System.out.println("Wyświetliłeś pierwszy element");
			} else if (nextValue.equals("2")) {
				System.out.println("Wyświetliłeś drugi element");
			} else {
				System.out.println("Teraz nastąpi wyjście z programu");
				return;
			}
		}
		sc.close();

		System.out.println("Wpisz dowolną liczbę");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int nextInt = scanner.nextInt();
			switch (nextInt) {
			case 1:
				System.out.println("Wyświetliłeś " + nextInt);
				break;
			case 2:
				System.out.println("Wyświetliłeś " + nextInt);
				break;
			default:
				System.out.println("Liczba poza zakresem");
				return;
			}
		}
		scanner.close();

	}
}
