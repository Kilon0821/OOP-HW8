package fcu.iecs.oop.pokemon2;

import fcu.iecs.oop.pokemon.PokemonType;

public class Psyduck extends Pokemon {

	public Psyduck(String Name, int CP, PokemonType Type) {
		super(Name, CP, Type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Attack() {
		System.out.println("Aqua Tail");
		//super.Attack();
	}
	
}
