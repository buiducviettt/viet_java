package condition_bt1;

import java.util.Scanner;

//Cho 3 số nguyên. Tìm số lớn nhất trong 3 số đó
public class condition_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dau tien :");
		int num1 = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		int num2 = sc.nextInt();
		System.out.println("Nhap so thu ba:");
		int num3 = sc.nextInt();
		int soLonNhat;
		System.out.println("------------------");
		// Condition
		if (num1>num2 && num1>num3) {
			soLonNhat= num1;}
			else if (num2 < num3) {
		    soLonNhat = num3;
			}
			else {
				soLonNhat = num2;
				
			}
			System.out.println("So lon nhat la "+ soLonNhat);
		

		}
		
			
		
		
	}

	


