package arr;

public class CharArr {

	public static void main(String[] args) {


		char[] strsA = new String("a,b,c,a,d,e").replace(",", "").toCharArray();
		char[] strsB = new String("a,c").replace(",", "").toCharArray();
		for (int i = 0; i < strsA.length; i++) {
			System.out.print(strsA[i]);
		}
//		int[] arr = new int[200];
//		arr['a']=1;
//		for (int i = 'a'; i < 'z'; i++) {
//			System.out.print(arr[i]);
//		}
	}
}
