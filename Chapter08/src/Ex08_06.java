
public class Ex08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = { 10, 20, 30, 40, 50 };
		int count, size;
		
		count = aa.length;
		size = count * Integer.BYTES;
		
		System.out.printf("%d\n", count); //5
		System.out.printf("%d\n", size); //20
	}

}
