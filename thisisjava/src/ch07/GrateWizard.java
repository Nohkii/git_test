package ch07;

public class GrateWizard extends Wizard{

	GrateWizard(String name, int hp, int ap) {
		super(name, hp+30, ap+50);
	}
	
	@Override
	void attack(Character c) {
		System.out.println("대마법사"+this.name+"가");
	}
	
}
