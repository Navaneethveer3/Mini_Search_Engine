package App;
import index.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		IndexBuilder.processDocuments();
		Scanner sc = new Scanner(System.in);
		InvertedIndex II = new InvertedIndex();
		System.out.println("Choose an option : \n1. Search word \n2. Add a word to a document \n3. Get the occurences of a word in a document \n4. Exit");
		while(true) {
			int option = sc.nextInt();
			sc.nextLine();
			if(option==1) {
				System.out.println("Enter the Word to be searched : ");
				String word = sc.nextLine();
				word = word.trim().toLowerCase();
				List<Integer> documents = II.findWord(word);
				System.out.println(documents);
			}
			else if(option==2) {
				System.out.println("Enter the Document ID and the Word : ");
				int docId = sc.nextInt();
				sc.nextLine();
				String word = sc.nextLine();
				word = word.trim().toLowerCase();
				boolean isAdded = II.addWord(docId, word);
				if(isAdded) {
					System.out.println("The word added successfully!");
				}
				else {
					System.out.println("Document does not exist");
				}
			}
			else if(option==3) {
				System.out.println("Enter the Document ID and Word : ");
				int docId = sc.nextInt();
				sc.nextLine();
				String word = sc.nextLine();
				word = word.trim().toLowerCase();
				int occurences = II.wordOccurence(docId, word);
				if(occurences==-1) {
					System.out.printf("There is no word called %s, present in Document with ID %d", word, docId);
				}
				else {
					System.out.printf("The number of times the word present is %d",occurences);
				}
			}
			else if(option==4) {
				break;
			}
			else {
				System.out.println("Choose the right option between 1 to 4 : ");
			}
		}
		System.out.println("Exiting...");
		sc.close();
	}

}
