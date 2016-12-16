package fcu.iecs.oop.pokemon2;

import fcu.iecs.oop.pokemon.PokemonType;

public class Main {

	public static void main(String[] args) {
		Psyduck psyduck = new Psyduck("My First Psyduck", 100, PokemonType.WATER);
	    psyduck.Attack();
	    Charmander charmander = new Charmander("My First Charmander", 456, PokemonType.FIRE);
	    charmander.Attack();
	    Bulbasaur bulbasaur = new Bulbasaur("My First Bulbasaur", 589, PokemonType.GRASS);
	    bulbasaur.Attack();
	}

}
