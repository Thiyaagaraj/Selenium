package selenium;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to demonstrate the String Buffer is mutable
		
		/*
		 * System.out.println("String is Immutable"); String name = "Arya";
		 * System.out.println("Appending a name to Original :"+name.concat("Prasath"));
		 * System.out.println("Orignal name :"+name);
		 * System.out.println("*******************************************");
		 * System.out.println("String Buffer is MUTABLE"); StringBuffer name1 = new
		 * StringBuffer("Arya");
		 * System.out.println("Appending a name to Original :"+name1.append("prasath"));
		 * System.out.println("Original name :"+name1);
		 */
		
		StringBuffer name1 = new StringBuffer("Arya");
		//StringBuffer Methods
		//Reverse
		System.out.println("Reversed name: "+name1.reverse());
		//Replace
		StringBuffer replaceThis = new StringBuffer("Arul");
		System.out.println("Replaced name :"+replaceThis.replace(0, 3, "Riya"));
		
		//delete
		StringBuffer delete = new StringBuffer("XYZRiya");
		System.out.println("Deleted name :"+delete.delete(0, 3));
		
		//Insert
		StringBuffer insert = new StringBuffer("Moni");
		System.out.println("Insert :"+insert.insert(4, "sha"));
		
		//capacity
		System.out.println(insert.capacity());
		//Like String we have charAt,Substring, length methods as well
	}

}
