package principal;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String []args) {
		Main main = new Main();
		Salas room = new Salas();
		Jogador player = new Jogador();
		Itens swd1 = new Itens(6);
		Itens swd2 = new Itens(11);
		Itens swd3 = new Itens(21);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Qual o seu nome?\n");
		String name = sc.next();
		System.out.printf("\nBem-Vindo %s, o jogo ja irá começar!\n", name);
		while (true) {
			System.out.printf("\nPara onde quer andar?(Norte w/Sul s)\n");
			char key = sc.next().charAt(0);
			main.printLine();
			if (key == 'w') {
				//int x = 1;
				int x = main.chooseRoom();
				if (x == 0) {
					int swd = room.swordRoom(sc);
					if (swd == 1) {
						player.setDMG(swd1.dmg);
						System.out.printf("\nVocê se sente meia-boca.\n");
					}
					else if (swd == 2) {
						player.setDMG(swd2.dmg);
						System.out.printf("\nVocê se sente mais forte!\n");
					}
					else if (swd == 3) {
						player.setDMG(swd3.dmg);
						System.out.printf("\nVocê sente como se o mundo fosse seu!!!\n");
					}
					else {
						System.out.printf("\nVocê não pegou a espada.\n");
					}
					main.printLine();
				}
				if (x <= 1) {
					boolean y = room.shieldRoom(sc);
					if (y && player.shield) {
						System.out.printf("\nVocê já tem um escudo.\n");
						continue;
					}else if (y) {
						System.out.printf("\nVocê pegou o escudo!\n");
						player.setShield(y);
					}else {
						System.out.printf("\nVocê não pegou o escudo...\n");
						continue;
					}
				}
			}
			if (key == 's') {
				System.out.printf("\nDeseja sair do jogo?(Sim y/Não n)\n");
				key = sc.next().charAt(0);
				if (key == 'y') {
					System.out.printf("\nO jogo acabou....");
					System.exit(0);
				}
				else {
					System.out.printf("\nO JOGO CONTINUA!\n");
					continue;
				}
			}
			if (key == 'i') {
				System.out.printf("\nSeu dano é %d.", player.getDMG());
			}
		}
	}
	public void printLine() {
		String line = "-----";
		System.out.printf("\n");
		System.out.printf(line.repeat(14));
		System.out.printf("\n");
	}
	public int chooseRoom() {
		Random rng = new Random();
		int x = rng.nextInt(2);
		return x;
	}
}
//System.out.printf("");
