package week1.day2;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		//1,3,5,7,9
		int data=10;
		//for loop
		
		for (int i = 1; i <= data; i++) {
			
			if (i % 2 != 0) {
				System.out.println("Odd Numbers: "+i);
			}
			
		}
	

	}

}
