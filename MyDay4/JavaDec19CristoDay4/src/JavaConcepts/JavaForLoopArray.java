package JavaConcepts;

public class JavaForLoopArray {

	public static void main(String[] args) {
		int array[]= new int[5];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		
		int rows=array.length;
		
		System.out.println("Number of Rows: "+rows);
		
		for(int i=0;i<rows;i++)
		{
			System.out.println(array[i]);
		}

	}

}
