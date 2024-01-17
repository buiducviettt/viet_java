package condition_bt1;

import java.util.Scanner;

/*Viết chương trình nhập vào điểm của một học viên. Kết quả trả về là xếp loại của học viên đó. 
 * Yêu cầu:
	- Lớn hơn 8 điểm là giỏi 
	- Lớn hơn 6,5 điểm là khá
	- Lớn hơn 5 điểm là trung bình
	- Còn lại là yếu
 */

public class condition_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap diem cua hoc vien:");
		double a =sc.nextDouble();
		System.out.println("------------------------");
		// Condition 
		if (a>8.5 ) {
			System.out.println("Hoc sinh gioi");
			
		}
		else if (a>6.5) {
			System.out.println("Hoc sinh kha");
			
		}
		else if (a>5) {
			System.out.println("Hoc sinh trung binh");
		}
		else {
			System.out.println("Hoc sinh kem");
		}
		
			
		
		}
			
		}
		
	


