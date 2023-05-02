package Sarika_23;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Assignment13_RemoveDuplicateEle {
	public static void removeDuplicates(int[] a)
    {
        HashSet<Integer> set
            = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        System.out.print(set);
    }
    public static void main(String[] args)
    {
        int a[] = {2,4,5,6,2,5,7};
        removeDuplicates(a);
    }

}
