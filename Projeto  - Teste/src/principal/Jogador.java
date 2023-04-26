package principal;

public class Jogador {
	private String name;
	private int hp = 30;
	private int dmg = 3;
	
	public Jogador(){
	}
	
	public String getName() {
		return name;
	}
	public int getHP() {
		return hp;
	}
	public int getDMG() {
		return dmg;
	}
	public void setHP(int new_hp) {
		hp = new_hp;
	}
	public void setDMG(int new_dmg) {
		dmg = new_dmg;
	}
}
//System.out.printf("");