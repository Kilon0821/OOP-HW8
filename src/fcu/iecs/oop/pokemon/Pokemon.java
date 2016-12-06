package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private String Name;
	private int CP;
	private PokemonType Type;
	
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
