package week2_class_20221995;

import java.util.Scanner;

public class chapter1_5 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >> ");
		int a = in.nextInt();
		
		if (a <= 0) {
			System.out.println("나이는 양수로만 입력하세요.");
			return;
		}
		
		int r = a / 10;
		a -= r * 10;
		int b = a / 5;
		a -= b * 5;
		int y = a;
		String result = "";
		boolean isEx = false;
		if (r != 0) {
			result += "빨간 초 " + r + "개";
			isEx = true;
		}
		if (b != 0) {
			if (isEx) {
				result += ", ";
			}
			result += "파란 초 " + b + "개";
			isEx = true;
		}
		if (y != 0) {
			if (isEx) {
				result += ", ";
			}
			result += "노란 초 " + y + "개";
		}
		result += ".";
		
		System.out.println(result + " 총 " + (r+b+y) + "개가 필요합니다.");
		
		
	}
	
}
