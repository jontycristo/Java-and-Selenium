package JavaConcepts;

public class GreatestNumArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		int count=a.length;
		for(int i=0; i<count;i++)
		{
			for(int j=i+1; j<i;j++)
			{
				if(a[i]>a[j])
				{
					System.out.println(a[j]);
				}
				else if(a[j]>a[i])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
