import java.util.*;

class ListIteratorExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(921);
		al.add(78);
		al.add(12);

		ListIterator<Integer> itr = al.listIterator();
		System.out.println("Forward Traversal");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("Backward Traversal");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}