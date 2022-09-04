/*pr_64 Write a Java program to compare two sets and retain elements which are 
same on both sets. */

package Module_2;

import java.util.HashSet;
import java.util.Set;

public class program_64 {
	public static void main(String[] args) {
		Set<String> h_set1 = new HashSet<String>();
		h_set1.add("Red");
		h_set1.add("Green");
		h_set1.add("Black");
		h_set1.add("White");
		System.out.println("Frist HashSet content: " + h_set1);
		Set<String> h_set2 = new HashSet<String>();
		h_set2.add("Red");
		h_set2.add("Pink");
		h_set2.add("Black");
		h_set2.add("Orange");
		System.out.println("Second HashSet content: " + h_set2);
		h_set1.retainAll(h_set2);
		System.out.println("\nHashSet content:");
		System.out.println(h_set1);
	}
}
