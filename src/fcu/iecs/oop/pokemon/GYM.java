package fcu.iecs.oop.pokemon;

import java.util.Random;

public class GYM {
	
	public static void Playerfight(Player ...players)
	{
		Pokemon P1[] = players[0].GetPlayerPokemon();
		Pokemon P2[] = players[1].GetPlayerPokemon();
		
		int Win = 0;
		int Lost = 0;
		int P1Pokemon = 0;
		int P2Pokemon = 0;
		
		while(Win < 2 && Lost < 2)
		{
			if(P1[P1Pokemon].GetType() != P2[P2Pokemon].GetType())
			{
				if(TypeScan(P1[P1Pokemon].GetType(),P2[P2Pokemon].GetType()) == true)
				{
					System.out.println(P1[P1Pokemon].GetName() + " Win");
					Win++;
					P2Pokemon++;
				}
				else
				{
					System.out.println(P2[P2Pokemon].GetName() + " Win");
					Lost++;
					P1Pokemon++;
				}
			}
			
			else if(P1[P1Pokemon].GetCP() != P2[P2Pokemon].GetCP())
			{
				if(P1[P1Pokemon].GetCP() > P2[P2Pokemon].GetCP())
				{
					System.out.println(P1[P1Pokemon].GetName() + " Win");
					Win++;
					P2Pokemon++;
				}
				else
				{
					System.out.println(P2[P2Pokemon].GetName() + " Win");
					Lost++;
					P1Pokemon++;
				}
			}
			
			else
			{
				Random Rand = new Random();
				int Number = Rand.nextInt(2);
				
				if(Number == 1)
				{
					System.out.println(P1[P1Pokemon].GetName() + " Win");
					Win++;
					P2Pokemon++;
				}
				else
				{
					System.out.println(P2[P2Pokemon].GetName() + " Win");
					Lost++;
					P1Pokemon++;
				}
			}
		}
		
		if(Win == 2)
		{
			System.out.print("Winner is " + players[0].GetPlayerName());
			players[0].SetPlayerLevel(players[0].GetPlayerLevel() + 1);
			System.out.println(" ,and his/her level becomes " + players[0].GetPlayerLevel());
		}
		else
		{
			System.out.print("Winner is " + players[1].GetPlayerName());
			players[1].SetPlayerLevel(players[1].GetPlayerLevel() + 1);
			System.out.println(" ,and his/her level becomes " + players[1].GetPlayerLevel());
		}
	}
	
	public static boolean TypeScan(PokemonType P1Type,PokemonType P2Type)
	{
		if(P1Type == PokemonType.FIRE && P2Type == PokemonType.GRASS)
			return true;
		if(P1Type == PokemonType.GRASS && P2Type == PokemonType.WATER)
			return true;
		if(P1Type == PokemonType.WATER && P2Type == PokemonType.FIRE)
			return true;
		
		return false;
	}
	
}
