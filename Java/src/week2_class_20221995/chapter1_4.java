package week2_class_20221995;

import java.util.Scanner;

public class chapter1_4 {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("여행지 >> ");
		String s = in.nextLine();
		System.out.print("인원수 >> ");
		int a = in.nextInt();
		System.out.print("숙박일 >> ");
		int b = in.nextInt();
		System.out.print("1인당 항공료 >> ");
		int c = in.nextInt();
		System.out.print("1방 숙박비 >> ");
		int d = in.nextInt();
		
		int e = (a / 2) + (a % 2);
		System.out.print(a + "명의 " + s + " " +
		b + "박 " + (b+1) + "일 여행에는 " + e + "개 필요하며 경비는 " +
				(e*d*b + a*c)+"원입니다.");
	}
	
}
