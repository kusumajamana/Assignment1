
public class StringRep {
	static void find(String s, int n) {
		int c=0;
		char[] s1=s.toCharArray();
		for (int j=n;j>=0;j--) {
			for (int i=0;i<j;i++)  {
				if(s1[i]==s1[j] && i!=j) {
					c=1;
					System.out.println(""+s1[j]);
					break; 
				}
			}
			if (c==1)
				break;
		}
		if (c==0)
			System.out.println("no repeating element");

	}

	public static void main(String[] args) {
		String s="language";
		int n=s.length()-1;
		find(s,n);

	}

}