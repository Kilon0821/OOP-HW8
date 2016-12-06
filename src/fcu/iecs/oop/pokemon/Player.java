package fcu.iecs.oop.pokemon;

public class Player {
	private String Name;
	private Pokemon[] Pokemons;
	private int Level;
	
	public Player(String Name)
	{
		this.Name = Name;
		this.Level = 1;
	}
	
	public String GetPlayerName()
	{
		return this.Name;
	}
	
	public void SetPlayerName(String Name)
	{
		this.Name = Name;
	}
	
	public int GetPlayerLevel()
	{
		return this.Level;
	}
	
	public void SetPlayerLevel(int Level)
	{
		this.Level = Level;
	}
	
	public Pokemon[] GetPlayerPokemon()
	{
		return this.Pokemons;
	}
	
	public void SetPlayerPokemon(Pokemon[] Pokemon)
	{
		this.Pokemons = Pokemon;
	}
}
