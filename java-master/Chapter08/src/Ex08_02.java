import java.util.Scanner;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int[] aa = new int[4];
		int hap = 0;

		System.out.printf("1��° ���� : ");
		aa[0] = s.nextInt();
		System.out.printf("2��° ���� : ");
		aa[1] = s.nextInt();
		System.out.printf("3��° ���� : ");
		aa[2] = s.nextInt();
		System.out.printf("4��° ���� : ");
		aa[3] = s.nextInt();

		int i = 0;

		while (i <= 3) {
			hap = hap + aa[i];
			i++;
		}

		for (i = 0; i <= 3; i++) {
			hap = hap + aa[i];

		}

		System.out.printf("�� %d\n", hap);
	}

}
