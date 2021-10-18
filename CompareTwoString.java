package week1.day2;

public class CompareTwoString {

	public static void main(String[] args) {
		//String str1 and str2 shares same memory location- so equal
		String str1="Kutty";
		String str2="Kutty";
		
		if(str1==str2) {
			 System.out.println(" Str1 and Str2: Same text");
		 }
		 else
			 System.out.println("Str1 and Str2: Diff text");
		 
		 System.out.println("***");
		 
		//String str3 and str4 created using new operator so new memory created-so not equal
		String str3 = new String("Kutty");
		 String str4 = new String("Kutty");
		 
		 if(str3==str4) {
			 System.out.println("Str3 and Str4: Same text");
		 }
		 else
			 System.out.println("Str3 and Str4: Diff text");
		 
		 System.out.println("***");

	}

}
