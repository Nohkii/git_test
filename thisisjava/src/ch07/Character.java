package ch07;

public class Character {

	String name;
	int hp; // 체력
	int ap; // 공격력

	Character(String name, int hp, int ap) {
		this.name = name;
		this.hp = hp;
		this.ap = ap;
	}

	void attack(Character c) {
		System.out.println(this.name + "가 " + c.name + "를 공격");
		c.hp = c.hp - this.ap;
		c.hp = c.hp < 0 ? 0 : c.hp - this.ap;

	}
}
