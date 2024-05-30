package selenium;

public class StringExamples {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub 
		String name = "Thiyagaraj"; 
		int number = 3;
		  
		  
		  //Returns character value for the particular index
		  System.out.println(name.charAt(1));
		  
		  //Return string length System.out.println(name.length());
		  
		  //checks the equality of string with the given object
		  System.out.println(name.equals("tiyagaraj"));
		  
		  //checks the equality of string with the given string object without case sensitivity 
		  System.out.println(name.equalsIgnoreCase("thiyagaraj"));
		  
		  //checks if string is empty or not System.out.println(name.isEmpty());
		  
		  //returns true or false based on the given value is present or not.
		  System.out.println(name.contains("a"));
		  
		  //Take a particular portion of the string
		  System.out.println(name.substring(7));
		  
		  //Take a particular portion of the string begin and end index
		  System.out.println(name.substring(2,7));
		  
		  //appends the string to the given string
		  System.out.println(name.concat(" Logasundaram"));
		  
		  //replaces the existing char with given char
		  System.out.println(name.replace("h","H"));
		  
		  //find the position of a character in the string
		  System.out.println(name.indexOf("h"));
		  
		  //find the position of a character in the string
		  System.out.println(name.indexOf("a", 7));
		  
		  //find the position of a portion in the string
		  System.out.println(name.indexOf("yag", 4));
		  
		  //Trim will remove the white spaces before and after
		  System.out.println(name.trim());
		  
		  //convert the given data type to string
		  System.out.println(String.valueOf(number));
		  
		  String upperCase = "THIYAGARAJ"; System.out.println(upperCase.toLowerCase());
		  
		  String lowerCase = "thiyagaraj"; System.out.println(lowerCase.toUpperCase());
		  
		  //returns a joined string with Given delimiter
		  System.out.println(String.join("-","Learn","Automation","Online"));
		  System.out.println(String.join("/","21","09","1982"));
		  
		  //split 
		  String splitThis = "Have,you,watched,Aranmanai4?"; 
		  String [] splitterWords=splitThis.split(","); 
		  
		  for (String string : splitterWords) {
		  System.out.println(string); }
		 

	}

}
