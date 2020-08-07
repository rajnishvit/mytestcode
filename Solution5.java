import java.io.*;
import java.util.*;

class Result5 {
	/*
	 * Complete the 'processStrings' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * following parameters: 1. STRING str1 2. STRING str2
	 */
	public static List<String> processStrings(String str1, String str2) {
		List<String> op = new ArrayList<String>();
		String op1 = "", op2 = "";
		op1 = output(str1, str2);
		op2 = output(str2, str1);
		op.add(op1);
		op.add(op2);
		return op;
	}

	public static String output(String str1, String str2) {
		String op = "";
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			boolean found = false;
			for (int j = 0; j < str2.length(); j++) {
				if (ch == str2.charAt(j)) {
					found = true;
					break;
				}
			}
			if (!found)
				op = op.concat(new Character(ch).toString());
		}
		return op;
	}
}

public class Solution5 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		String str1 = bufferedReader.readLine();
		String str2 = bufferedReader.readLine();
		List<String> result = Result5.processStrings(str1, str2);
		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(result.get(i));
			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}
		bufferedWriter.newLine();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
