package divide_and_conquer;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int [] arr= new int [n];
		for(int i=0; i<n; i++) {
			arr[i]=s.nextInt();
		}
		int si=0;
		int ei=arr.length-1;
		qs(arr,si,ei);
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	
	public static int partition(int [] arr, int si, int ei) {
		Random rand= new Random();
        int pivot = rand.nextInt(ei-si) + si; 
        swap(arr,pivot,ei);
        
        int pivotval=arr[ei];

		int pindex= si;
		
		for(int i=si; i<=ei-1; i++) {
			if(arr[i]<=pivotval) {
				swap(arr,i,pindex);
				pindex++;
			}
			
		}
		swap(arr,pindex,ei);
		return pindex;
	}
	
	public static void swap(int [] arr, int x, int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
	
	public static void qs(int [] arr, int si, int ei) {
		if(si>=ei) {
			return;
		}
		int pindex=partition(arr,si,ei);
		qs(arr,si,pindex-1);
		qs(arr,pindex+1,ei);
	}
	
	
}
  