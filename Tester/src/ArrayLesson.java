
public class ArrayLesson
	{

		public static void main(String[] args)
			{
			int myArray[] = new int [5];
			for(int i =0; i<myArray.length; i++)
				{
					myArray[i]=7;
				}
				
			for(int fred:myArray)
				{
					System.out.println(fred);
				}

			}

	}
