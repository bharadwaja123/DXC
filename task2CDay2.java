
public class task2CDay2 {
	int countCaps(String data)
	{
		int ctr=0;
		char[] arr=data.toCharArray();
		for(int i=0;i<=data.length()-1;i++)
		{
			if(arr[i]>= 'A' && arr[i]<= 'Z')
			{
			ctr++;
			}}
			return ctr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task2CDay2 t= new task2CDay2();
		int a=t.countCaps("strinG");
		System.out.println(a);
	}

}
