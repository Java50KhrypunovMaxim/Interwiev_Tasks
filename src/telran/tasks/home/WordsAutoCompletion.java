package telran.tasks.home;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class  WordsAutoCompletion implements Word {
	
	TreeMap<String, String> map = new TreeMap<String, String>();

	@Override
	public boolean addWord(String word) {
		boolean result = true;
		if (!map.containsKey(word.toLowerCase())) {
			map.put(word.toLowerCase(), word);
			result = true;
		}
		return result;
	}

	@Override
	public List<String> getWordsByPrefix(String prefix) {
		prefix = prefix.toLowerCase();
		TreeMap<String, String> subMap = new TreeMap<>(map.subMap(prefix, true, prefix + Character.MAX_VALUE, true));
		return new ArrayList<>(subMap.values());
	}

}
