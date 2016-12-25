package fcu.iecs.oop.pokemon2;

import fcu.iecs.oop.pokemon.PokemonType;

public abstract class Pokemon implements Fightable {
	private String Name;
	private PokemonType Type;
	private int CP;
	
	public Pokemon(String Name,int CP,PokemonType Type)
	{
		this.Name = Name;
		this.CP = CP;
		this.Type = Type;
	}
	
	public String GetName()
	{
		return this.Name;
	}
	
	public void SetName(String Name)
	{
		this.Name = Name;
	}
	
	public PokemonType GetType()
	{
		return this.Type;
	}
	
	public int GetCP()
	{
		return CP;
	}
	
	public void SetCP(int CP)
	{
		this.CP = CP;
	}
	
}
