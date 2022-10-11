
import java.lang.Math;
import java.util.Scanner;

public class HeirsDilema {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		
		int low;
		int high;
		int numCombo = 0;
		System.out.println("enter small digit");
		low = input.nextInt();

		System.out.println("enter high digit");
		high = input.nextInt();
		
		for(int i = low; i < high; i++) {
			boolean checkAllDifferent = true;
			boolean checkDivide = true;
			boolean flag = true;
			int myArray [];
			
			myArray = new int [6];
			
			//find individual digits from 6 digit code	
			int index = 0;
			for(int x = 5; x > -1; x--) {
				
				myArray[index] = (i/(int)Math.pow(10, x))%10;
				
				if(myArray[index] == 0) {
					flag = false;
				}
				
				index++;
			}
				//check if all digits are different
				for(int j = 0; j < 5; j++) {
					for(int y = j+1; y < 6; y++) {
						if(myArray[j] == myArray[y]) {
							checkAllDifferent = false;
						}	
					}
				}
				
				if(flag == false) {
					checkDivide = false;
				}
				//check if divisble by each integer
				if(checkAllDifferent && flag) {
					for(int k = 0; k < 6; k++) {
						if(i % myArray[k] != 0) {
							checkDivide = false;
						}
					}
				}
			if(checkAllDifferent == true && checkDivide == true) {
				numCombo++;
			}
			
		}
		System.out.println(numCombo);
	}
}
