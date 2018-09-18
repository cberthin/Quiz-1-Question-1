package pkgBaseball;

import java.util.Scanner;

public class Baseball {
	private double AB;
	private double H;
	private double B2;
	private double B3;
	private double HR;
	private double R;
	private double BB;
	private double B=(H-B2-B3-HR);
	private double SF;
	private double HBP;
	
	private String name;
	private double BA;
	private double TB;
	private double SLG;
	private double OBP;
	private double OBS;
	
	private Scanner stdin=new Scanner(System.in);
	
	public Baseball() {
		System.out.println("Please input player's name");
			String name=stdin.nextLine();
		
		System.out.println("Please input the number of At Bats");
			AB=stdin.nextDouble();

		System.out.println("Please input the number of Hits");
			H=stdin.nextDouble();

		System.out.println("Please input the number of doubles");
			B2=stdin.nextDouble();

		System.out.println("Please input the number of triples");
			B3=stdin.nextDouble();

		System.out.println("Please input the number of homeruns");
			HR=stdin.nextDouble();

		System.out.println("Please input the number of runs");
			R=stdin.nextDouble();
		
		System.out.println("Please input the number of walks");
			BB=stdin.nextDouble();
			
		System.out.println("Please input the number of Sacrifice Flies");
			SF=stdin.nextDouble();
			
		System.out.println("Please input the number of Hits by Pitch");
			HBP=stdin.nextDouble();

	stdin.close();
	
	this.battingAverage();
	this.totalBases();
	this.sluggingPercentage();
	this.onBasePercentage();
	this.onBasesSlugging();
	}
	
	public void battingAverage() {
		BA=H/AB;
	}
	
	public void totalBases() {
		TB=(H-B2-B3-HR)+(2*B2)+(3*B3)+(4*HR);
	}
	
	public void sluggingPercentage() {
		SLG=((1*(H-B2-B3-HR))+(2*B2)+(3*B3)+(4*HR))/AB;
	}
	
	public void onBasePercentage() {
		OBP=(H+BB+HBP)/(AB+BB+HBP+SF);
	}
	
	public void onBasesSlugging() {
		OBS=OBP+SLG;
	}
	
	public double getBA() {
		return this.BA;
	}
	
	public void setAB(double ba) {
		this.BA=ba;
	}
	
	public double getTB() {
		return this.TB;
	}
	
	public void setTB(double tb) {
		this.TB=tb;
	}
	
	public double getSLG() {
		return this.SLG;
	}
	
	public void setSLG(double slg) {
		this.SLG=slg;
	}
	
	public double getOBP() {
		return this.OBP;
	}
	
	public void setOBP(double obp) {
		this.OBP=obp;
	}
	
	public double getOBS() {
		return this.OBS;
	}
	
	public void setOBS(double obs) {
		this.OBS=obs;
	}
	
}

