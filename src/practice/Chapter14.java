package practice;

import java.util.ArrayList;
import java.util.List;

public class Chapter14 {

	public static void main(String[] args) {
		List<Character> party = new ArrayList<Character>();
		Character soldier = new Soldier();
		Character playboy = new Playboy();
		party.add(soldier);
		party.add(playboy);

		Chapter14.partyAttack(party);
	}

	public static void partyAttack(List<Character> party) {
		for (Character character : party) {
			int hp = character.attack();
			System.out.println("ヒットポイント：" + hp);
		}
	}
}
