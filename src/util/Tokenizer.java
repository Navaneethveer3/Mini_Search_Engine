package util;
import java.util.regex.*;

public class Tokenizer {
	public String[] extractWords(String sentence){
		String lower = sentence.toLowerCase();
		Pattern cleanedSentence = Pattern.compile("[a-z]+");
		Matcher match = cleanedSentence.matcher(lower);
		StringBuilder sb = new StringBuilder();
		while(match.find()) {
			sb.append(match.group()).append(" ");
		}
		String[] tokenized = sb.toString().split("\\s+");
		return tokenized;
	}
}
