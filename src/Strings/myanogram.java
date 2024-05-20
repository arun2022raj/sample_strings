package Strings;

import java.util.Arrays;
import java.util.HashSet;

class myanogram{
	public static boolean ano(String s1,String s2){
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c2);
		Arrays.sort(c1);
		return Arrays.equals(c1,c2);
	}
	public static void main(String[] args){
		String[] list= {"nat","eat","tea","bat","tan","ate"};
		HashSet<HashSet<String>> arrayList2D = new HashSet<>();
		HashSet<String> row1;
		for (String w:list){
			row1 = new HashSet<>();
			row1.add(w);
			for (String w2:list)
				if ((!w.equals(w2)) && (ano(w,w2)))
					row1.add(w2);
			arrayList2D.add(row1);
		}
		System.out.println("Elements of the 2D ArrayList:");
        for (HashSet<String> row : arrayList2D)
            System.out.println(row);
	}
}