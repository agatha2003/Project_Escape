package workspace_HC;

import java.util.Scanner;

public class testhc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin = 700;
		int num = -1;
		while (num != 0) {
			System.out.println("1~7�ܰ��� Ż���� �ܰ踦 �Է��ϼ���");
			System.out.println("0�Է� : ����");

			num = sc.nextInt();

			switch (num) {
			case 1:
				if (coin >= 100) {
					System.out.println("1�ܰ� �����Դϴ�.");
					System.out.println("7103 = 1  2751 = 0");
					System.out.println("3148 = 2  8807 = 5");
					System.out.println("9038 = 4  6666 = 4");
					System.out.println("2222 = 0  6320 = A");
					System.out.println("8193 = 3  8089 = B");
					System.out.println("1234 = 0  9184 = C");
					System.out.println("A,B,C�� �� ���ڸ� ��� ���� ���� ���ϼ���");
					System.out.print("A+B+C= ");
					String q1 = sc.next();
					if (q1.equals("11"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else {
					System.out.println("������ �����մϴ�");
				}
				break;
			case 2:
				if (coin >= 200) {
					System.out.println("2�ܰ� �����Դϴ�.");
					System.out.println("AA x AA = BBCC");
					System.out.println("���� ���� �����Ҷ� A+B+C�� ���ϼ���");
					System.out.print("����: ");
					String q2 = sc.next();
					if (q2.equals("19"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else {
					System.out.println("������ �����մϴ�");
				}
				break;
			case 3:
				if (coin >= 300) {
					System.out.println("3�ܰ� �����Դϴ�.");
					System.out.println("���� ���ĺ����� �������� �ֽ��ϴ�.");
					System.out.println("�� ������ ���� ���ĺ��� �����ϱ��?");
					System.out.println("B C D E I K O X");
					System.out.print("����: ");
					String q3 = sc.next();
					if (q3.equals("H"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else
					System.out.println("������ �����մϴ�");
				break;
			case 4:
				if (coin >= 400) {
					System.out.println("4�ܰ� �����Դϴ�.");
					System.out.println("16 06 68 88 ? 98");
					System.out.println("? �� �� ���ڴ� �����ϱ��?");
					System.out.print("����: ");
					String q4 = sc.next();
					if (q4.equals("87"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else
					System.out.println("������ �����մϴ�");
				break;
			case 5:
				if (coin >= 500) {
					System.out.println("5�ܰ� �����Դϴ�.");
					System.out.println("���������� = 2777");
					System.out.println("�������н� = 77");
					System.out.println("���߸��� + ������ + �������� + �̻��佺Ʈ + ���� = ?");
					System.out.println("? �� �� ���ڴ� �����ϱ��?");
					System.out.print("����: ");
					String q5 = sc.next();
					if (q5.equals("310"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else {
					System.out.println("������ �����մϴ�");
				}
				break;
			case 6:
				if (coin >= 600) {
					System.out.println("6�ܰ� �����Դϴ�.");
					System.out.println("�̰��� ����,�뱸���� ���� �� ������ ���� ���꿡���� ���� �� �ִ�.");
					System.out.println("���׿����� ���� �� ������ ���������忡���� ���� �� �ִ�.");
					System.out.println("��ǿ����� ���� �� ������ �ֹ濡���� ���� �� �ִ�.");
					System.out.println("���̳� ������ ���� �� ������ ����, �ƺ��� ���� �� �ִ�.");
					System.out.println("�̰��� �����ϱ��?");
					System.out.print("����: ");
					String q6 = sc.next();
					if (q6.equals("�Լ�"))
						System.out.println("�ڡ� �����Դϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else
					System.out.println("������ �����մϴ�");
				break;
			case 7:
				if (coin >= 700) {
					System.out.println("������ 7�ܰ� �����Դϴ�.");
					System.out.println("�׷�����Ʈ ��ƿ��� ��Ʈķ���� �����Ͽ� ��ź�� ��ġ�ߴ�.");
					System.out.println("��Ʈķ�� �繫�� ��ǻ�Ϳ��� ��ź�� ������ �� �ִ� ��ȣ�� ������ �ִ�.");
					System.out.println("��ȣ�� Ǯ�� ��ź�� �����ϼ���");
					System.out.println("��ȣ: ��������������");
					System.out.print("����: ");
					String q6 = sc.next();
					if (q6.equals("6519615"))
						System.out.println("�ڡ� �����մϴ� Ż�⿡ �����ϼ̽��ϴ�! �ڡ�");
					else
						System.out.println("��!!!!!!!!!!!");
				} else {
					System.out.println("������ �����մϴ�");
				}
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println("�� �̿����ּ���~");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}

		}
		sc.close();
	}
}