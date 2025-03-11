package week2_class_20221995;

import java.util.Scanner;

public class chapter1_6 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("나이를 입력하세요 >> ");
		int x1 = in.nextInt();
		int y1 = in.nextInt();
		int x2 = in.nextInt();
		int y2 = in.nextInt();
		boolean isIn = false;
		
		if (10 <= x1 && 10 <= x2 &&
			200 >= x1 && 200 >= x2 &&
			10 <= y1 && 10 <= y2 &&
			300 >= y1 && 300 >= y2) {
			isIn = true;
		}
		String result = "포함되지 않는다.";
		if (isIn) {
			result = "포함된다.";
		}
		System.out.println("("+x1+", "+y1+"), ("+x2+", "+y2+
				") 사각형은 (10, 10) (200, 300) 사각형에 "+result);
	}
	
}
