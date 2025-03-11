package week2_class_20221995;

import java.util.Scanner;

public class chapter1_3 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("생일 입력 하세요 >> ");
		int i = in.nextInt();
		int year = i / 10000;
		i -= year * 10000;
		int month = i / 100;
		i -= month * 100;
		int day = i;
		System.out.print(year + "년 " + month + "월 " + day + "일");
	}
	
}
