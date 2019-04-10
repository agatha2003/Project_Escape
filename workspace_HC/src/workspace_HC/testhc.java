package workspace_HC;

import java.util.Scanner;

public class testhc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = 700;
		int num = -1;
		while (num != 0) {
			System.out.println("1~7단계중 탈출할 단계를 입력하세요");
			System.out.println("0입력 : 종료");

			num = sc.nextInt();

			switch (num) {
			case 1:
				if (coin >= 100) {
					System.out.println("1단계 문제입니다.");
					System.out.println("7103 = 1  2751 = 0");
					System.out.println("3148 = 2  8807 = 5");
					System.out.println("9038 = 4  6666 = 4");
					System.out.println("2222 = 0  6320 = A");
					System.out.println("8193 = 3  8089 = B");
					System.out.println("1234 = 0  9184 = C");
					System.out.println("A,B,C에 들어갈 숫자를 모두 더한 값을 구하세요");
					System.out.print("A+B+C= ");
					String q1 = sc.next();
					if (q1.equals("11"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else {
					System.out.println("코인이 부족합니다");
				}
				break;
			case 2:
				if (coin >= 200) {
					System.out.println("2단계 문제입니다.");
					System.out.println("AA x AA = BBCC");
					System.out.println("위의 식이 성립할때 A+B+C를 구하세요");
					System.out.print("정답: ");
					String q2 = sc.next();
					if (q2.equals("19"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else {
					System.out.println("코인이 부족합니다");
				}
				break;
			case 3:
				if (coin >= 300) {
					System.out.println("3단계 문제입니다.");
					System.out.println("다음 알파벳들은 공통점이 있습니다.");
					System.out.println("이 열에서 빠진 알파벳은 무엇일까요?");
					System.out.println("B C D E I K O X");
					System.out.print("정답: ");
					String q3 = sc.next();
					if (q3.equals("H"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else
					System.out.println("코인이 부족합니다");
				break;
			case 4:
				if (coin >= 400) {
					System.out.println("4단계 문제입니다.");
					System.out.println("16 06 68 88 ? 98");
					System.out.println("? 에 들어갈 숫자는 무엇일까요?");
					System.out.print("정답: ");
					String q4 = sc.next();
					if (q4.equals("87"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else
					System.out.println("코인이 부족합니다");
				break;
			case 5:
				if (coin >= 500) {
					System.out.println("5단계 문제입니다.");
					System.out.println("차돌떡볶이 = 2777");
					System.out.println("서강대학식 = 77");
					System.out.println("메추리알 + 노랑통닭 + 불향차돌 + 이삭토스트 + 족발 = ?");
					System.out.println("? 에 들어갈 숫자는 무엇일까요?");
					System.out.print("정답: ");
					String q5 = sc.next();
					if (q5.equals("310"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else {
					System.out.println("코인이 부족합니다");
				}
				break;
			case 6:
				if (coin >= 600) {
					System.out.println("6단계 문제입니다.");
					System.out.println("이것은 서울,대구에서 만날 수 없지만 마포 마산에서는 만날 수 있다.");
					System.out.println("공항에서는 만날 수 없지만 버스정류장에서는 만날 수 있다.");
					System.out.println("욕실에서는 만날 수 없지만 주방에서는 만날 수 있다.");
					System.out.println("형이나 동생은 만날 수 없지만 엄마, 아빠는 만날 수 있다.");
					System.out.println("이것은 무엇일까요?");
					System.out.print("정답: ");
					String q6 = sc.next();
					if (q6.equals("입술"))
						System.out.println("★★ 정답입니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else
					System.out.println("코인이 부족합니다");
				break;
			case 7:
				if (coin >= 700) {
					System.out.println("마지막 7단계 문제입니다.");
					System.out.println("테러리스트 장아영이 비트캠프에 잠입하여 폭탄을 설치했다.");
					System.out.println("비트캠프 사무실 컴퓨터에는 폭탄을 제거할 수 있는 암호가 남겨져 있다.");
					System.out.println("암호를 풀어 폭탄을 제거하세요");
					System.out.println("암호: ㄷㅁㄱㄴㄷㄱㅁ");
					System.out.print("정답: ");
					String q6 = sc.next();
					if (q6.equals("6519615"))
						System.out.println("★★ 축하합니다 탈출에 성공하셨습니다! ★★");
					else
						System.out.println("땡!!!!!!!!!!!");
				} else {
					System.out.println("코인이 부족합니다");
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				System.out.println("또 이용해주세요~");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}

		}
		sc.close();
	}
}