import java.util.Stack;

public class multidimarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /*int [][] marks=new int[3][20];
  System.out.println(marks.length);
  System.out.println(marks[0].length); intro of multidimension
  System.out.println(marks[1].length);
  System.out.println(marks[2].length);
  System.out.println(marks[0][10]);*/
		
		/*int [][] marks=new int[3][];
		 marks[0]=new int[30];
		 marks[1]=new int[20];
		 marks[2]=new int[50];  for different lengths of inner array  to save memory
		 System.out.println(marks[0].length);
		  System.out.println(marks[1].length);
		  System.out.println(marks[2].length);*/
		
		/*String[] types=new String[3];
		types[0]="cricket";
		types[1]="football";  string type using array
		types[2]="ufc";
		System.out.println(types[1]);*/
		
		String[][] data= {{"Dhoni","smith","sachin"},{"ramos","messi"},{"khabib","jones","conor","tony"}};
		for(int i=0;i<data.length;i++)
		{
			for(int j=0;j<data[i].length;j++)
			{
				System.out.print(data[i][j]+"  ");
			}
			System.out.println();
		}
		 System.out.println("==========================");
		 for(String[] a:data)
		 {
			 for(String b:a)
			 {
				 System.out.print(b+" ");
			 }
			 System.out.println();
		 }
	}

}
