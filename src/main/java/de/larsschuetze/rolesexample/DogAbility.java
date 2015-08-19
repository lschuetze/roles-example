package de.larsschuetze.rolesexample;

import java.util.Collection;

public abstract class DogAbility implements Dog {

	private DogCore core;
	
	public DogAbility() {
		
	}

	public DogAbility(DogCore core) {
		this.core = core;
	}

	protected final void setCore(DogCore core) {
		this.core = core;
	}

	@Override
	public final void addAbility(String name) {
		core.addAbility(name);
	}

	@Override
	public final void removeAbility(String clazz) {
		core.removeAbility(clazz);
	}

	@Override
	public final Collection<? extends Dog> getAbilities() {
		return core.getAbilities();
	}

	@Override
	public final boolean hasAbility(String name) {
		return core.hasAbility(name);
	}

	@Override
	public Dog getAbility(String name) {
		return core.getAbility(name);
	}
	
	public String toString() {
		return "I am a " + getClass().getSimpleName();
	}

}
