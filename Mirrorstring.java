import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
class Mirrorstring{

	public static int mirrorCount(String txt){
		int count=0;
		
		for (int i = 0; i < txt.length()-5; i++) {
			Stack<String> stack=new Stack<>();
			String st="";
			String mir="";
			for (int j = i; j <i+3 ; j++) {
				stack.push(String.valueOf(txt.charAt(j)));
				
			}

			for (int k = i+3; k <i+6 ; k++) {
				mir+=stack.pop();
				st+=String.valueOf(txt.charAt(k));
			}
			if(st.equals(mir)){
				count++;
			}
		}
		System.out.println(txt.length());
		
		return count;	
	}
	
	public static void main(String []args){
		System.out.println("Enter a String ");
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println("Hello World..."+s);
		System.out.println(mirrorCount(s));
	}
}
