package practice;

public class Soldier implements Character {
	public Soldier() {
	}
	
	public int attack() {
		System.out.println("戦士の会心の一撃！");
		return 100;
	}
}
