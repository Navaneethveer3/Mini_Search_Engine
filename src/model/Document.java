package model;

public class Document {
	int id;
	String fileName;
	String content;
	public Document(int id, String fileName, String content) {
		this.id = id;
		this.fileName = fileName;
		this.content = content;
	}
}
