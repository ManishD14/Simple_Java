import java.util.HashMap;

import java.util.Map;
import java.util.Set;
public class Dublicate_Words {
public static void dublicate(String input)
{
	final String[] words=input.split(" ");
	// Creating one HashMap with words as key and their count as value
	final Map<String,Integer>wordCount=new HashMap<String,Integer>();
	// Checking each word
	for(String word:words)
	{
		// whether it is present in wordCount
		if(wordCount.containsKey(word))
		{
			// If it is present, incrementing it's count by 1
			wordCount.put(word, wordCount.get(word)+1);
		}
		else {
			// If it is not present, put that word into wordCount with 1 as
            // it's value
			wordCount.put(word,1);
			}
	}
	// Iterating through all words in wordCount
	 // Extracting all keys of wordCount
	final Set<String>wordString=wordCount.keySet();
	// Iterating through all words in wordCount
	for(String word:wordString)
	{
		 // if word count is greater than 1
	
		if (wordCount.get(word) > 1) {
            // Printing that word and it's count
            System.out.println(word + " : " + wordCount.get(word));
	         }
     }
	
}
	public static void main(String[] args) {
		dublicate("java guides java");

        dublicate("Java is java again java");

        dublicate("Super Man Bat Man Spider Man");

	}

}
