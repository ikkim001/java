
public class Ex08_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] aa = new int[3][4];
		int i, k;
		int val = 1;

		for (i = 0; i < 3; i++) {
			for (k = 0; k < 4; k++) {
				aa[i][k] = val;
				System.out.printf("aa[%d][%d]=%d\t", i, k, aa[i][k]);
				val++;
			}
			System.out.printf("\n");
		}
	}

}
