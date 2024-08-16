
public class MostFrequentElement {
	static int Mode(int a[],int n) {
		int mode=0,fcount=0,count=0;
		for(int i=0;i<n;i++) {
			int temp=a[i];
			for (int j=0;j<n;j++) {
				if (a[i]==a[j]) {
					count++;
					if (fcount<count) {
						fcount=count;
						mode=a[i];
					}
				}
			}
		count=0;
		}
		return mode;
	}
	public static void main(String[] args) {
		int a[]= {1,6,8,4,4,6,6,8,6,9,4};
		int n=a.length;
		System.out.println(Mode(a,n));

	}

}