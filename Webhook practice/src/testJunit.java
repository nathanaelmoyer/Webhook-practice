import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


class testJunit {

	
	@Test
	void test() 
	{
		JUnit a = new JUnit();
		int input = 0;
		Scanner in = new Scanner(System.in);
		
		
		//a.test();
		
		System.out.print("input a number \n");
		
		input = in.nextLine();
		
		
		a.setA(input);
		System.out.print("Number entered: " + a.getA() + "\n");
		
	}

}
