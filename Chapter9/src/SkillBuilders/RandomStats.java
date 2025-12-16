package SkillBuilders;

public class RandomStats {
	public static void main(String [] args) {
		
		//declare an that one dimensional
		int[] outcomes = new int [10];
		int outcome;
		
		for(int i=0; i<100; i++) {
			outcome = (int)(10*Math.random());
			outcomes[outcome] += 1; //equals to outcomes[outcome] = outcomes[outcome] + 1;
		}
			//Display what is in the Array
			for(int i = 0; i < 10; i++) {
				System.out.println(outcomes[i]);
				System.out.println(" ");
			}
		}
	}

