import java.util.Random;
import java.util.Scanner;

public class PlayerStats 
{
	int lifepoints;
	int numOfcards;
	int dmg=0;
	
	
	
	public PlayerStats(int lifepoints, int numOfcards)
	{
		this.lifepoints = lifepoints;
		this.numOfcards = numOfcards;
	}
	
	public void PlayerHealth(String Character, int dmg)
	{
		lifepoints = lifepoints - dmg;
		System.out.println("\n" + Character + " Lifepoints: " + lifepoints);
		
	
	}
	public void PlayerHealth1(String Character)
	{
		
		System.out.println("\n" + Character + " Lifepoints: " + lifepoints);
		
	
	}
	
	
	
	private void hand(int draw)
	{
		System.out.println(numOfcards);
		numOfcards= numOfcards - draw;
	}
	
	public int getLifePoints()
	{
		return lifepoints;
	}
	
	public int getNumOfCards()
	{
		return numOfcards;
	}
	
	public boolean isDead()
	{
		boolean dead;
		if (lifepoints>0)
		{
			dead = false;
			return dead;
		}
		else 
		{
			dead = true;
			return dead;
		}
	}
	
		
}
