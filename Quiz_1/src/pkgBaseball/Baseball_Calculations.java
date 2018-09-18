package pkgBaseball;
import java.util.Scanner;

public class Baseball_Calculations {


private double battingAverage;
private double onBasePercentage;
private double totalBases;
private double sluggishPercentage;
private double onBasesSlugging;

private double AB;
private double H;
private double B2;
private double B3;
private double HR;
private double R;
private double BB;
	
public static void main(String[] args) {
	
	Baseball player= new Baseball();
	
	
	System.out.println(player.getBA());
	System.out.println(player.getOBP());
	System.out.println(player.getTB());
	System.out.println(player.getSLG());
	System.out.println(player.getOBS());
	
}
}