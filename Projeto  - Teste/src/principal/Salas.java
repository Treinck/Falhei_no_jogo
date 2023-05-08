package principal;
import java.util.Scanner;
import java.util.Random;

public class Salas {
	public int swordRoom(Scanner sc) {
		Random rng = new Random();
		System.out.printf("\nVocê adentra uma sala com um pedastal em seu centro.\n");
		System.out.printf("Deseja pegar a espada encravada?\n");
		char key = sc.next().charAt(0);
		if (key == 'y') {
			int getSwd = rng.nextInt(100);
			if (getSwd <= 34) {
				return 1;
			}
			else if (getSwd <= 93) {
				return 2;
			}
			else if (94 <= getSwd) {
				return 3;
			}
		}
		return 4;
	}
	public boolean shieldRoom(Scanner sc) {
		System.out.printf("\nVocê adentra uma sala com um escudo em seu centro\n");
		System.out.printf("Deseja pegar o escudo?\n");
		char key = sc.next().charAt(0);
		if (key == 'y') {
			return true;
		}
		return false;
		
		
		
	}
}
//System.out.printf("");
