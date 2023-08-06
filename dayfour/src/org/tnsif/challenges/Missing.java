package org.tnsif.challenges;

public class Missing {
	public static void miss(int arr[],int N) {
		int i;
		int temp[]=new int[N+1];
		for(i=0;i<=N;i++) {
			temp[i]=0;
		}
		for(i=0;i<N;i++) {
			temp[arr[i]-1]=1;
		}
		int ans=0;
		for(i=0;i<=N;i++) {
			if(temp[i]==0)
				ans=i+1;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		int arr[]= {1,3,7,4,2,6};
		int n=arr.length;
		miss(arr,n);
	}

}
