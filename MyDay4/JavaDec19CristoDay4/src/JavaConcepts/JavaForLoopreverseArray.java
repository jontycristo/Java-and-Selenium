package JavaConcepts;

public class JavaForLoopreverseArray {

	public static void main(String[] args) {
		int array[]= new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		
		
		for(int i=0 ; i<array.length;i++)
		{
			int j=i+1;
			if(array[i]>array[j])
			{
				System.out.println(array[i]);
			}
			else
			{
				System.out.println(array[j]);
			}
		}
	
	}

}
