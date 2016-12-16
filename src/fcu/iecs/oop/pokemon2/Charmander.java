package fcu.iecs.oop.pokemon2;

import fcu.iecs.oop.pokemon.PokemonType;

public class Charmander extends Pokemon {

	public Charmander(String Name, int CP, PokemonType Type) {
		super(Name, CP, Type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Ember");
		//super.Attack();
	}
}
