package q122;
import java.io.*;
import java.util.*;
 
public class Main_2 {
	
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		String line;
		
		while (sc.hasNextLine() && (line = sc.nextLine()) != null) {
			examine(line);
		}
		sc.close();
	}

	public static void examine(String line)
	{
		String resultString = "";
		for(int i = 0; i < line.length(); i++)
		{
			char text = line.charAt(i);
			
			if(Character.isDigit(text))
			{
				resultString = resultString.concat(String.valueOf(text));
			}
			else if((int)text >= 97 && (int)text <= 106)
			{
				resultString = resultString.concat(String.valueOf((int)text - 97));
			}
		}

		if(resultString.isEmpty())
		{
			resultString = "NONE";
		}
		
		System.out.println(resultString);
	}
}