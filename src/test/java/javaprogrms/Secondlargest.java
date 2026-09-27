package javaprogrms;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3,5,9,2,10,4,100};
		int maxno = arr[0];
		int second = arr [0];
		int min = arr [0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>maxno){
				second = maxno;
				maxno = arr[i];
			}
			else if(arr[i]<min){
				second = min;
				min = arr[i];
			}
			else if (arr[i]>second && arr[i]!=maxno)

				second = arr[i];

		}

		System.out.println(maxno);
		System.out.println(second);
		System.out.println(min);
	}
}