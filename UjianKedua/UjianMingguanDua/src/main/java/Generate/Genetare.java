package Generate;

import java.util.Random;

public class Genetare {
	
	public String randomString () 
	{
		int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 2;
	    Random random = new Random();
	    
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	    	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    	      .limit(targetStringLength)
	    	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	      .toString();

	    	    System.out.println(generatedString);
		return generatedString;
	}
	public static void main(String[] args) {
		Genetare gnt = new Genetare();
		gnt.randomString();
	}

}
