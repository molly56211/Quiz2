package pkgmain;

import java.util.Scanner;

public class Main {
	private double tuition;
	private double percent;
	private double total;
	Scanner s = new Scanner(System.in);
	
	public void getTuition () {
		System.out.println("What is the initial tuition");
		tuition = s.nextDouble();
	}
	
	public void getPercent () {
		System.out.println("What is the percentage increase");
		tuition = s.nextDouble();
	}
	
	public void main(String[] args) {
		getTuition();
		getPercent();
		for (int i = 0; i<4; i++) {
			total += (tuition*percent);
			tuition = (tuition * percent);
		}
		
		System.out.println("Total cost is" + total);
	}
}


