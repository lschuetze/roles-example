package de.larsschuetze.rolesexample;

import java.util.Collection;

public interface Dog {
	public void addAbility(String name);
	public void removeAbility(String clazz);
	public Collection<? extends Dog> getAbilities();
	public Dog getAbility(String name);
	public boolean hasAbility(String name);
}
