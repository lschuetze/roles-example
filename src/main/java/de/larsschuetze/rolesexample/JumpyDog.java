package de.larsschuetze.rolesexample;

public class JumpyDog extends DogAbility {
	
	private int height;
	
	public JumpyDog() {
		super();
	}
	
	public JumpyDog(DogCore core, int height) {
		super(core);
		this.height = height;
	}
	
	public void jump() {
		// jump
	}
}
