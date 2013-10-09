
import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.List;

import org.junit.Test;


public class TestAnagram {

	@Test
	public void empty_word_list_and_any_word() {
		Anagram generator = new Anagram(new String[]{});
		List<String> actualAnagrams = generator.generate("anyword");
		assertEquals(Collections.EMPTY_LIST, actualAnagrams);
	}

}
