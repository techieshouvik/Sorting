package Sorting_package;

public class NewSort {

	public static void main(String[] args) {
		
		int a[] = {5,10,7,6,2,1,3,8,4,9};
		int min = a[0],minpos=0;
		
		for(int i=0;i<10;i++)
		{
			min=a[i];
			for(int j=i;j<9;j++) {
				
				if(min>a[j]) {
					min = a[j];
					minpos=j;
				}
				
			}
			
			int temp = a[minpos];
			a[minpos] = a[i];
			a[i] = temp;
		}
		
		for(int i=0;i<10;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
