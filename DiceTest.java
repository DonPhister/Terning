package terning;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceTest {

	@Test
	public void test() {
		Dice terning = new Dice();
		int et=0, to=0, tre=0, fire=0, fem=0, seks=0, i, m=0;
		while (m<60000){
		i=terning.roll();
		switch (i){
		case 1: et++; m++; break;
		case 2:  to++; m++; break;
		case 3: tre++; m++; break;
		case 4: fire++; m++; break;
		case 5: fem++; m++; break;
		case 6: seks++; m++;
		}
		}
		System.out.print("1'ere = " + et );
		System.out.print(" , 2'ere = " + to);
		System.out.print(" , 3'ere = " + tre);
		System.out.print(" , 4'ere = " + fire);
		System.out.print(" , 5'ere = " + fem);
		System.out.println(" , 6'ere = " + seks);
		System.out.print("Total: " + m);		
	}

}
