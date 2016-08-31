package data;

import java.lang.reflect.Field;

public class Weapon {
	private String name;
	private int ammunition;
	private MinMax reichweite;
	private MinMax damageInfanterie;
	private MinMax damageFahrzeugReifen;
	private MinMax damageFahrzeugHalbKette;
	private MinMax damageFahrzeugKette;
	private MinMax damageHelikopter;
	private MinMax damageFlugzeuge;
	private MinMax damageMarineeinheiten;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmmunition() {
		return ammunition;
	}

	public void setAmmunition(int ammunition) {
		this.ammunition = ammunition;
	}

	public MinMax getReichweite() {
		return reichweite;
	}

	public void setReichweite(MinMax reichweite) {
		this.reichweite = reichweite;
	}

	public void setReichweite(int min, int max) {
		this.reichweite = new MinMax(min, max);
	}

	public MinMax getDamageInfanterie() {
		return damageInfanterie;
	}

	public void setDamageInfanterie(MinMax damageInfanterie) {
		this.damageInfanterie = damageInfanterie;
	}

	public void setDamageInfanterie(int min, int max) {
		this.damageInfanterie = new MinMax(min, max);
	}

	public MinMax getDamageFahrzeugReifen() {
		return damageFahrzeugReifen;
	}

	public void setDamageFahrzeugReifen(MinMax damageFahrzeugReifen) {
		this.damageFahrzeugReifen = damageFahrzeugReifen;
	}

	public void setDamageFahrzeugReifen(int min, int max) {
		this.damageFahrzeugReifen = new MinMax(min, max);
	}

	public MinMax getDamageFahrzeugHalbKette() {
		return damageFahrzeugHalbKette;
	}

	public void setDamageFahrzeugHalbKette(MinMax damageFahrzeugHalbKette) {
		this.damageFahrzeugHalbKette = damageFahrzeugHalbKette;
	}

	public void setDamageFahrzeugHalbKette(int min, int max) {
		this.damageFahrzeugHalbKette = new MinMax(min, max);
	}

	public MinMax getDamageFahrzeugKette() {
		return damageFahrzeugKette;
	}

	public void setDamageFahrzeugKette(MinMax damageFahrzeugKette) {
		this.damageFahrzeugKette = damageFahrzeugKette;
	}

	public void setDamageFahrzeugKette(int min, int max) {
		this.damageFahrzeugKette = new MinMax(min, max);
	}

	public MinMax getDamageHelikopter() {
		return damageHelikopter;
	}

	public void setDamageHelikopter(MinMax damageHelikopter) {
		this.damageHelikopter = damageHelikopter;
	}

	public void setDamageHelikopter(int min, int max) {
		this.damageHelikopter = new MinMax(min, max);
	}

	public MinMax getDamageFlugzeuge() {
		return damageFlugzeuge;
	}

	public void setDamageFlugzeuge(MinMax damageFlugzeuge) {
		this.damageFlugzeuge = damageFlugzeuge;
	}

	public void setDamageFlugzeuge(int min, int max) {
		this.damageFlugzeuge = new MinMax(min, max);
	}

	public MinMax getDamageMarineeinheiten() {
		return damageMarineeinheiten;
	}

	public void setDamageMarineeinheiten(MinMax damageMarineeinheiten) {
		this.damageMarineeinheiten = damageMarineeinheiten;
	}

	public void setDamageMarineeinheiten(int min, int max) {
		this.damageMarineeinheiten = new MinMax(min, max);
	}

	public MinMax getDamageByName(String name)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = this.getClass().getField(name);
		MinMax value = (MinMax) field.get(this);
		return value;
	}

	/**
	 * @param name
	 * @param ammunition
	 * @param reichweite
	 * @param damageInfanterie
	 * @param damageFahrzeugReifen
	 * @param damageFahrzeugHalbKette
	 * @param damageFahrzeugKette
	 * @param damageHelikopter
	 * @param damageFlugzeuge
	 * @param damageMarineeinheiten
	 */
	public Weapon(String name, int ammunition, MinMax reichweite, MinMax damageInfanterie, MinMax damageFahrzeugReifen,
			MinMax damageFahrzeugHalbKette, MinMax damageFahrzeugKette, MinMax damageHelikopter, MinMax damageFlugzeuge,
			MinMax damageMarineeinheiten) {
		super();
		this.name = name;
		this.ammunition = ammunition;
		this.reichweite = reichweite;
		this.damageInfanterie = damageInfanterie;
		this.damageFahrzeugReifen = damageFahrzeugReifen;
		this.damageFahrzeugHalbKette = damageFahrzeugHalbKette;
		this.damageFahrzeugKette = damageFahrzeugKette;
		this.damageHelikopter = damageHelikopter;
		this.damageFlugzeuge = damageFlugzeuge;
		this.damageMarineeinheiten = damageMarineeinheiten;
	}
	
	
}
