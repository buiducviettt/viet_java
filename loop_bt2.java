package loop_bt2;

import java.util.Iterator;

public class loop_bt2 {
	public static void main(String[] args) {
		int max_count = 0;
		int a = 2; // so nguyen to bat dau tu 2
		
	 System.out.println("In ra 20 so nguyen to dau tien:");
	 while (max_count <20) {
		 boolean isPrime = true;
		 for (int i = 2; i <= Math.sqrt(a) ; i++) {
			 if (a % i== 0) {
				 isPrime = false;
				 break;
				 
				
			}
			
		}
		 if (isPrime) {
			 System.out.print(a+ " ");
			 max_count ++;
			 
			
		}
		  a ++;
	 }
	}

}
