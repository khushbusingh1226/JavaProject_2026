package javaprogrms;

public class largestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int [] arr = {10,20,60,40,100};
 int largest = arr[0];
 for(int num:arr)
	 if(num>largest)
		 
		 largest = num;
	
	System.out.println("largest number : " + largest);

}
}