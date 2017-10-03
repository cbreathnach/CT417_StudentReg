package assign1.studentReg;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
	
	Student student1;
	
	public void setUp() {
		
		student1 = new Student("John", 21, "31121995");
		
	}

	public void testGetUsername() {
		
		String expectedResult = "John21";
		String usernameResult = student1.getUsername();
		assertTrue(usernameResult.equals(expectedResult));
	}

}
