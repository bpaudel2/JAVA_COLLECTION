package DecidingCollectionToUse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
	/*
	 * Consider:
	 * 1. What you need the collection to do
	 * 2. Are you using the fastest collection for your purposes
	 * 	  (think about insertion/deletion, retrieval and traversal 
	 */
	
	/////////////////LISTS////////////
	/*
	 * Stores list of objects
	 * Duplicates are allowed
	 * Objects remain in order
	 * Elements are indexed via an integer
	 * cf. shopping list
	 * Checking for particular item in list is slow
	 * Looking up an item by index is fast
	 * Iterating through lists is relatively fast
	 * Note: you can sort list if you want to
	 */
	
	// If you only add or remove items at the end of list, use ArrayList.
	List<String> list1 = new ArrayList<String>();
	
	// Removing or adding items elsewhere in the list, use LinkedList
	List<String> list2 = new LinkedList<String>();
	
	/////////////SETS///////////////
	/*
	 * Only store unique values
	 * Great for removing duplicates
	 * Not indexed, unlike lists
	 * Very fast to check if a particular object exists
	 * If you want to use your own objects, you must implement hashCode() and equals
	 * Order is unimportant and OK if it changes
	 * HashSet is not ordered
	 */
	Set<String> set1 = new HashSet<String>();
	// Sorted in natural list, use TreeSet -must implement Comparable for Custom types
	// (1,2,3...........,a,b,c.....etc)
	Set<String> set2 = new TreeSet<String>();
	
	// Elements remain in order they were added
	Set<String> set3 = new LinkedHashSet<String>();
	
	////////////////////MAPS/////////////////////
	/*
	 * Key Value pairs
	 * Like Lookup tables
	 * Retrieving a value by key is fast
	 * Iterating over map values is very slow
	 * Maps not really optimized for iteration
	 * If you want to use your own objects as keys, you must implement hashCode and equals method
	 * Keys not in any particular order,and order liable to change
	 */
	Map<String,String> map1 = new HashMap<String,String>();
	
	//Keys sorted in natural order - must implement comparable for custom objects
	Map<String, String> map2 = new TreeMap<String, String>();
	
	// Keys remain in order added
	Map<String, String> map3 = new LinkedHashMap<String,String>();
	
	// There are also the SortedSet and SortedMap interfaces
}
