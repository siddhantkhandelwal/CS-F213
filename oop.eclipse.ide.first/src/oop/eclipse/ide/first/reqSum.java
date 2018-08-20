package oop.eclipse.ide.first;

public class reqSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(args[args.length-1]);
		for(int i=0; i<args.length-1;i++){
			for(int j=i;j<args.length-1;j++){
				if(Integer.parseInt(args[i]) + Integer.parseInt(args[j]) == x){
					System.out.println(args[i] + " " + args[j]);
				}
			}
		}
	}
}
