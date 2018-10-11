/*String Buffer represents growable and writable character sequences. This size grows automatically to acoomodate characters and substring insert or append operations.*/
/*String tokenizer class helps to break a string into tokens.*/

import java.util.StringTokenizer;
public class StringTokenizerExamples {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Test String with a lot of meaningless words");
		int i=0, j;
		j = st.countTokens();
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			i++;
		}

		System.out.println("i: " + i + " and j: " + j);
	 	System.out.println(st.countTokens());
 	}
}