/**
 * @(#)Direction.java
 *
 *
 * @author 
 * @version 1.00 2019/1/4
 */


import java.util.Scanner;
public class Direction {
	private String directionName;
	private int directionNumOut, Way;
	public Direction(int directionNum){
		directionNumOut=directionNum;
		Way();
	}
	public int Way(){
		Scanner input=new Scanner(System.in);
		System.out.println("Did you want to go\n\t   North\n\n\nWest\t +  \tEast\n\n\n\t   South");
		try{
			Thread.sleep(1000);
		}
		catch (InterruptedException ie){
			ie.printStackTrace();
		}
		System.out.print("\t[N, E, S, W]: ");
		directionName=input.nextLine();
		directionName=directionName.toUpperCase();
		switch(directionName){
			case "N":
				directionNumOut=1;
				break;
			case "E":
				directionNumOut=2;
				break;
			case "S":
				directionNumOut=3;
				break;
			case "W":
				directionNumOut=4;
				break;
			case "NE":
				directionNumOut=5;
				break;
			case "NW":
				directionNumOut=6;
				break;
			case "SE":
				directionNumOut=7;
				break;
			case "SW":
				directionNumOut=8;
				break;
			case "QUIT":
				System.exit(0);
				break;
			default:
		}
		while(directionNumOut!=1&&directionNumOut!=2&&directionNumOut!=3&&directionNumOut!=4&&directionNumOut!=5&&directionNumOut!=6&&directionNumOut!=7&&directionNumOut!=8){
			System.out.println("That is an INVALID direcion!");
			System.out.println("Please try again!");
			System.out.println("Did you want to go\n\t   North\n\n\nWest\t +  \tEast\n\n\n\t   South");
			System.out.print("\t[N, E, S, W]: ");
			directionName=input.nextLine();
			directionName=directionName.toUpperCase();
			switch(directionName){
				case "N":
					directionNumOut=1;
					break;
				case "E":
					directionNumOut=2;
					break;
				case "S":
					directionNumOut=3;
					break;
				case "W":
					directionNumOut=4;
					break;
				case "NE":
					directionNumOut=5;
					break;
				case "NW":
					directionNumOut=6;
					break;
				case "SE":
					directionNumOut=7;
					break;
				case "SW":
					directionNumOut=8;
					break;
				case "QUIT":
					System.exit(0);
					break;
				default:
			}
		}
		return directionNumOut;
	}
}