package org.sample;

public class WarShips {

	public static void main(String[] args) {
		
		System.out.println("Optimal strategy: " + Process(2,3));
	}
	
	public static int Process (int input1, int input2) {
		
		int ships = 1;
		int value = 0;
		int n = input1;
		if(input1 < 2) {
			System.out.println("Total no of ships: "+ ships);
			return input1 % input2;
		}
		else {
			do {
				value += ((input1 * input1 + 1) % input2) - 1;
				ships += (value * value + 1) % input2;
				System.out.println("Total no of ships: "+ ships);
				n--;
				return ships % input2;
			}
			while(n>1);
		}
	}

}
