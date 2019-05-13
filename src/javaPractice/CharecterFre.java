package javaPractice;

public class CharecterFre {

	public static void main(String[] args) {

		String s = " hello hi 	worlddeoih";
		String s1=s.replace(" ","").replace("\t","");
		char[] c = s1.toCharArray();
		int sz = c.length;
		int count = 0;
		for (int i = 0; i < sz; ++i) {
			count = 0;
			for (int j = 0; j < sz; ++j) {
				if (j < i && c[i] == c[j]) {
					break;
				}
				if (c[j] == c[i]) {
					count++;
				}
				if (j == sz - 1) {
					System.out.println("the charecter of " + c[i] + " is present " + count + " times");
				}
			}
		}
	}

}
