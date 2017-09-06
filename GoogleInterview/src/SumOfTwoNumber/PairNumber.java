package SumOfTwoNumber;

import java.util.*;
public class PairNumber {
	
	public static int[] findPair(int []arr, int sum){
		
		int answer[]=new int[2];
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++){
			int requiredNo=sum-arr[i];
			if(set.contains(requiredNo)){
				answer[0]=arr[i];
				answer[1]=requiredNo;
				return 	answer;
			}
			else
				set.add(arr[i]);
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,5};
		int array[]=findPair(arr, 8);
		System.out.println(array[0]+", "+ array[1]);
	}

}
