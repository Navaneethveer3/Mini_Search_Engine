package util;
import java.io.IOException;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;

public class FileReaderUtil {
	public String readDocument(File file) throws IOException{
		if(file==null || !file.isFile()) {
			throw new IllegalArgumentException("The provided argument must be a valid file object.");
		}
		Path filePath = file.toPath();
		String content = Files.readString(filePath,StandardCharsets.UTF_8);
		return content;
	}
}
