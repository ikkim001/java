
public class GetMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = { 12000, 3000, 19000, 6000, 18000
				, 8000, 12000, 4000, 1000, 19000 };
		int minium;
		
		minium = s[0];
		
		for(int i=1;i < s.length; i++){
			if(s[i] < minium)
				minium = s[i];
		}
		System.out.println(minium);
	}

}
