import java.util.Scanner;

public class SungJuk {

	public void SugJuk() {
		int math,eng,kor,KH;
		Scanner scan = new Scanner(System.in);
		System.out.println("����,����,����,���� ������ ���ʷ� �Է� �ϼ���");
		math = scan.nextInt();
		eng = scan.nextInt();
		kor = scan.nextInt();
		KH=scan.nextInt();
		
		int sum = math+eng+kor+KH;
		int avg = sum/4;
		
		System.out.printf("������ %d \n ����� %d\n",sum,avg);
		
		if (avg>80){
			System.out.println("A�Դϴ�");
		}else if(avg>50){
			System.out.println("B�Դϴ�");
		}else if(avg>40){
			System.out.println("C�Դϴ�");
		}else if(avg>30){
			System.out.println("D�Դϴ�");
		}else
			System.out.println("E�Դϴ�");
		
	}
}
