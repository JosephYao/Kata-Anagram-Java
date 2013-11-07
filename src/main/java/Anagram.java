import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Anagram {

	private final List<String> wordList;

	public Anagram(String[] wordList) {
		this.wordList = Arrays.asList(wordList);
	}

	public List<String> generate(String input) {
		List<String> anagrams = new ArrayList<String>();
		
		List<String> firstPartOfAnagrams = wordList;
		for (String firstPart : firstPartOfAnagrams)
			for (String secondPart : secondPartOfAnagrams(firstPart))
				if (isAnagram(input, firstPart, secondPart))
					anagrams.add(createAnagram(firstPart, secondPart));
		
		return anagrams;
	}

	private String createAnagram(String firstPartOfAnagram,
			String secondPartOfAnagram) {
		return firstPartOfAnagram + " " + secondPartOfAnagram;
	}

	private List<String> secondPartOfAnagrams(String firstPartOfAnagram) {
		return wordList.subList(wordList.indexOf(firstPartOfAnagram), wordList.size());
	}

	private boolean isAnagram(String input, String firstPartOfAnagram, String secondPartOfAnagram) {
		char[] inputChars = input.toCharArray();
		Arrays.sort(inputChars);
		char[] anagramChars = (firstPartOfAnagram + secondPartOfAnagram).toCharArray();
		Arrays.sort(anagramChars);
		return Arrays.equals(inputChars, anagramChars);
	}

}
