package ArrayList;
import java.util.ArrayList;
import java.util.List;

// ArrayList is an expandable array
public class App {
	public static void main(String[] args) {
		//All the classes in collection framework are template classes.
		//So, you have to mention what kind of object you will be storing on them.
		// You can not put primitive type in template. So, Integer here not int. 
		ArrayList<Integer> numbers = new ArrayList<Integer>();//You can give it size but if you don't, the default is 10
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("nIteration #1: ");
        // Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Iteration number 2
        for (Integer value:numbers) {
        	System.out.println(value);
        }
        // Removing items (careful!)
        numbers.remove(numbers.size() - 1);

        // This is VERY slow
        // Removing first item is slow, because all the array has to shift.
        numbers.remove(0);
        
        // List interface ...
        List<String> values = new ArrayList<String>();
	}

}
