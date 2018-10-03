package oop.eclipse.ide.first;

public class four2three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number4 = Integer.parseInt(args[0]);
		int digits[] = new int[4];
		for(int i=0; i<4; ++i){
			int lastdigit = number4 % 10;
			digits[i] = lastdigit;
			number4 /= 10;
		}
		for(int i=0;i<4;++i){
			for(int j=0;j<4;++j){
				for(int k=0;k<4;++k){
					System.out.println(digits[i]+""+digits[j]+""+digits[k]);
				}
			}
		}
	}
}
