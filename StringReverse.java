public class StringReverse {
	static void Reverse(String s,int n) {
		
		char[] str=s.toCharArray();
		for (int i=n;i>=0;i--) {
			System.out.print(""+str[i]);
		}
	}

	public static void main(String[] args) {
		String s="Good Morning";
		int n=s.length()-1;
		Reverse(s,n);

	}

}
