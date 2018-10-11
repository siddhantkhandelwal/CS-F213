public class StringExamples {
	public static void main(String[] args) {
		String s1 = " Hello World ";
		//System.out.println(s1.charAt(0));
		char[] ch = new char[20];
		s1.getChars(0, 11, ch, 0);
		System.out.println(ch);
		ch = s1.toCharArray();
		System.out.println(ch);
		s1 = s1.trim();
		System.out.println(s1);
		s1 = s1.replace('l', 'L');
		System.out.println(s1);
	}
}