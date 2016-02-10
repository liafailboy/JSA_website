import java.io.*;
import java.util.*;
import java.lang.*;

public class RandomKaruta {
	public static void main(String[] args) {

		ArrayList<String> listOfStrings = new ArrayList<String>();

		try {
			File file = new File("data.txt");
			Scanner scanner = new Scanner(file);
			
			while (scanner.hasNext()) {
				String string = scanner.next();
				listOfStrings.add(string);
			}
		} catch(FileNotFoundException e) {
			System.out.println(e);
		}
		long seed = System.nanoTime();
		Collections.shuffle(listOfStrings, new Random(seed));
		for (int i = 0; i < listOfStrings.size(); i++) {
			System.out.println(listOfStrings.get(i));
		}
	}
}