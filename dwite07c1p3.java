package problems;
import java.io.*;
public class dwite07c1p3 {
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		String input = in.readLine();
		String dvorak = "[]',.pyfgcrl/=aoeuidhtns-;qjkxbmwvz{}\"<>PYFGCRL?+AOEUIDHTNS_:QJKXBMWVZ";
		String qwerty = "-=qwertyuiop[]asdfghjkl;'zxcvbnm,./_+QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
		for (int i = 0;i < input.length();i++) {
			char a = input.charAt(i);
			int index = dvorak.indexOf(a);
			if (index != -1) {
				System.out.print(qwerty.charAt(index) + "");
			} else {
				System.out.print(a + "");
			}
		}
	}
}
