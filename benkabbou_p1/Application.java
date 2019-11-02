package benkabbou_p1;

import java.io.IOException;

public class Application {

	public static void main(String[] args) throws IOException {
		DuplicateRemover.remove("problem1.txt");
		DuplicateRemover.write("unique_words.txt");

	}

}
