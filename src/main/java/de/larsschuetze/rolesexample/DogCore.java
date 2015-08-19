package de.larsschuetze.rolesexample;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DogCore implements Dog {

	private Map<Class<?>, DogAbility> abilities;
	protected int age;
	protected int numberOfTeeth;
	protected int gumpiness;
	
	public DogCore() {
		abilities = new HashMap<>();
	}

	@Override
	public void addAbility(String name) {
		try {
			Class<?> clazz = Class.forName(name);
			if (DogAbility.class.isAssignableFrom(clazz)) {
				DogAbility ability = (DogAbility) clazz.newInstance();
				ability.setCore(this);
				abilities.put(clazz, ability);
			}
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeAbility(String name) {
		try {
			Class<?> clazz = Class.forName(name);
			if (DogAbility.class.isAssignableFrom(clazz)) {
				abilities.remove(clazz);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Collection<? extends Dog> getAbilities() {
		return Collections.unmodifiableCollection(abilities.values());
	}

	@Override
	public boolean hasAbility(String clazz) {
		return abilities.containsKey(clazz);
	}

	@Override
	public Dog getAbility(String name) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName(name);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
		return abilities.get(clazz);
	}
}
