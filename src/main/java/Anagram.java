import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {

	private final String[] wordList;

	public Anagram(String[] wordList) {
		this.wordList = wordList;
	}

	public List<String> generate(String input) {
		if (wordList.length == 0)
			return new ArrayList<String>();
		
		for (String firstPartOfAnagram : wordList)
			for (String secondPartOfAnagram : wordList)
				if (isAnagram(input, firstPartOfAnagram, secondPartOfAnagram))
					return Arrays.asList(new String[] { firstPartOfAnagram + " " + secondPartOfAnagram});
		
		return new ArrayList<String>();
	}

	private boolean isAnagram(String input, String firstPartOfAnagram, String secondPartOfAnagram) {
		char[] inputChars = input.toCharArray();
		Arrays.sort(inputChars);
		char[] anagramChars = (firstPartOfAnagram + secondPartOfAnagram).toCharArray();
		Arrays.sort(anagramChars);
		return Arrays.equals(inputChars, anagramChars);
	}

}
