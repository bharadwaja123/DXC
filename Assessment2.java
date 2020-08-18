public class Assessment2 {
	void mySubStr(String data)
	{
		String str = data; 
        String[] arrOfStr = str.split(" ", -2); 
  
        for (String a : arrOfStr) 
            System.out.println(a); 
	}
	public void revStr(String str)
	  {
	String[] words = str.split(" ");
	String reversedString = "";
	String[] my=new String[10];
	for (int i = 0; i < words.length; i++)
	       {
	          String word = words[i];
	          String revW = "";
	          for (int j = word.length()-1; j >= 0; j--)
	  {
	revW = revW + word.charAt(j);
	  }
	  reversedString = reversedString + revW + " ";
	}
	System.out.println(str);
	String[] arrS=reversedString.split(" ");
	for(int i=0;i<arrS.length;i++)
	{
		my[i]=arrS[i];
		System.out.println(my[i]);
	}
	  }
	
	public static void main(String[] args) {
       Assessment2 a=new Assessment2();
       a.mySubStr("This Is Java Programming");
       Assessment2 r=new Assessment2();
       r.revStr("This Is Java Programming");
       //System.out.println(s);
	}
}
