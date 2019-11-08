package Array;

import java.util.Arrays;
import java.util.Random;

public class DiceFrequancy01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int freq[]= new int [7];
		
		for (int roll = 0; roll < 30; roll++) {
			
			++freq[1 + rand.nextInt(6)];
			
		}
		System.out.println("Face\tFrequancy");
		
		for (int face = 1; face < freq.length; face++) {
			System.out.println(face+"\t"+freq[face]);
			
			
		}

	}

}
