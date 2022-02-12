
package ProgramTestYantra;

public class positionOfDigit {

	public static void main(String[] args) {
		String s="asd6^@5467";
		char[] ch = s.toCharArray();
		System.out.println(ch.length);
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0'&& ch[i]<='9'/*&& ch[i]>='a' && ch[i]<='z'*/) {
				System.out.println(ch[i]+"-->"+(i+1));
			}
		}
	}
}