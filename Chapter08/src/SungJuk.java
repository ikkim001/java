import java.util.Scanner;

public class SungJuk {

	public void SugJuk() {
		int math,eng,kor,KH;
		Scanner scan = new Scanner(System.in);
		System.out.println("수학,영어,국어,역사 점수를 차례로 입력 하세요");
		math = scan.nextInt();
		eng = scan.nextInt();
		kor = scan.nextInt();
		KH=scan.nextInt();
		
		int sum = math+eng+kor+KH;
		int avg = sum/4;
		
		System.out.printf("총점은 %d \n 평균은 %d\n",sum,avg);
		
		if (avg>80){
			System.out.println("A입니다");
		}else if(avg>50){
			System.out.println("B입니다");
		}else if(avg>40){
			System.out.println("C입니다");
		}else if(avg>30){
			System.out.println("D입니다");
		}else
			System.out.println("E입니다");
		
	}
}
