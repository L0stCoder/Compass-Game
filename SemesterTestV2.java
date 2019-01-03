import java.util.Scanner;
public class SemesterTestV2{
    public static void main(String[]args){
   		Scanner input=new Scanner(System.in);
   		String Playing="y", direction="N";
   		int directionNum=0;
   		System.out.println("Title");
   		System.out.println("Created By: Justin Schneider");
   		System.out.print("Would you like to start? [y, n]: ");
   		Playing=input.nextLine();
   		while(Playing.equalsIgnoreCase("y")){
   			System.out.println("Welcome Travler!");
   			Delay();
   			System.out.println("I see you have finally awoken.");
   			Delay();
   			System.out.println("We are going on a wagon ride.");
   			Delay();
   			System.out.println("Did you want to go\n\t   North\n\n\nWest\t +  \tEast\n\n\n\t   South");
   			Delay();
   			System.out.print("[N, E, S, W]: ");
   			direction=input.nextLine();
   			switch(direction){
   				case "N":
   				case "n":
   					directionNum=1;
   					break;
   				case "E":
   				case "e":
   					directionNum=2;
   					break;
   				case "S":
   				case "s":
   					directionNum=3;
   					break;
   				case "W":
   				case "w":
   					directionNum=4;
   					break;
   				case "NE":
   				case "ne":
   				case "Ne":
   				case "nE":
   					directionNum=5;
   					break;
   				case "NW":
   				case "nw":
   				case "Nw":
   				case "nW":
   					directionNum=6;
   					break;
   				case "SE":
   				case "se":
   				case "Se":
   				case "sE":
   					directionNum=7;
   					break;
   				case "SW":
   				case "sw":
   				case "Sw":
   				case "sW":
   					directionNum=8;
   					break;
   				default:
   			}
   			while(directionNum!=1&&directionNum!=2&&directionNum!=3&&directionNum!=4&&directionNum!=5&&directionNum!=6&&directionNum!=7&&directionNum!=8){
   				System.out.println("That is an INVALID direcion!");
   				System.out.println("Please try again!");
   				System.out.print("[N, E, S, W]: ");
   				direction=input.nextLine();
   				switch(direction){
   					case "N":
   					case "n":
   						directionNum=1;
   						break;
   					case "E":
   					case "e":
   						directionNum=2;
   						break;
   					case "S":
   					case "s":
   						directionNum=3;
   						break;
   					case "W":
   					case "w":
   						directionNum=4;
   						break;
   					case "NE":
   					case "ne":
   					case "Ne":
   					case "nE":
   						directionNum=5;
   						break;
   					case "NW":
   					case "nw":
   					case "Nw":
   					case "nW":
   						directionNum=6;
   						break;
   					case "SE":
   					case "se":
   					case "Se":
   					case "sE":
   						directionNum=7;
   						break;
   					case "SW":
   					case "sw":
   					case "Sw":
   					case "sW":
   						directionNum=8;
   						break;
   					default:
   				}
   			}
   			if(directionNum==1){
   				System.out.println("You entered N");
   				System.out.println("You are Heading North\n\t   North\n\t\t \u2022\n\t\t |\nWest\t +  \tEast\n\n\n\t   South");
   			}
   			else if(directionNum==2){
   				System.out.println("You entered E");
   				System.out.println("You are Heading East\n\t   North\n\n\nWest\t +--\u2022\tEast\n\n\n\t   South");
   			}
   			else if(directionNum==3){
   				System.out.println("You entered S");
   				System.out.println("You are Heading South\n\t   North\n\n\nWest\t +  \tEast\n\t\t\n\t\t |\n\t\t \u2022\n\t   South");
   			}
   			else if(directionNum==4){
   				System.out.println("You entered W");
   				System.out.println("You are Heading West\n\t   North\n\n\nWest  \u2022--+\t  \tEast\n\n\n\t   South");
   			}
   			else if(directionNum==5){
   				System.out.println("You entered NE");
   				System.out.println("You are Heading NorthEast\n\t   North\n\t\t \u2022\n\t\t |\nWest\t +  \tEast\n\n\n\t   South");
   			}
   			else if(directionNum==6){
   				System.out.println("You entered NW");
   				System.out.println("You are Heading NorthWest\n\t   North\n\n\nWest\t +--\u2022\tEast\n\n\n\t   South");
   			}
   			else if(directionNum==7){
   				System.out.println("You entered SE");
   				System.out.println("You are Heading SouthEast\n\t   North\n\n\nWest\t +  \t\tEast\n\t\t /\n\t\t |\n\t\t \u2022\n\t   South");
   			}
   			else{
   				System.out.println("You entered SW");
   				System.out.println("You are Heading SouthEast\n\t   North\n\n\nWest\t +  \tEast\n\t   /\n\t /\n\t   South");
   			}
   			System.exit(0);
   		}
   	}
   	public static void Delay(){
    	try{
   			Thread.sleep(1000);
   		}
   		catch (InterruptedException ie){
   			ie.printStackTrace();
   		}
    }
}