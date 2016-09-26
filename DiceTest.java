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
		assertEquals(10000,et,400);
		assertEquals(10000,to,400);
		assertEquals(10000,tre,400);
		assertEquals(10000,fire,400);
		assertEquals(10000,fem,400);
		assertEquals(10000,seks,400);
		assertEquals(60000,m);		
	}

}
