import java.util.Scanner;
public class SemesterTestV2{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		String Playing="y", direction="N", directionNorth="", directionSouth="", directionEast="", directionWest="", directionNorthW="", directionNorthE="", directionSouthW="", directionSouthE="";
		String sure="Yes", riddle;
		int directionNum=0, directionNorthNum=0, directionSouthNum=0, directionEastNum=0, directionWestNum=0, directionNorthWNum=0, directionNorthENum=0, directionSouthWNum=0, directionSouthENum=0;
		boolean weapon=false;
		System.out.println("Title");
		System.out.println("Created By: Justin Schneider");
		System.out.println("To make your choice type what it asks you to type follwed by clicking ENTER");
		System.out.println("If at any time you want to quit type \"quit\" and then click ENTER");
		System.out.print("Would you like to start? [y, n]: ");
		Playing=input.nextLine();
		while(Playing.equalsIgnoreCase("y")){
			System.out.println("Welcome Travler!");
			Delay(1000);
			System.out.println("I see you have finally awoken.");
			Delay(1000);
			System.out.println("We are going on a wagon ride.");
			Delay(1000);
			Direction path=new Direction(directionNum);
			if(directionNum==1){
				Delay10(1000);
				System.out.println("You are Heading North\n\t   North\n\t\t \u2022\n\t\t |\nWest\t +  \tEast\n\n\n\t   South");
				System.out.println("You arive at a camp with two paths leading in different directions.");
				System.out.println("One going left, and one going right.");
				System.out.print("Which path do you choose? [left, right, back]: ");
				directionNorth=input.nextLine();
				directionNorth=directionNorth.toUpperCase();
				switch(directionNorth){
					case "LEFT":
					case "RIGHT":
					case "BACK":
						directionNorthNum=1;
					default:
				}
				while(directionNorthNum!=1){
					System.out.print("Which path do you choose? [left, right]: ");
					directionNorth=input.nextLine();
					switch(directionNorth){
						case "LEFT":
						case "RIGHT":
						case "BACK":
							directionNorthNum=1;
						default:
					}
				}
				while(directionNorthNum==1);{
					if(directionNorth.equalsIgnoreCase("right")){
						Delay10(500);
						System.out.println("You came in contact with a troll. The only way to pass on the bridge is to answer his riddle.");
						Delay(1000);
						System.out.print("How did the plague happen?: ");
						riddle=input.nextLine();
						System.out.print("Are you sure? [yes, no]: ");
						sure=input.nextLine();
						if(riddle.equalsIgnoreCase("")&&sure.equalsIgnoreCase("Yes")){
							System.out.println("Congratulations, You Win!");
						}
						else{
							System.out.println("");
						}
					}
					else if(directionNorth.equalsIgnoreCase("left")){
						weapon=true;
						Delay10(500);
						System.out.println("As you start heading left you relized you ended up near a cave...");
						Delay(500);
						System.out.println("When you enter you find almost nothing, only a sword!");
						Delay(500);
						System.out.println("When you leave the cave you decited to head back to the camp");
						Delay10(500);
						System.out.println("After ariving to the camp you can go down the other path, or you can go back to the South [right, back]: ");
					}
					else{
					}
				}
			}
			else if(directionNum==2){
				System.out.println("You are Heading East\n\t   North\n\n\nWest\t +--\u2022\tEast\n\n\n\t   South");
				Delay10(1000);
			}
			else if(directionNum==3){
				System.out.println("You are Heading South\n\t   North\n\n\nWest\t +  \tEast\n\t\t\n\t\t |\n\t\t \u2022\n\t   South");
				Delay10(1000);
			}
			else if(directionNum==4){
				System.out.println("You are Heading West\n\t   North\n\n\nWest  \u2022--+\t  \tEast\n\n\n\t   South");
				Delay10(1000);
			}
			else if(directionNum==5){
				System.out.println("You are Heading North-East\n\t   North\n\t\t   /\n\t\t  /\nWest\t +  \tEast\n\n\n\t   South");
				Delay10(1000);
			}
			else if(directionNum==6){
				System.out.println("You are Heading North-West\n\t   North\n\t  \\\n\t   \\\nWest\t +  \tEast\n\n\t   South");
				Delay10(1000);
			}
			else if(directionNum==7){
				System.out.println("You are Heading South-East\n\t   North\n\n\nWest\t +  \tEast\n\t\t   \\\n\t\t\t\\\n\t   South");
				Delay10(1000);
			}
			else{
				System.out.println("You are Heading South-West\n\t   North\n\n\nWest\t +  \tEast\n\t   /\n\t  /\n\t   South");
				Delay10(1000);
			}
			System.exit(0);
		}
	}
	public static void Delay(int time){
		int delayTime;
		delayTime=time;
		try{
			Thread.sleep(delayTime);
		}
		catch (InterruptedException ie){
			ie.printStackTrace();
		}
	}
	public static void Delay10(int time){
		int delayTime;
		delayTime=time;
		int wait=5;
		String Print=". ";
		for(int loop=0; loop<wait; loop++){
			try{
				Thread.sleep(delayTime);
			}
			catch (InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.print(Print);
		}
		System.out.println("");
	}
}
