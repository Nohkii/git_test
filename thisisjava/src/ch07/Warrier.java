package ch07;

public class Warrier extends Character {

	// 전사와..마법사와..싸움..

	Warrier(String name, int hp, int ap) {
		super(name, hp, ap);
	}

	void jumpAttack(Character c) {
		c.hp = c.hp - (this.ap + 10);
	}
}
