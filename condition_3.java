package condition_bt1;
/*Viết chương trình nhập vào 1 số. Nếu số đó lớn hơn 0 thì in ra 
chuỗi "Positive", nhỏ hơn 0 thì in chuỗi "Negative", bằng 0 thì in ra chính số 0*/

import java.util.Scanner;

public class condition_3 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhap vao 1 so :");
			double a = sc.nextDouble();
			System.out.println("-----------------");
			// Condition 
			if (a>0) {
				System.out.println("Positive");
				
			}
			else if (a <0) {
				System.out.println("Negative");
				
			}
			else {
				System.out.println(0);
			}
		}

}
