package apnacollege;

import java.util.Random;

public class DiceRoller {
	DiceRoller(){
		Random r=new Random();
		int number=0;
		roll(r,number);
	}
	void roll(Random r,int number){
		number=r.nextInt(6)+1;
		System.out.println(number);
	}
}
