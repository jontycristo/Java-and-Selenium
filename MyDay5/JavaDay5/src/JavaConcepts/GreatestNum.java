package JavaConcepts;

public class GreatestNum {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=60;
		a[4]=50;
		
		int count=a.length;
		int largest=0;
		for(int i=0; i<count;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
		}
		System.out.println("Largest Number in Array: "+largest);

	}

}