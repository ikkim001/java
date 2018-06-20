import java.util.Scanner;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Problem_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char[] queue = new char[5];
		int rear = 0;

		char carName = 'A';
		int select = 9;

		while (select != 3) {
			System.out.printf("<1> 넣기 <2> 빼기 <3> 종료");
			select = s.nextInt();

			switch (select) {
			case 1:
				if (rear >= 5) {
					System.out.printf("터널이 꽉참 차가 못 들어감\n");
				} else {
					queue[rear] = carName++;
					System.out.printf("%c 자동차가 터널에 들어감\n", queue[rear]);
					rear++;
				}
				break;

			case 2:
				if (rear <= 0) {
					System.out.printf("빠져나갈 자동차가 없음\n");
				} else {
					System.out.printf("%c 자동차가 터널에서 빠짐\n", queue[0]);
					for (int i = 0; i < 4; i++)
						queue[i] = queue[i + 1];
					rear--;
				}
				break;

			case 3:
				System.out.printf("%d 대가 터널에 남아 있음.\n",rear);
				System.out.printf("끝.\n");
			default:
				System.out.printf("입력좀 잘해.\n");

			}
		}

	}

}
