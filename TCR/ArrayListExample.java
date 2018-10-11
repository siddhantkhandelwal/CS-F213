import java.util.*;

class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(2);
		al1.add(921);

		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(78);
		al2.add(12);

		al1.addAll(al2);
		Collections.sort(al1);
		System.out.println(al1);
		System.out.println(al1.get(3));
	}
}