package Mitsogo;

import java.util.*;
public class Chimicals {
	public static String sort(String str) {
		char[] str1=str.toCharArray();
		Arrays.sort(str1);
		return new String(str1);
	}
	public static int explosive(String[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sort(arr[i]);
			System.out.println(arr[i]);
		}
		HashMap<String , Integer> map=new HashMap<>();
		for(String str:arr) {
			map.put(str, 1);
		}
		System.out.println("------------------------------------------------");
		for(String str:arr) {
			String x=sort(str+str);
			System.out.println(x);
			if(map.containsKey(x)){
				count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[] che=new String[n];
		for(int i=0;i<n;i++) {
			che[i]=s.next();
		}
		int res=explosive(che);
		System.out.println(res);
	}

}
