package reva.sdp;

public class hat {
	public static void main(String args[]) {
		int arr[]=new int[] {1,2,3,4,5};
		int n=3;
		System.out.println("Original array:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			for(int i1=0;i1<n;i1++) {
				int j,first;
				first=arr[0];
				for(j=0;j<arr.length-1;j++)
				{
					arr[j]=arr[j+1];
					}
				arr[j]=first;
				}
			System.out.println();
			System.out.println("Array after left rotation;");
			for(int i1=0;i1<arr.length;i1++)
			{
				System.out.print(arr[i1]+" ");
				}
			}
	}

}
