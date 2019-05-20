package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		/*
		 * ArrayList manages arrays internally
		 * [0][1][2][3][4][5][6][7]...
		 */
		
		/*
		 * LinkedList consists of elements where each element 
		 * has a reference to the previous and next element
		 * [0]->[1]->[2]...
		 * That is why traversing LinkedList is slower.
		 */
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}
	
	// We can pass anything that implements List interface in this function.
	public static void doTimings(String type, List<Integer>list) {
		for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        
        long start = System.currentTimeMillis();
        
        /*
        // Add items at end of list
        for(int i=0; i<1E5; i++) {
            list.add(i);
        }
        */
        
        // Add items elsewhere in list
        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
        //Linked List does not really care where you add the item but arrayList does. 
        //If you are adding item at the end of the list, use arrayList
        //If you are adding item anywhere else, use LinkeList
	}
}
