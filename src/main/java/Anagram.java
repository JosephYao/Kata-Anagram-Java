import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {

	private String[] wordList;

	public Anagram(String[] wordList) {
		this.wordList = wordList;
	}

	public List<String> generate(String input) {
		if (wordList.length == 0)
			return new ArrayList<String>();
		
		for (String anagram : wordList)
			if (isAnagram(input, anagram))
				return Arrays.asList(new String[]{anagram + " " + anagram});
		
		return new ArrayList<String>();
	}

	private boolean isAnagram(String input, String anagram) {
		return (anagram + anagram).equals(input);
	}

}
