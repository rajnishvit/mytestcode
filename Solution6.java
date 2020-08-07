import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result6 {
	/*
	 * Complete the 'compareFriends' function below.
	 *
	 * The function is expected to return a STRING_ARRAY. The function accepts
	 * STRING_ARRAY frndsList as parameter.
	 */
	public static List<String> compareFriends(List<String> frndsList) {
		List<String> op = new ArrayList<String>();
		for (int i = 0; i < frndsList.size(); i++) {
			String s1 = frndsList.get(i);
			String arr1[] = s1.split(",");
			boolean f = false;
			for (int j = i + 1; j < frndsList.size(); j++) {
				boolean f1 = false;
				boolean f2 = false;
				String arr2[] = frndsList.get(j).split(",");
				if (arr1[0].equals(arr2[0]) || arr1[0].equals(arr2[1]))
					f1 = true;
				if (arr1[1].equals(arr2[0]) || arr1[1].equals(arr2[1]))
					f2 = true;
				if (f1 && f2) {
					f = true;
					break;
				}
			}
			if (!f)
				op.add(s1);
		}
		Collections.sort(op);
		System.out.println(op);
		return op;
	}
}

public class Solution6 {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		int frndsListCount = Integer.parseInt(bufferedReader.readLine().trim());
		List<String> frndsList = new ArrayList<>();
		for (int i = 0; i < frndsListCount; i++) {
			String frndsListItem = bufferedReader.readLine();
			frndsList.add(frndsListItem);
		}
		List<String> result = Result6.compareFriends(frndsList);
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
