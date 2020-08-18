
public class Calculation {
	int sum(int... x){
		int s=0;
		int even=0;
		int odd=0;
		int max = x[0];
	    int min = x[0];
		System.out.println(x.length);
		for(int i=0;i<x.length;i++)
		{
			s=s+x[i];
			if(x[i]%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}   
			      if(max < x[i]){
			        max =x[i];
			      }else if(min > x[i]){
			        min = x[i];
			      }		   		   
			
		}
		System.out.println("Maximum number = " + max + " Minimum number = " + min);
		System.out.println("even numbers are  " +even);
		System.out.println("odd numbers are  " +odd);
		System.out.println("sum is  " +s);
		return s;
		}

	public static void main(String[] args) {
			Calculation c=new Calculation();
			c.sum(10,1,4,23,45);
			}
	}

