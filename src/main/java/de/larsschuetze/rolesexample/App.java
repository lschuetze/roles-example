package de.larsschuetze.rolesexample;

/**
 * Hello world!
 *
 */
public class App {

	private final static String LAZY_DOG = "de.larsschuetze.rolesexample.LazyDog";
	private final static String JUMPY_DOG = "de.larsschuetze.rolesexample.JumpyDog";

	public static void main(String[] args) {
		Dog dog = new DogCore();
		/* The dog is just a lazy dog */
		System.out.println("The dog is just a lazy dog");
		dog.addAbility(LAZY_DOG);
		System.out.println(dog.getAbility(LAZY_DOG));

		/* The dog learns to jump */
		System.out.println("The dog learns to jump");
		dog.addAbility(JUMPY_DOG);
		System.out.println(dog.getAbility(JUMPY_DOG));

		/* The dog forgets to jump */
		System.out.println("The dog forgets to jump");
		dog.removeAbility(JUMPY_DOG);
		for (Dog d : dog.getAbilities()) {
			System.out.println(d);
		}
	}
}
