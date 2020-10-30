import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Question2 {
public static void main(String[] args) throws IOException{
	FileInputStream fn=new FileInputStream("read.txt");
	Scanner file=new Scanner(fn);
	ArrayList<String> words=new ArrayList<String>();
	ArrayList<Integer> count=new ArrayList<Integer>();
	while(file.hasNext())
	{
		String nextword=file.next();
		if(words.contains(nextword))
		{
			int index=words.indexOf(nextword);
			count.set(index, count.get(index)+1);
		}
		else
		{
			words.add(nextword);
			count.add(1);
		}
	}
	file.close();
	fn.close();
	for(int i=0;i<words.size();i++)
	{
		System.out.println(words.get(i)+"occured"+count.get(i)+"times");
	}
	
}
}
