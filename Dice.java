package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		int d1=(int)(Math.random()+1);     // 0-1	
	}
	
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
