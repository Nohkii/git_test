package ch07;

public class Battle {

	public static void main(String[] args) {

		Warrier warrier = new Warrier("전사", 100, 10);

		Wizard wizard = new Wizard("마법사", 80, 5);
		/* Wizard wizard = new GrateWizard("마법사", 80, 5);
		 이렇게 해도 오류나지 않음! Wizard가 부모이기때문에..자동형변환이 된다*/

		// 전사의 체력
		System.out.println("전사체력: " + warrier.hp);

		// 마법사의 체력
		System.out.println("마법사체력: " + wizard.hp);

		// 전사->마법사 공격
		warrier.attack(wizard);

		// 랜덤전투
		randomBattle(warrier, wizard);

		System.out.println("전사체력:" + warrier.hp);
		System.out.println("마법사체력:" + wizard.hp);

	}

	// 랜덤공격
	public static void randomBattle(Character c1, Character c2) {

		while (true) {
			int n = (int) (Math.random() * 2);
			Character[] c = new Character[2];
			if (n == 0) {
				c[0] = c1;
				c[1] = c2;
			} else {
				c[1] = c1;
				c[0] = c2;
			}
			c[0].attack(c[1]);
			if (c[0].hp == 0 || c[1].hp == 0) {
				System.out.println("게임 오버");
				break;
			}
		}
	}

}
