package Demo;

public class EvenNumberPrinter {
	
	public static void printEvenNumber(int n)
	{
		int i;
		for(i=1; i<=n; i++)
		{
			if(i % 2== 0)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEvenNumber(10);
	}	

}
