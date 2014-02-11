package q122;
import java.io.*;
import java.util.*;
 
public class Main {
	
	public static Map<String, String> dictionary;
	
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		String line;

		configDictionary();
		
		while (sc.hasNextLine() && (line = sc.nextLine()) != null) {
			examine(line.toCharArray());
		}
		sc.close();
	}

	public static void examine(char[] charArray)
	{
		String resultString = "";
		for(char text: charArray)
		{
			if(Character.isDigit(text))
			{
				resultString.concat(String.valueOf(text));
			}
			else
			{
				String targetString;
				targetString = dictionary.get(String.valueOf(text));
				if(targetString != null)
				{
					resultString.concat(targetString);
				}	
			}
		}
		
		if(resultString.isEmpty())
		{
			resultString = "NONE";
		}
		
		System.out.println(resultString);
	}
	
	public static void configDictionary()
	{
		dictionary = new HashMap<String, String>();
		dictionary.put("a", "0");
		dictionary.put("b", "1");
		dictionary.put("c", "2");
		dictionary.put("d", "3");
		dictionary.put("e", "4");
		dictionary.put("f", "5");
		dictionary.put("g", "6");
		dictionary.put("h", "7");
		dictionary.put("i", "8");
		dictionary.put("j", "9");
	}
 
}