package mainPackage;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		stats();
		
	}
	
public static void stats(){
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("How many interceptions did the QB throw?:");
	double INT = input.nextInt();
	
	System.out.println("How many touchdowns did the QB throw?:");
	double TD = input.nextInt();
	
	System.out.println("How many passing yards did the QB have?:");
	double YDS = input.nextInt();
	
	System.out.println("How many completions did the QB have?:");
	double COMP = input.nextInt();
	
	System.out.println("How many attempted passes did the QB have?:");
	double ATT = input.nextInt();
	
	passerRating(INT, TD, YDS, COMP, ATT);
}

public static void passerRating(double INT, double TD, double YDS, double COMP, double ATT){

	double a = (((COMP/ATT)-.3)*5);
	double b = .25*((YDS/ATT)-3);
	double c = (TD/ATT)*20;
	double d = 2.375 -((INT/ATT)*25);
	
	double passerRating = ((a+b+c+d)/6)*100;
	System.out.println("the quarterback's passer rating is " + passerRating);
}

}
