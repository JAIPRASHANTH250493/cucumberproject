package programs;

public class string {



	public static void main(String args[]) {


		String a="welcome";
		char temp = 0;
		String swap="";

		//o/p="ewclmoe"

		char[] b=a.toCharArray();

		for(int i=0;i<=6; i=i+2) {

			System.out.println(b[i]);

			for(int j=1;j<=5; j=j+2) 
				System.out.println(b[j]);	

		}}}