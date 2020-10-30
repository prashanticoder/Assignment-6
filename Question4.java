import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Question4 {
public static void main(String[] args) {
	double maxium = 0.0;
	int temp = 0;
	List<String> list = new ArrayList<>();
	try {
		Scanner sc = new Scanner(new FileReader("data.txt"));
		String line = null;
		while (sc.hasNext()) {
			line = sc.nextLine();
			list.add(line);
		}
		for (int i = 0; i < list.size(); i++) {
			temp = Double.compare(Double.parseDouble(list.get(i)), maxium);
			if (temp > 0) {
				maxium = Double.parseDouble(list.get(i));
			}
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	System.out.println(maxium);
}
}
