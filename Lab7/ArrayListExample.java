import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		System.out.println("Size of ArrayList at creation: " +arrList.size());
		arrList.add("B");
		arrList.add("I");
		arrList.add("T");
		arrList.add("S");
		System.out.println("Size of ArrayList after adding elements: " +arrList.size());
		System.out.println("List of all elements: " + arrList);
		arrList.remove("B");
		System.out.println("See contents after removing one element: " + arrList);
		//Remove element by index
		arrList.remove(2);
		System.out.println("See contents after removing	element by index: " + arrList);
		//Check size after removing elements
		System.out.println("Size of arrayList after removing elements: " + arrList.size());
		System.out.println("List of all elements after removing elements: " + arrList);
		//Check if the list contains "T"
		System.out.println(arrList.contains("T"));
	}
}
