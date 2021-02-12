import java.util.*;
public class CardsAndDecks 
{
	
	
	ArrayList<String> placeholdername = new ArrayList<String>();
	ArrayList<Integer> placeholderattack = new ArrayList<Integer>();
	ArrayList<Integer> placeholderdefense = new ArrayList<Integer>();
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
		CardName[21] = "Elemental Hero Clayman";
		CardName[22] = "Elemental Hero Avian";
		CardName[23] = "Elemental Hero Bladedge";
		CardName[24] = "Elemental Hero Bubbleman";
		CardName[25] = "Elemental Hero Wildheart";
		CardName[26] = "Dark Magician Girl";
		CardName[27] = "Red Gadget";
		CardName[28] = "Yellow Gadget";
		CardName[29] = "Green Gadget";
		CardName[30] = "Red Gadget";
		CardName[31] = "Blade Knight";
		CardName[32] = "Puppet Plant";
		CardName[33] = "Tiger Dragon";
		CardName[34] = "BattleGuard King";
		
		
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
		atkAnddef[21][0] = 1300; 
		atkAnddef[21][1] = 1000; 
		atkAnddef[22][0] = 1000; 
		atkAnddef[22][1] = 1700; 
		atkAnddef[23][0] = 600; 
		atkAnddef[23][1] = 1000; 
		atkAnddef[24][0] = 1800; 
		atkAnddef[24][1] = 1900; 
		atkAnddef[25][0] = 4000; 
		atkAnddef[25][1] = 100; 
		atkAnddef[26][0] = 1000; 
		atkAnddef[26][1] = 1000; 
		atkAnddef[27][0] = 1100; 
		atkAnddef[27][1] = 1000; 
		atkAnddef[28][0] = 1600; 
		atkAnddef[28][1] = 1300; 
		atkAnddef[29][0] = 100; 
		atkAnddef[29][1] = 4000; 
		atkAnddef[30][0] = 1000; 
		atkAnddef[30][1] = 1000; 
		atkAnddef[31][0] = 1000; 
		atkAnddef[31][1] = 1000; 
		atkAnddef[32][0] = 1400; 
		atkAnddef[32][1] = 800; 
		atkAnddef[33][0] = 1000; 
		atkAnddef[33][1] = 900; 
		atkAnddef[34][0] = 1500; 
		atkAnddef[34][1] = 1500; 
	}
	private String choosedeck;
	String card;
	int choose;
	
	
	
	public String ChooseDeck()
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Which deck would you like?\n");
		System.out.println("if you would like a description of each deck just enter yes. After that input the corresponding number next to the deck");
		System.out.println("1. Toon Monsters");
		System.out.println("2. Might and Magik");
		System.out.println("3. Bait, trap, and set");
		System.out.println("4. Legends of Tomorrow");
		System.out.println("5. Soldiers of other Worlds");
		
		String choosedeck = in.nextLine();
		
		if (choosedeck.charAt(0)=='y' || choosedeck.charAt(0)=='Y')
		{
			boolean run = true;
			
			while(run)
			{
				

			System.out.println("Enter the corresponding number");
			int Bio = in.nextInt();
			
			switch (Bio)
			{
				case 1:
				{
					
					System.out.println("The Toon Monsters deck is all about strength with numbers. With this deck your best bet would be to summon as many monsters as you can and as fast as you can to overwhelm your opponent.");
					System.out.println("This is a monster only deck and does not have trap or spell cards so it's a much more adavanced deck as every decision could spell victory or defeat!");
					break;
					
				}
				
				case 2:
				{
					
					System.out.println("The Might and Magik deck is all about monsters and spells. Either use spell cards to destroy your opponents monsters or to buff up your own.");
					System.out.println("This deck is all about careful calculation and reading your opponents moves to decide when to buff up or when to sacrifice your monsters to gain stronger ones!");
					break;
				}
				
				case 3:
				{
					
					System.out.println("The bait, trap, and set deck is one of the most difficult decks in the game.");
					System.out.println("This is a mix between monster, trap, and spell cards. This deck's main objective is to use the monster cards as bait so that you may use your trap cards and finish your opponent off with spells as they are left wide open");
					System.out.println("If you can bait, trap, and spell your opponents successfully, victory is guranteed");
					break;
				}
				
				case 4:
				{
					
					System.out.println("The Legends of tommorow deck is a monster and spell deck focused on fusion. That is that the main goal of the deck is to create more powerful monsters with the correct combination of monsters in your deck to become unstoppable");
					break;
				}
				
				case 5:
				{
					
					System.out.println("The Soldiers of other worlds deck is simply about strength in numbers, overwhelming your opponent with sheer numbers.");
					System.out.println("The objective of this deck is to build an army with your soldier cards to as large as can be");
					break;
				}
				default:
				{
					System.out.println("Invalid input");
				}
			}
				System.out.println("\nwould you like to see another bio? yes or no");
				in.nextLine();
				String more = in.nextLine();
				if (more.equals("NO") || more.equals("no") || more.equals("No"))
				{
					run = false;
					System.out.println("\nNow choose your deck");
					choosedeck = in.nextLine();
				}
			}	
				
			}
		
		switch (choosedeck.charAt(0))
		{
			case 'T':
			case 't':
			{
				System.out.println("\nYou have selected Toon Monsters");
				choosedeck = "Toon Monsters";
				return choosedeck;
			}
			case 'M':
			case 'm':
			{
				System.out.println("\nYou have selected Might and Magick");
				choosedeck = "Might and Magik";
				return choosedeck;
				
			}
			case 'B':
			case 'b':
			{
				System.out.println("\nYou have selected Bait, trap, and set");
				choosedeck = "Bait, trap, and set";
				return choosedeck;
			}
			case 'L':
			case 'l':
			{
				System.out.println("\nYou have selected Legends of Tomorrow");
				choosedeck = "Legends of Tomorrow";
				return choosedeck;
			}
			case 'S':
			case 's':
			{
				System.out.println("\nYou have selected Soldiers of other Worlds");
				choosedeck = "Soldiers of other Worlds";
				return choosedeck;
			}
			default:
			{
				choosedeck ="null";
				return choosedeck;
			}
			
		}
		
		
	}
	
	public String getchooseDeck()
	{
		return choosedeck;
	}
	
	public void DuelMonsterscards(String choosedeck)
	{
		switch (choosedeck.charAt(0))
		{
		case 'T':
		case 't':
		{
			CardName[0] = "Blue Eyes-White Dragon";
			CardName[1] = "Dark Magician";
			CardName[2] = "Summoned Skull";
			CardName[3] = "Celtic Guardian";
			CardName[4] = "Silver Fang";
			CardName[5] = "Battle Ox";
			CardName[6] = "Red Eyes-Black Ddragon";
			
			System.out.println("\nHere are your cards:\n");
			System.out.println(CardName[0] + "\tAttack: " + atkAnddef[0][0] + "\tDefense: " + atkAnddef[0][1]);
			System.out.println(CardName[1] + "\tAttack: " + atkAnddef[1][0] + "\tDefense: " + atkAnddef[1][1]);
			System.out.println(CardName[2] + "\tAttack: " + atkAnddef[2][0] + "\tDefense: " + atkAnddef[2][1]);
			System.out.println(CardName[3] + "\tAttack: " + atkAnddef[3][0] + "\tDefense: " + atkAnddef[3][1]);
			System.out.println(CardName[4] + "\tAttack: " + atkAnddef[4][0] + "\tDefense: " + atkAnddef[4][1]);
			System.out.println(CardName[5] + "\tAttack: " + atkAnddef[5][0] + "\tDefense: " + atkAnddef[5][1]);
			System.out.println(CardName[6] + "\tAttack: " + atkAnddef[6][0] + "\tDefense: " + atkAnddef[6][1]);
			System.out.println();
			
			boolean run = true; 
			
			while(run)
			{
				System.out.println("You drew: ");
			 for (int cnt = 0; cnt<2; cnt++)
			 {
				Random rand = new  Random();
				int draw = rand.nextInt(6);
				System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
				placeholdername.add(CardName[draw]);
				placeholderattack.add(atkAnddef[draw][0]);
				placeholderdefense.add(atkAnddef[draw][1]);
			
			 }
				run = false;
				
			}
			break;
			
		}
		case 'M':
		case 'm':
		{
			CardName[7] = "DarkFire Soldier";
			CardName[8] = "Time Wizard";
			CardName[9] = "Flame Swordsman";
			CardName[10] = "Illusionist Faceless Mage";
			CardName[11] = "Sonic Bird";
			CardName[12] = "Muka Muka";
			CardName[13] = "Dream Clown";
			
			System.out.println("\nHere are your cards:\n");
			System.out.println(CardName[7] + "\tAttack: " + atkAnddef[7][0] + "\tDefense: " + atkAnddef[7][1]);
			System.out.println(CardName[8] + "\tAttack: " + atkAnddef[8][0] + "\tDefense: " + atkAnddef[8][1]);
			System.out.println(CardName[9] + "\tAttack: " + atkAnddef[9][0] + "\tDefense: " + atkAnddef[9][1]);
			System.out.println(CardName[10] + "\tAttack: " + atkAnddef[10][0] + "\tDefense: " + atkAnddef[10][1]);
			System.out.println(CardName[11] + "\tAttack: " + atkAnddef[11][0] + "\tDefense: " + atkAnddef[11][1]);
			System.out.println(CardName[12] + "\tAttack: " + atkAnddef[12][0] + "\tDefense: " + atkAnddef[12][1]);
			System.out.println(CardName[13] + "\tAttack: " + atkAnddef[13][0] + "\tDefense: " + atkAnddef[13][1]);
			System.out.println();
			
			boolean run = true; 
			
			
			
			
			while(run)
			{
				System.out.println("You drew: ");
			 for (int cnt = 0; cnt<2; cnt++)
			 {
				Random rand = new  Random();
				int draw = rand.nextInt(13) + 7;
				System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
				placeholdername.add(CardName[draw]);
				placeholderattack.add(atkAnddef[draw][0]);
				placeholderdefense.add(atkAnddef[draw][1]);
			
			 }
				run = false;
				
			}
			break;
			
		}
		case 'B':
		case 'b':
		{
			CardName[14] = "Toon Skull";
			CardName[15] = "Dark Blade";
			CardName[16] = "Kuriboh";
			CardName[17] = "Black Luster Soldier";
			CardName[18] = "Elemental Hero Neo";
			CardName[19] = "Elemental Hero Sparkman";
			CardName[20] = "Elemental Hero Burstinatrix";
			
			
			System.out.println("\nHere are your cards:\n");
			System.out.println(CardName[14] + "\tAttack: " + atkAnddef[14][0] + "\tDefense: " + atkAnddef[14][1]);
			System.out.println(CardName[15] + "\tAttack: " + atkAnddef[15][0] + "\tDefense: " + atkAnddef[15][1]);
			System.out.println(CardName[16] + "\tAttack: " + atkAnddef[16][0] + "\tDefense: " + atkAnddef[16][1]);
			System.out.println(CardName[17] + "\tAttack: " + atkAnddef[17][0] + "\tDefense: " + atkAnddef[17][1]);
			System.out.println(CardName[18] + "\tAttack: " + atkAnddef[18][0] + "\tDefense: " + atkAnddef[18][1]);
			System.out.println(CardName[19] + "\tAttack: " + atkAnddef[19][0] + "\tDefense: " + atkAnddef[19][1]);
			System.out.println(CardName[20] + "\tAttack: " + atkAnddef[20][0] + "\tDefense: " + atkAnddef[20][1]);
			System.out.println();
			
			boolean run = true; 
			
			while(run)
			{
				System.out.println("You drew: ");
			 for (int cnt = 0; cnt<2; cnt++)
			 {
				Random rand = new  Random();
				int draw = rand.nextInt(20) + 14;
				System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
				placeholdername.add(CardName[draw]);
				placeholderattack.add(atkAnddef[draw][0]);
				placeholderdefense.add(atkAnddef[draw][1]);
			
			 }
				run = false;
				
			}
			break;
			
		}
		case 'L':
		case 'l':
		{
			CardName[21] = "Elemental Hero Clayman";
			CardName[22] = "Elemental Hero Avian";
			CardName[23] = "Elemental Hero Bladedge";
			CardName[24] = "Elemental Hero Bubbleman";
			CardName[25] = "Elemental Hero Wildheart";
			CardName[26] = "Dark Magician Girl";
			CardName[27] = "Red Gadget";
			
			System.out.println("\nHere are your cards:\n");
			System.out.println(CardName[21] + "\tAttack: " + atkAnddef[21][0] + "\tDefense: " + atkAnddef[21][1]);
			System.out.println(CardName[22] + "\tAttack: " + atkAnddef[22][0] + "\tDefense: " + atkAnddef[22][1]);
			System.out.println(CardName[23] + "\tAttack: " + atkAnddef[23][0] + "\tDefense: " + atkAnddef[23][1]);
			System.out.println(CardName[24] + "\tAttack: " + atkAnddef[24][0] + "\tDefense: " + atkAnddef[24][1]);
			System.out.println(CardName[25] + "\tAttack: " + atkAnddef[25][0] + "\tDefense: " + atkAnddef[25][1]);
			System.out.println(CardName[26] + "\tAttack: " + atkAnddef[26][0] + "\tDefense: " + atkAnddef[26][1]);
			System.out.println(CardName[27] + "\tAttack: " + atkAnddef[27][0] + "\tDefense: " + atkAnddef[27][1]);
			System.out.println();
			
			boolean run = true; 
			
			while(run)
			{
				System.out.println("You drew: ");
			 for (int cnt = 0; cnt<2; cnt++)
			 {
				Random rand = new  Random();
				int draw = rand.nextInt(27) + 21;
				System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
				placeholdername.add(CardName[draw]);
				placeholderattack.add(atkAnddef[draw][0]);
				placeholderdefense.add(atkAnddef[draw][1]);
			
			 }
				run = false;
				
			}
			break;
			
		}
		case 'S':
		case 's':
		{
			CardName[28] = "Yellow Gadget";
			CardName[29] = "Green Gadget";
			CardName[30] = "Red Gadget";
			CardName[31] = "Blade Knight";
			CardName[32] = "Puppet Plant";
			CardName[33] = "Tiger Dragon";
			CardName[34] = "BattleGuard King";
			
			System.out.println("\nHere are your cards:\n");
			System.out.println(CardName[28] + "\tAttack: " + atkAnddef[28][0] + "\tDefense: " + atkAnddef[28][1]);
			System.out.println(CardName[29] + "\tAttack: " + atkAnddef[29][0] + "\tDefense: " + atkAnddef[29][1]);
			System.out.println(CardName[30] + "\tAttack: " + atkAnddef[30][0] + "\tDefense: " + atkAnddef[30][1]);
			System.out.println(CardName[31] + "\tAttack: " + atkAnddef[31][0] + "\tDefense: " + atkAnddef[31][1]);
			System.out.println(CardName[32] + "\tAttack: " + atkAnddef[32][0] + "\tDefense: " + atkAnddef[32][1]);
			System.out.println(CardName[33] + "\tAttack: " + atkAnddef[33][0] + "\tDefense: " + atkAnddef[33][1]);
			System.out.println(CardName[34] + "\tAttack: " + atkAnddef[34][0] + "\tDefense: " + atkAnddef[34][1]);
			System.out.println();
			
			boolean run = true; 
			
			while(run)
			{
				System.out.println("You drew: ");
			 for (int cnt = 0; cnt<2; cnt++)
			 {
				Random rand = new  Random();
				int draw = rand.nextInt(34) + 28;
				System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
				placeholdername.add(CardName[draw]);
				placeholderattack.add(atkAnddef[draw][0]);
				placeholderdefense.add(atkAnddef[draw][1]);
			
			 }
				run = false;
				
			}
			break;
			
		} 
		}
	}
	
	public void draw(String choosedeck)
	{
		switch (choosedeck.charAt(0))
		{
			case 'T':
			case 't':
			{
				for (int cnt = 0; cnt<1; cnt++)
				 {
					System.out.println("\nYou drew: ");
					Random rand = new  Random();
					int draw = rand.nextInt(6);
					System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
					placeholdername.add(CardName[draw]);
					placeholderattack.add(atkAnddef[draw][0]);
					placeholderdefense.add(atkAnddef[draw][1]);
				
				 }
				break;
			}
			case 'M':
			case 'm':
			{
				for (int cnt = 0; cnt<1; cnt++)
				 {
					System.out.println("\nYou drew: ");
					Random rand = new  Random();
					int draw = rand.nextInt(13) + 7;
					System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
					placeholdername.add(CardName[draw]);
					placeholderattack.add(atkAnddef[draw][0]);
					placeholderdefense.add(atkAnddef[draw][1]);
				
				 }
				break;
			}
			case 'B':
			case 'b':
			{
				for (int cnt = 0; cnt<1; cnt++)
				 {
					System.out.println("\nYou drew: ");
					Random rand = new  Random();
					int draw = rand.nextInt(20) + 14;
					System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
					placeholdername.add(CardName[draw]);
					placeholderattack.add(atkAnddef[draw][0]);
					placeholderdefense.add(atkAnddef[draw][1]);
				
				 }
				break;
			}
			case 'L':
			case 'l':
			{
				for (int cnt = 0; cnt<1; cnt++)
				 {
					System.out.println("\nYou drew: ");
					Random rand = new  Random();
					int draw = rand.nextInt(27) + 21;
					System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
					placeholdername.add(CardName[draw]);
					placeholderattack.add(atkAnddef[draw][0]);
					placeholderdefense.add(atkAnddef[draw][1]);
				
				 }
				break;
			}
			case 'S':
			case 's':
			{
				for (int cnt = 0; cnt<1; cnt++)
				 {
					System.out.println("\nYou drew: ");
					Random rand = new  Random();
					int draw = rand.nextInt(34) + 28;
					System.out.println(CardName[draw] + "\tAttack: " + atkAnddef[draw][0] + "\tDefense: " + atkAnddef[draw][1]);
					placeholdername.add(CardName[draw]);
					placeholderattack.add(atkAnddef[draw][0]);
					placeholderdefense.add(atkAnddef[draw][1]);
				
				 }
				break;
			}
			default:
			{
				System.out.println("null");
			}
		
		}
	}
	
	public void battle()
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Which card will you play: type 1 or 2");
		choose = in.nextInt();
		System.out.println(placeholdername.get(choose-1) + " is on the field and attacks");	
		
		
		
	}
	
	public int getAttack(String character)
	{
		System.out.println(character + " Attacks with " + placeholdername.get(0) + "\tAttack: " + placeholderattack.get(0));
		placeholdername.remove(choose-1);
		placeholderattack.remove(choose-1);
		placeholderdefense.remove(choose-1);
		return placeholderattack.get(0);
	}
	


}