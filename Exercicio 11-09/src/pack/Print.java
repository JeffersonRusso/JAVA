package pack;

public class Print {
	public Print(int [] array)
	{
		for (int i = 0; i < array.length; i++) {
			System.out.println("VETOR pos " + (  i + 1 )  + " VALOR " + array[i]);
		}
	}
	public Print(int [][] array)
	{
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.println("Vetor ["+i+"]["+j+"] = " + array[i][j] );
			}
		}
	}
}
