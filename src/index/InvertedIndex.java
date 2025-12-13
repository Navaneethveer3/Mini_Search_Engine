package index;
import java.util.*;

public class InvertedIndex {
	public List<Integer> findWord(String word){
		if(IndexBuilder.wordToDoc.containsKey(word)) {
			Set<Integer> hash = IndexBuilder.wordToDoc.get(word);
			return new ArrayList<>(hash);
		}
		return new ArrayList<>();
	}
	public boolean addWord(int docId, String word) {
		if(!IndexBuilder.wordFreq.containsKey(docId)) {
			return false;
		}
		IndexBuilder.wordFreq.get(docId).put(word, IndexBuilder.wordFreq.get(docId).getOrDefault(word, 0)+1);
		if(!IndexBuilder.wordToDoc.containsKey(word)) {
			IndexBuilder.wordToDoc.put(word, new HashSet<>());
		}
		IndexBuilder.wordToDoc.get(word).add(docId);
		return true;
	}
	public int wordOccurence(int docId, String word) {
		if(IndexBuilder.wordFreq.containsKey(docId)) {
			if(IndexBuilder.wordFreq.get(docId).containsKey(word)) {
				return IndexBuilder.wordFreq.get(docId).get(word);
			}
		}
		return -1;
	}
}
