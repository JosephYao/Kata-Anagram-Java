import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagram {

	private final List<String> wordList;

	public Anagram(String[] wordList) {
		this.wordList = Arrays.asList(wordList);
	}

	public List<String> generate(String input) {
		if (wordList.isEmpty())
			return new ArrayList<String>();

		List<String> anagrams = new ArrayList<String>();

		for (String firstPartOfAnagram : wordList)
			for (String secondPartOfAnagram : secondPartOfAnagramCandidates(firstPartOfAnagram))
				if (isAnagram(input, firstPartOfAnagram, secondPartOfAnagram))
					anagrams.add(createAnagram(firstPartOfAnagram,
							secondPartOfAnagram));

		return anagrams;
	}

	private List<String> secondPartOfAnagramCandidates(String firstPartOfAnagram) {
		return wordList.subList(wordList.indexOf(firstPartOfAnagram),
				wordList.size());
	}

	private String createAnagram(String firstPartOfAnagram,
			String secondPartOfAnagram) {
		return firstPartOfAnagram + " " + secondPartOfAnagram;
	}

	private boolean isAnagram(String input, String firstPartOfAnagram,
			String secondPartOfAnagram) {
		return sortedCharsOfStrings(firstPartOfAnagram, secondPartOfAnagram)
				.equals(sortedCharsOfStrings(input));
	}

	private List<Character> sortedCharsOfStrings(String... originalStrings) {
		List<Character> result = new ArrayList<Character>();
		for (String eachString : originalStrings)
			for (char eachChar : eachString.toCharArray())
				result.add(eachChar);
		Collections.sort(result);
		return result;
	}

}
