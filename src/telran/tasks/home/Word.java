package telran.tasks.home;

import java.util.List;

public interface Word {
	boolean addWord(String word);

	List<String> getWordsByPrefix(String prefix);
}
