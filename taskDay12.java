
public class taskDay12 {
boolean isNum(String data)
{
	int ctr=0;
	char[] arr=data.toCharArray();
	for(int i=0;i<=data.length()-1;i++)
	{
		if(arr[i]>='0' && arr[i]<='9')
			ctr++;
			}
			if(ctr>0)
				return true;
			else 
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taskDay12 t=new taskDay12();
		boolean b=t.isNum("str123");
		System.out.println(b);

	}

}
