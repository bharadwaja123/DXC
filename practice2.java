class practice2
{
	public static void main(String[] args) {
		
String str = "This Is Java Programming"; 
        String[] arrOfStr = str.split(" ", -2); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
	}
}