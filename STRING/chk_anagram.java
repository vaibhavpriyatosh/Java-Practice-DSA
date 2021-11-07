class chk_anagram{
	public static void main(String[] args) {
		
	}
	 public static boolean isAnagram(String a,String b)
    {
        
        int na=a.length();
        int nb=b.length();
        
        int count[]=new int[26];
        
        for(int i=0;i<na;i++)
            count[a.charAt(i)-'a']++;
        
        for(int i=0;i<nb;i++){
            count[b.charAt(i)-'a']--;
            if(count[b.charAt(i)-'a']<0)
                return false;
        }
        
        return true;
    }
}