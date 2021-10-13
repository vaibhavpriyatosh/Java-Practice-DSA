import java.util.*;
class Inter_leaving{

	public static boolean intr_lev(String a,int na,String b,int nb,String c,int nc){

		boolean b1=true,b2=true;

		if(nc==c.length()-1)
			return true;

		if(na==a.length())
			b1=false;
		if(nb==b.length())
			b2=false;

		if(na<a.length() && nc<c.length()){

			if(a.charAt(na)==c.charAt(nc)){
				b1=intr_lev(a,++na,b,nb,c,++nc);
			}
			else
				b1=false;
		}
		if(nb<b.length() && nc<c.length()){
			if(b.charAt(nb)==c.charAt(nc)){
				b2=intr_lev(a,na,b,++nb,c,++nc);
			}
			else
				b2=false;
		}




		return b1||b2;

	}

	public static boolean isInterLeave_attempt1(String a,String b,String c){

		return intr_lev(a,0,b,0,c,0);

	}
	public static boolean isInterLeave(String A,String B,String C){

		 int M = A.length(), N = B.length();

        boolean [][] IL = new boolean[M + 1][N + 1];

        if ((M + N) != C.length())
            return false;

        for(int i = 0; i <= M; i++)
        {
            for(int j = 0; j <= N; j++)
            {

                if (i == 0 && j == 0)
                    IL[i][j] = true;

                else if (i == 0)
                {
                    if (B.charAt(j - 1) == C.charAt(j - 1))
                        IL[i][j] = IL[i][j - 1];
                }

                else if (j == 0)
                {
                    if (A.charAt(i - 1) == C.charAt(i - 1))
                        IL[i][j] = IL[i - 1][j];
                }

                else if (A.charAt(i - 1) == C.charAt(i + j - 1) && B.charAt(j - 1) != C.charAt(i + j - 1))
                    IL[i][j] = IL[i - 1][j];

                else if (A.charAt(i - 1) !=C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1))
                    IL[i][j] = IL[i][j - 1];

                else if (A.charAt(i - 1) ==C.charAt(i + j - 1) && B.charAt(j - 1) == C.charAt(i + j - 1))
                    IL[i][j] = (IL[i - 1][j] ||
                            IL[i][j - 1]);
            }
        }
        return IL[M][N];

	}

	public static void main(String[] args) {
		String a="aabcc";
		String b="dbbca";
		String c="aadbcbbca";
		System.out.println(isInterLeave(a,b,c)==true?1:0);
	}
}