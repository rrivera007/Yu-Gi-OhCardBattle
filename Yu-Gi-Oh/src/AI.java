import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AI 
{
	int lifepoints;
	int dmg=0;
	int numOfcards;
	
	ArrayList<String> placeholdernameai = new ArrayList<String>();
	ArrayList<Integer> placeholderattackai = new ArrayList<Integer>();
	ArrayList<Integer> placeholderdefenseai = new ArrayList<Integer>();
	String[] CardName = new String[35];
	{
		CardName[0] = "Blue Eyes-White Dragon";
		CardName[1] = "Dark Magician";
		CardName[2] = "Summoned Skull";
		CardName[3] = "Celtic Guardian";
		CardName[4] = "Silver Fang";
		CardName[5] = "Battle Ox";
		CardName[6] = "Red Eyes-Black Ddragon";
		CardName[7] = "DarkFire Soldier";
		CardName[8] = "Time Wizard";
		CardName[9] = "Flame Swordsman";
		CardName[10] = "Illusionist Faceless Mage";
		CardName[11] = "Sonic Bird";
		CardName[12] = "Muka Muka";
		CardName[13] = "Dream Clown";
		CardName[14] = "Toon Skull";
		CardName[15] = "Dark Blade";
		CardName[16] = "Kuriboh";
		CardName[17] = "Black Luster Soldier";
		CardName[18] = "Elemental Hero Neo";
		CardName[19] = "Elemental Hero Sparkman";
		CardName[20] = "Elemental Hero Burstinatrix";
		
	}
	
	int[][] atkAnddef = new int [35][2];
	{
		atkAnddef[0][0] = 1000;
		atkAnddef[0][1] = 1000;
		atkAnddef[1][0] = 1200;
		atkAnddef[1][1] = 800; 
		atkAnddef[2][0] = 1400; 
		atkAnddef[2][1] = 900; 
		atkAnddef[3][0] = 1600;
		atkAnddef[3][1] = 1000; 
		atkAnddef[4][0] = 900;
		atkAnddef[4][1] = 1200; 
		atkAnddef[5][0] = 1100; 
		atkAnddef[5][1] = 600; 
		atkAnddef[6][0] = 1800; 
		atkAnddef[6][1] = 1200; 
		atkAnddef[7][0] = 1000;
		atkAnddef[7][1] = 1000;
		atkAnddef[8][0] = 1500; 
		atkAnddef[8][1] = 500; 
		atkAnddef[9][0] = 800; 
		atkAnddef[9][1] = 1400; 
		atkAnddef[10][0] = 1900; 
		atkAnddef[10][1] = 1600; 
		atkAnddef[11][0] = 2000;
		atkAnddef[11][1] = 600; 
		atkAnddef[12][0] = 1100; 
		atkAnddef[12][1] = 1000; 
		atkAnddef[13][0] = 1000; 
		atkAnddef[13][1] = 900; 
		atkAnddef[14][0] = 3000; 
		atkAnddef[14][1] = 100; 
		atkAnddef[15][0] = 1000; 
		atkAnddef[15][1] = 1300; 
		atkAnddef[16][0] = 1200; 
		atkAnddef[16][1] = 1200; 
		atkAnddef[17][0] = 1300; 
		atkAnddef[17][1] = 500;
		atkAnddef[18][0] = 1900;
		atkAnddef[18][1] = 700; 
		atkAnddef[19][0] = 700; 
		atkAnddef[19][1] = 2000; 
		atkAnddef[20][0] = 800; 
		atkAnddef[20][1] = 800; 
		
	}
	
	public AI (int lifepoints, int numOfcards)
	{
		this.lifepoints = lifepoints;
		this.numOfcards = numOfcards;
	}
	
	public void draw()
	{
		for (int cnt = 0; cnt<=1; cnt++)
		 {
			Random rand = new  Random();
			int draw = rand.nextInt(20);
			placeholdernameai.add(CardName[draw]);
			placeholderattackai.add(atkAnddef[draw][0]);
			placeholderdefenseai.add(atkAnddef[draw][1]);
			
		 }
	}
	
	
	public int getAttack(String opp)
	{
		
		System.out.println(opp + " Attacks you with " + placeholdernameai.get(0) + "\tAttack: " + placeholderattackai.get(0));
		return placeholderattackai.get(0);
	}
	
	public String AIselect (String opp)
	{
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int challenger = rand.nextInt(6);
		
		switch (challenger)
		{
			case 0:
			{
				opp = "Jaden Yuki";
				System.out.println("\nYour challenger is " + opp);
				return opp;
				
			}
			case 1:
			{
				opp = "Marik Ishtar";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			case 2:
			{
				opp = "DIO";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			case 3:
			{
				opp = "Pegasus";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			case 4:
			{
				opp = "Weavil";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			case 5:
			{
				opp = "Ash Ketchum";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			case 6:
			{
				opp = "Cell";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}
			default:
			{
				opp = "Genji";
				System.out.println("\nYour challenger is " + opp);
				return opp;
			}

		}
	}
	
	public void AIhealth(String opp, int dmg)
	{
		
		lifepoints = lifepoints - dmg;
		System.out.println("\n" + opp + " Lifepoints: " + lifepoints);
		
	}
	
	public void AIhealth1(String opp)
	{
		
		
		System.out.println("\n" + opp + " Lifepoints: " + lifepoints);
		
	}
	
	public boolean AIisDead()
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
