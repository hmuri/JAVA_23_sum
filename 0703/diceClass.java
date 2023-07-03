import java.util.Scanner;
import java.util.Random;

class Dice{
	Random random = new Random();
	int face;
	
	public Dice() {
		face = 0;
	}
	
	public void roll() {
		this.face = random.nextInt(6)+1;
	}
	
	public int getValue(){
		return face;
	}
	
	public void setValue(int face) {
		this.face = face;
	}
}
public class main {
	public static void main(String args[]) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int count=0;
		while(true) {
			dice1.roll();
			dice2.roll();
			System.out.printf("주사위1 = %d 주사위2 = %d\n", dice1.getValue(), dice2.getValue());
			count++;
			if(dice1.getValue()==1&&dice2.getValue()==1)    break;
		}
		System.out.printf("(1,1)이 나오는데 걸린 횟수 = %d", count);
	}
}