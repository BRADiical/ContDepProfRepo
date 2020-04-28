import java.util.regex.*;
import static org.junit.Assert.assertEquals;
import org.junit.*;


public class Toolbelt {
	public static Double add(String rawInput1, String rawInput2){
		// Get Input
		Double inputValue1 = Double.parseDouble(rawInput1);
		Double inputValue2 = Double.parseDouble(rawInput2);
		// If both values given by user are legal
		if(rawInput1.matches("^[0-9]+$") && rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1 + (double)inputValue2;
		}
		else if(rawInput1.matches("^[0-9]+$") && !rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1;
		}
		else if(rawInput2.matches("^[0-9]+$") && !rawInput1.matches("^[0-9]+$")) {
			return (double)inputValue2;
		}
		else {
			return null;
		}
	}
	
	public static Double subtract(String rawInput1, String rawInput2) {
		// Get Input
		Double inputValue1 = Double.parseDouble(rawInput1);
		Double inputValue2 = Double.parseDouble(rawInput2);
		// If both values given by user are legal
		if(rawInput1.matches("^[0-9]+$") && rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1 - (double)inputValue2;
		}
		else if(rawInput1.matches("^[0-9]+$") && !rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1;
		}
		else if(rawInput2.matches("^[0-9]+$") && !rawInput1.matches("^[0-9]+$")) {
			return (double)inputValue2;
		}
		else {
			return null;
		}
	}
	
	public static Double multiply(String rawInput1, String rawInput2) {
		// Get Input
		Double inputValue1 = Double.parseDouble(rawInput1);
		Double inputValue2 = Double.parseDouble(rawInput2);
		// If both values given by user are legal
		if(rawInput1.matches("^[0-9]+$") && rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1 * (double)inputValue2;
		}
		else if(rawInput1.matches("^[0-9]+$") && !rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1;
		}
		else if(rawInput2.matches("^[0-9]+$") && !rawInput1.matches("^[0-9]+$")) {
			return (double)inputValue2;
		}
		else {
			return null;
		}
	}
	
	public static Double divide(String rawInput1, String rawInput2) {
		// Get Input
		Double inputValue1 = Double.parseDouble(rawInput1);
		Double inputValue2 = Double.parseDouble(rawInput2);
		// If both values given by user are legal
		if(rawInput1.matches("^[0-9]+$") && rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1 / (double)inputValue2;
		}
		else if(rawInput1.matches("^[0-9]+$") && !rawInput2.matches("^[0-9]+$")) {
			return (double)inputValue1;
		}
		else if(rawInput2.matches("^[0-9]+$") && !rawInput1.matches("^[0-9]+$")) {
			return null;
		}
		else {
			return null;
		}
	}

	public static Double solveEquation(String rawInputFromClient) {
		String[] expression = rawInputFromClient.split("\\s");
		System.out.println("" + expression[0] + "");
		switch(expression[1]) {
			case "*": {
				return multiply(expression[0], expression[2]);
			}
			case "/": {
				return divide(expression[0], expression[2]);
			}
			case "PLUS": {
				return add(expression[0], expression[2]);
			}
			case "-": {
				return subtract(expression[0], expression[2]);
			}
			default:
				return null;
		}	
	}
	
	
	@Test
	public void addTest() {
		String val1 = "3";
		String val2 = "5";
		assertEquals(8, add(val1, val2), 0.001);
	}
	
	@Test
	public void subtractTest() {
		String val1 = "8394321";
		String val2 = "65785";
		assertEquals(8328536, subtract(val1, val2), 0.001);
	}
	
	@Test
	public void multiplyTest()
	{
		String val1 = "49327";
		String val2 = "4";
		assertEquals(197308, multiply(val1, val2), 0.001);
	}
	
	@Test 
	public void divideTest(){
		String val1 = "55590";
		String val2 = "5559";
		assertEquals(10, divide(val1, val2), 0.001);
	}
	

}
