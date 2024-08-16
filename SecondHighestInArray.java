
public class secondhighest {
	static int SecHigh(int a[],int n) {
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if (a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[n-2];
	}

	public static void main(String[] args) {
		 int a[]= {1,8,9,3,5,03};
		 int n=a.length;
		 System.out.println(SecHigh(a,n));

	}

}
