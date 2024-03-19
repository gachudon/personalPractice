package pack_0229;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"reaver","kayak","Borrow or rob","level", "주유소의 소유주", "야 너 이번주 주번이 너야", "살금 살금"};
//		System.out.println("Borrow or rob".replaceAll(" ", "").length());
		for(int i=0;i<strs.length;i++) {
			System.out.printf("%s --> %s\n",strs[i],(isPalindrom(strs[i],0)?"O":"X"));
		}
	}

	public static boolean isPalindrom(String str, int n) {
		str = str.replaceAll(" ", "");
		str = str.toLowerCase();
		if(n >= str.length()/2) return true;
		else if(str.charAt(n)==str.charAt(str.length()-n-1))
			return isPalindrom(str, n+1);
		else return false;
	}
}
