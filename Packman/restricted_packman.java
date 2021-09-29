import java.util.*;

class restricted_packman{

	public static boolean [] counting(int m,int n,int chk,boolean [] chk_val){

		if (chk>=chk_val.length) {
			return chk_val;
		}

		chk_val[chk]=true;

		boolean [] pass ;

		pass=counting(m,n,chk+m,chk_val);
		chk_val=counting(m,n,chk+n,chk_val);

		for (int i=0;i<chk_val.length ;i++ )
			chk_val[i]=chk_val[i] || pass[i];

		return chk_val;
		
	} 

	static int candies(int m, int n)
    {
    	int maximum=m*n-m-n;
        int count=0;


        boolean chk_val []=new boolean[maximum];
        int chk=0;

        chk_val=counting(m,n,chk,chk_val);

        for (int i=1;i<maximum ;i++ ) {
        	if(!chk_val[i])
        		count ++;
        }

        return count;

    }

    static int candies1(int m, int n)
    {

    	int val=m*n-m-n;
		int count=1;

		boolean chk[]=new boolean[val];


		for (int i=0;i<val ;i=i+n ) {
			for (int j=i;j<val ;j=j+m ) {
				chk[j]=true;
			}
		}

		for (int i=0;i<val ;i++ ) {
			if (!chk[i]) {
				count++;
			}
		}

    }

	public static void main(String[] args) {
		
	}
}