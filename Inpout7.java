import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Inpout7 {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("G:/Hi/text123.txt", true);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many?");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name:");
			String s = sc.next();
			if(s.startsWith("su"))
				fw.write(s);
				fw.write("|");
		}
		fw.close();
		sc.close();
	}

}
