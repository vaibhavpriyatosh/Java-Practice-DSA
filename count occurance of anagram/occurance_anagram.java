import java.util.*;

class occurance_anagram{


	public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();
 
        // Sorting temp array using
        Arrays.sort(tempArray);
 
        // Returning new sorted string
        return new String(tempArray);
    }
 

	static int search1(String pat, String txt) {
        
		int n=txt.length();

        int k=pat.length();
        pat=sortString(pat);
        
        int count=0;
        for (int i=0;i<n-k+1 ;i++ ) {
 			String neww=sortString(txt.substring(i,i+k));
 			System.out.println(neww+" "+pat);
 			if(neww.equals(pat))
 				count++;
        }
        return count;
    }

	public static void main(String[] args) {
		String pat="aaba",txt="aabaabaa";
		System.out.println(search(pat,txt));

		System.out.println(sortString("for"));

	}
	static int search2(String p, String s) {
        // code here
        int CHARACTERS = 256;
        int sn = s.length();
        int pn = p.length();
        int count = 0;
        if (sn < 0 || pn < 0 || sn < pn)
            return 0;
 
        char[] pArr = new char[CHARACTERS];
        char[] sArr = new char[CHARACTERS];
        int i = 0;
        // till window size
        for (; i < pn; i++) {
            sArr[CHARACTERS - s.charAt(i)]++;
            pArr[CHARACTERS - p.charAt(i)]++;
        }
        if (Arrays.equals(pArr, sArr))
            count += 1;
        // next window
        for (; i < sn; i++) {
            sArr[CHARACTERS - s.charAt(i)]++;
            sArr[CHARACTERS - s.charAt(i - pn)]--;
 
            if (Arrays.equals(pArr, sArr))
                count += 1;
        }
        return count;
    }
}