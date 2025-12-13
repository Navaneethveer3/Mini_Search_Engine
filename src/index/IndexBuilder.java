package index;
import util.FileReaderUtil;
import util.Tokenizer;
import java.io.File;
import java.util.*;




public class IndexBuilder {
	static Map<String,Set<Integer>> wordToDoc = new HashMap<>();
	static Map<Integer,Map<String,Integer>> wordFreq = new HashMap<>();
	static int docId = 1;
	public static void processDocuments() {
		File path = new File("documents");
		if(!path.exists() || !path.isDirectory()) {
			System.err.println("Error: the documents folder or directory does not exist.");
			return;
		}
		File[] filesList = path.listFiles();
		if(filesList==null) {
			System.err.println("Error: couldn't fetch the files.");
		}
		for(File file : filesList) {
			if(file.isFile()) {
				try {
					FileReaderUtil fru = new FileReaderUtil();
					Tokenizer tokenExtractor = new Tokenizer();
					String content = fru.readDocument(file);
					String[] extracted = tokenExtractor.extractWords(content);
					for(String word : extracted) {
						if(!wordToDoc.containsKey(word)) {
							wordToDoc.put(word, new HashSet<>());
						}
						wordToDoc.get(word).add(docId);
						if(!wordFreq.containsKey(docId)) {
							wordFreq.put(docId,new HashMap<>());
						}
						wordFreq.get(docId).put(word, wordFreq.get(docId).getOrDefault(word, 0)+1);
					}
					docId++;
				}
				catch(Exception e) {
					System.err.println(e);
				}
			}
		}
	}
}
