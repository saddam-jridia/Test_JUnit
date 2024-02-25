package edu.umn.foo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class DemoTest {

	@Test
	public void test_is_triangle_1() {
		assertTrue(Demo.isTriangle(3, 4, 5));;
	}
	
	public void test_is_triangle_2() {
		assertTrue(Demo.isTriangle(5, 12, 13));
	}
    
	public void test_is_triangle_3() {
		assertTrue(Demo.isTriangle(5, 13, 12));
	}
	
	public void test_is_triangle_4() {
		assertTrue(Demo.isTriangle(12, 15, 13));
		
	}
	
	public void test_is_triangle_5() {
		assertFalse(Demo.isTriangle(12, 13, 15));
}

	public void test_is_Not_triangle_1() {
		assertTrue(Demo.isTriangle(12, 13, 15));
}
	public void test_is_Not_triangle_2() {
		assertFalse(Demo.isTriangle(5,13,7));
}

	public void test_is_Not_triangle_3() {
		assertFalse(Demo.isTriangle(13, 5, 7));
}
	public void test_is_Not_triangle_4() {
		assertFalse(Demo.isTriangle(13, 7, 5));
}
	public void test_is_Not_triangle_5() {
		assertFalse(Demo.isTriangle(13, 5, 7));
	}
	public void test_is_Not_triangle_6() {
		// this is Not a Triangle...and..yes
		assertFalse(Demo.isTriangle(5, 9, 3));
	}
	public void test_is_Not_triangle_7() {
		assertFalse(Demo.isTriangle(1, 2, -1));
	}
	
	public void test_main_program_1() {
		ByteArrayInputStream in =
				new ByteArrayInputStream("5\n12\n13\n".getBytes());
		System.setIn(in);
		
		ByteArrayOutputStream out=new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		String consoleOutput = "Enter side 1: \n";
		consoleOutput += "Enter side2: \n";
		consoleOutput += "Enter side 3: \\n" ;
		consoleOutput += "This is a triangle.\n" ;
		
		assertEquals(consoleOutput, out.toString());


	}
}
       
	
	
	