package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {


	
	public static void main(String[] args) {
	//whileEx();
	dowhileEx();
	forEx();
	continueEx();
	}

	public static void randomEx() {
		System.out.println(Math.random()); // 0이상 1미만 실수값
	
		for (int i = 1; i <= 6; i++) {
			System.out.print((int)(Math.random() * 45) + 1 );
			System.out.print(" ");
		}
		System.out.println();

		// 연습문제
		// 위의 코드는 중복 발생가능
		// 중복을 허용하지 않는 6개의 난수를 뽑아보기
	}
	
	
	public static void breakEx() {
		//류프 도중 ,break문을 만나면
		// 해당 루프문을 종료하고 탈출
		
		// 1부터 증가시키면서 6과 14로 나누어 떨어지는 수를 구하자
		int num = 1;
		while(true) { // 무한루프
			if(num % 6 == 0 && num % 14 == 0)break;
			num ++;
		}
		System.out.println(num);
	}	
	public static void continueEx() {
		//루푸 도중. continue를 만나면
		// 남은 코드를 실행하지 않고 다은번 루프를 실행
		
		// 1부터 100까지 루프를 돌변서 2의 배수, 3의 배수는 출력하지 않고 다은번 루프 수행
			for (int i = 1; i <= 100; i++) {
				if ( i % 2 == 0 || i % 3 == 0) continue;
				
				System.out.print(i+" ");
			}
	
	}
		
	
	
	
	public static void gogoFor() {
		//2단부터9단까지 구구표를 for 문을 이용하여 출력
	}	

	public static void starsFor() {
	// 루푸돌려 출력for문 이용
	/* 
	 * 
	 **
	 ***
	 ****
	 *****
	 */
	}	

	public static void gogowhile() {
		//2단부터9단까지 구구표를 for 문을 이용하여 출력
	}	

	public static void starswhile() {
	// 루푸돌려 출력for문 이용
	/* 
	 * 
	 **
	 ***
	 ****
	 *****
	 */
	}	
	
	
	
	public static void forEx() {
		// 단을 입력 받아 해당 단의 구구표 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		for (int num = 1; num <= 9; num++) {
			System.out.println(dan + "*" +num+"="+ dan*num);
		}
		
		
	}	
	public static void dowhileEx() {
		int value = 0;
		int total = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 [0이면 quit]:");

		do {
			value = scanner.nextInt();
			total += value;
		} while (value !=0);
		System.out.print("합계:" +total);
		scanner.close();
		
	}
	public static void whileEx() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("단을 입력하세요:");
		
		int dan = scanner.nextInt();
		
		int num = 1;
		
		while(num <= 9) { //9이하 일때 반복
			System.out.println(dan + " * " + num + " = " + dan + num);
		}
	}

}