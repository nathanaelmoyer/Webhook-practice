import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class testJunit {

	
	@Test
	void test() 
	{
		JUnit a = new JUnit();
		int input = 0;
		
		//a.test();
		
		System.out.print("input a number \n");
		
		input = 20;
		
		
		a.setA(input);
		System.out.print("Number entered: " + a.getA() + "\n");
		
	}

}
