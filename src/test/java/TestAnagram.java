
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestAnagram {

	@Test
	public void empty_word_list_and_input_is_any_word() {
		Anagram generator = new Anagram(new String[]{});
		List<String> actualAnagrams = generator.generate("anyword");
		assertEquals(new ArrayList<String>(), actualAnagrams);
	}

}
