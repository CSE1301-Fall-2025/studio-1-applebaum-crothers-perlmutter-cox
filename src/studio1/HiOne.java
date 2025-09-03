package studio1;

import java.util.Scanner;

public class HiOne {

	/**
	 * Says hello to the supplied argument
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);//constructing scanner
		System.out.print("Enter your name: ");
		String name = in.nextLine(); //taking in the next value input
		System.out.print("Hi " + name + ", how are you?");
		// Below this line, enter code so that this program's output says
		//      Hi, Pat.  How are you?
		// if the value of name is "Pat"
		

	}

}
