import java.util.*;
class test{//134,48

	public static void main(String[] args) {

		
		System.out.println(replaceDigits("a1c1e1e"));


		// String a="hello",b="ll";
		// int i=2;
		// System.out.println(compareString(a.substring(i,i+2),b));

		// int nums[]={0,1,1,1,2,2,3,3,4};
		// nums=rev_one(nums);	
		// for(int i=0;i<nums.length;i++)
		// 	System.out.println(nums[i]);

		
		/*String s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac";
		System.out.println(isInterleave(s1,s2,s3));
*/
		//String a[]={"alice,20,800,mtv","bob,50,1200,mtv"};
		//System.out.println(invalidTransactions(a));

		//System.out.println(angleClock(3,15));

		//frequencySort("aabAAddd");

		/*int a[]={1,2,1,1};
		System.out.println(rob(a));
*/
		/*String startTime = "12:00", finishTime = "12:45";
		System.out.println(clockmov(startTime,finishTime));
*/
		//System.out.println(numberOfRounds(startTime,finishTime));
	}
	public int balancedStringSplit(String s) {
    
		int n=s.length();

		int count=-1;
		int times=0;


		for (int i=0;i<n ;i++ ) {
			if(times==0)
				count++;

			if(s.charAt(i)=='L')
				times++;
			else
				time--;

		}

    }

	public static String replaceDigits(String s) {
        int l=s.length();
        String neww="";
        for (int i=1;i<l ;i=i+2) {
        	int n=Integer.parseInt(s.charAt(i)+"");
        	char a=((char)(s.charAt(i-1)+n));
        	s=s.substring(0,i)+a+s.substring(i+1);
        }
        return s;
    }

	public static String interpret(String s) {
     int n= s.length();

     String neww="";

     for (int i=0;i<n ;i++ ) {
     	char c=s.charAt(i);
     	if(c=='G')
     		neww=neww+"G";
     	else if(c=='(' && s.charAt(i+1)==')'){
     		i++;
     		neww=neww+"o";
	    }
	    else{
	    	i=i+3;
	    	neww=neww+"al";
	    }
     }
     return neww;

    }

	public static boolean check_unique(String s){
		for (int i=0;i<s.length() ;i++ ) {
			char c=s.charAt(i);
			for (int j=i+1;j<s.length() ;j++ ) {
				if(c==s.charAt(j))
					return false;
			}
		}
		return true;
	}

	public static int lengthOfLongestSubstring(String s) {
        int n=s.length();

        if(n==1)
        	return 1;

        int j=0,i=0;boolean t=false;
        for (;i<n && j<=n ;j++ ) {
        	String sub=s.substring(i,j);
        	System.out.println(i+" "+j+" "+sub);
        	if(!check_unique(sub)){
        		i++;
        		t=true;
        	}

        }
        if(t)
        	return j-i-1;

        return j-i;
    }

	static boolean chk_signs(char c){
		return (c=='+' || c=='/' || c=='*' || c=='-');
	} 

	public int evalRPN(String[] tokens) {

		if(tokens.length==1)
			return Integer.parseInt(tokens[0]);

	 	Stack<String> stack1 = new Stack<String>();

	 	for (int i=0;i<tokens.length ;i++ ) {
	 		
	 		if(chk_signs(tokens[i].charAt(0))){
	 			String digit1=stack1.pop();
	 			String digit2=stack1.pop();

	 			if(tokens[i].charAt(0)=='/'){
	 				stack1.push((Integer.parseInt(digit2)/Integer.parseInt(digit1))+"");
	 				continue;
	 			}
	 			else if(tokens[i].charAt(0)=='*'){
	 				stack1.push((Integer.parseInt(digit2)*Integer.parseInt(digit1))+"");
	 				continue;
	 			}
	 			else if(tokens[i].charAt(0)=='+'){
	 				stack1.push((Integer.parseInt(digit2)+Integer.parseInt(digit1))+"");
	 				continue;
	 			}
	 			else 
	 			{
	 				stack1.push((Integer.parseInt(digit2)-Integer.parseInt(digit1))+"");
	 				continue;
	 			}

	 		}
	 		stack1.push(tokens[i]);
	 		
	 	}

	 	return (Integer.parseInt(stack1.pop()));

    }


	// public List<List<Integer>> lvl_order(TreeNode rn,TreeNode ln,List <List<Intrger>ll){

	// 	List <Integer> li=new LinkedList <> ();

	// 	if (ln !=null) 
	// 		li.add(ln.val);

	// 	if (rn !=null) 
	// 		li.add(rn.val);

	// 	ll.add(li);

	// 	if(ln.next ==null &&)			
		



	// }

	// public List<List<Integer>> levelOrder(TreeNode root) {
        
	// 	List <List<Integer>> ll=new LinkedList <> ();
	// 	List <Integer> li=new LinkedList <> ();

	// 	if(root == null)
	// 		return ll

	// 	li.add(root.val);
	// 	ll.add(li);

	// 	if(root.left==null && root.right==null){
	// 		return ll
	// 	}

	// 	lvl_order(root.left,root.right,ll);

	// 	return ll;

 //    }

	static int cntbit(int n){

		if(n==1)
			return 1;

		int count=0;

		while(n!=0){
			count++;
			n=n/2;
		}

		return count-1;

	}

	public static int countSetBits(int n){
    	
		int t=n-(int) Math.pow(2,cntbit(n));

		return t;

    }

	static int repeated(String A,String B){
		int na=A.length();
		int nb=B.length();

		char cb=B.charAt(0);
		int count=1;

		int i=0;
		while(i<na){
			if(cb==A.charAt(i)){
				int j=0;
				while(j<Math.min(A.length(),B.length())){

				}
			}
		}
		return 0;
	}

	
	static int repeatedStringMatch(String A, String B) 
	{ 
        int na=A.length();
        int nb=B.length();
        String C=A;

        int count=1;
        while(nb>A.length()){
        	
        	count++;
        	A=A+C;
        }
        if(A.substring(0,+nb).equals(B))
        	return count;
        
        	count++;
        	A=A+C;

        int k=0;
        int i=0;
        char cb=B.charAt(0);

        for (i=0;i<na ;i++ ) {
        	if(cb==A.charAt(i)){
        		if (B.equals(A.substring(i,i+nb))){
        			k=i+nb;break;
        		}
        	}
        }

    
        int y=count;
        if(A.length()-i+nb>i)
        	count--;
        
        

        if(k==0)
        	return -1;
        else
        	return count;


	} 

	static double medianOfArrays(int n, int m, int a[], int b[]) 
    {

    	int mid=(n+m)/2+1;
    	int merge[]=new int[mid];

  

    	int i= 0,j=0,midInd = mid,k=0;
        int [] merged = new int[midInd];
        while(i<n && j<m && k<midInd){
            if(a[i]<b[j]){
                merged[k] = a[i];
                i++;
            }
            else {
                merged[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n && k<midInd){
            merged[k] = a[i];
            i++;
            k++;
        }
        while(j<m && k<midInd){
            merged[k] = b[j];
            j++;
            k++;
        }
        if((n+m)%2==0){
        	double r=(merged[mid-1]+merged[mid-2]);
        	return r/2;
        }

        return merged[mid-1];

    }

	public static int minPairSum(int[] nums) {
     int n=nums.length;
     Arrays.sort(nums);

     int start=0,end=n-1;
     int max=nums[start]+nums[end];

     while(start<=end){
     	int k=nums[start]+nums[end];
     	max=k>max?k:max;start++;end--;
     }
     return max;
    
    }

	public static int[] merge_sort(int num[]){

		int n=num.length;

		if(n==1)
			return num;

		int a[]=new int[n/2];
		int b[]=new int[n-n/2];
		int mid=n/2;
		a=Arrays.copyOfRange(num,0,mid);
		b=Arrays.copyOfRange(num,mid+1,n);

		return merging(merge_sort(a),merge_sort(b));

	}

			public static int[] merging(int a[],int b[]){
				// int i=0,j=0,t=0;
				// int a[]=new int[arr1.length+arr2.length];
				// while(i<arr1.length && j<arr2.length){
				// 	if (arr1[i]<arr2[j]) {
				// 		a[t]=arr1[i];t++;i++;
				// 	}
				// 	else if(arr1[i]>arr2[j]){
				// 		a[t]=arr2[j];t++;j++;
				// 	}
				// }
				// while(i<arr1.length){
				// 	a[t]=arr1[i];t++;i++;
				// }
				// while(j<arr2.length){
				// 	a[t]=arr2[j];t++;j++;
				// }
				// return a;
				int n=a.length,m=b.length;
				int i= 0,j=0,midInd = (n+m)/2 + 1,k=0;
		        int [] merged = new int[midInd];
		        while(i<n && j<m && k<midInd){
		            if(a[i]<b[j]){
		                merged[k] = a[i];
		                i++;
		            }
		            else {
		                merged[k] = b[j];
		                j++;
		            }
		            k++;
		        }
		        while(i<n && k<midInd){
		            merged[k] = a[i];
		            i++;
		            k++;
		        }
		        while(j<m && k<midInd){
		            merged[k] = b[j];
		            j++;
		            k++;
        }
        return merged;
		}


	    public static List<Integer> querySum(int n, int arr[], int q, int queries[])
	    {

	    	List<Integer> ll=new ArrayList<>();
	    	int sum=0;

	        // for (int i=0;i<q ;i=i+2 ) {
	        	
	        // 	sum=0;

	        // 	int start=queries[i]-1;
	        // 	int end=queries[i+1]-1;

	        // 	for (int j=start;j<=end ;j++ ) {
	        // 		sum=sum+arr[j];
	        // 		System.out.println(arr[j]);
	        // 	}
	        // 	ll.add(sum);

	        // }
	    	int t1=0,t2=0;
	        int a[]=new int[n];
	        a[0]=arr[0];
	        for (int i=1;i<n ;i++ ) {
	        	a[i]=a[i-1]+arr[i];
	        }

			for (int j=0;j<2*q ;j=j+2 ) {
				t1=0;
				int start=queries[j]-2;
				int end=queries[j+1]-1;

			if(start >=0){
				t1=a[start];
			}
			t2=a[end];

			ll.add(t2-t1);
   
			}
	        return ll;
	    }



		// public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
		// 	int min=Math.min(n,m);

		// 	int i=0,j=0,t=0;
		// 	long a[]=new int[arr1.length+arr2.length];
			
		// 	a=merging(arr1,arr2);

		// 	return a[k-1];
        
  //   	}

		public static int maxMeetings(int start[], int end[], int n)
    	{
        	end= sortacrdngtoother(start,end);
        	Arrays.sort(start);int i=0,count =0,prev=0;

        	while(i<n && end[i]<start[i])
        		i++;
        	if(n!=i){
        		prev=end[i];
        		count++;
        	}

        	while(i<n){
        		while(i<n && prev<start[i])
        			i++;
        		if(i==n){
        			return count;
        		}
        		else{
        			prev=end[i];
        			count++;
        		}          	}
        	return count;

    	}

		public static int [] sortacrdngtoother(int a[],int b[]){
			int n=a.length;

			for (int i=0;i<n ;i++ ) {
				for (int j=0;j<n-i-1 ;j++ ) {
					if(b[j]>b[j+1]){
						int temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;

						temp=b[j];
						b[j]=b[j+1];
						b[j+1]=temp;
					}
				}
			}

			return a;
		}

		public static boolean compareString(String a,String b){
			return a.equals(b);
		}

		public int strStr(String haystack, String needle) {
        
			int hn=haystack.length();
			int nn=needle.length();

			if(nn==0)
				return 0;

			char c=needle.charAt(0);

			for (int i=0;i<hn-nn+1 ;i++ ) {

				if(haystack.charAt(i)==c){
					if(compareString(haystack.substring(i,i+nn),needle)){
						return i;
					}
				}
				
			}
			return -1;

    	}

		public static boolean isprime(int n){

			int k=0;
			for(int i=2;i<Math.sqrt(n)+1;i++){
				if(n%i==0)
					return false;
			}
			return true;
		}

		public int countPrimes(int n){

			int k=0;

			if(n<=1)
				return 0;

	      		for (int i=2;i<n ;i++ ) {
	      	   		if(isprime(n))
	      	   			k++;
	      	   }  
	      	return k; 
	     }



	public static int removeDuplicates(int[] nums) {

		int i=0,t=0;
        while(i<nums.length){
        	int j=i+1;
        	while(j<nums.length && nums[i]==nums[j]){
        		j++;
        	}
        	nums[t]=nums[i];
        	i=j;
        	t++;
        }
        // int n=nums.length;
        // int t=1;
        // int k;



        // for (int i=0;i<n ;i++ ) {
        // 	k=nums[i];
        // 	i++;
        	
        // 	while(i<n && k==nums[i]){
        // 		nums[i]=0;
        // 		i++;
        		
        // 	}
        // 	System.out.println(i);
        // 	if(i==n){
        // 		System.out.println("111");
        // 		if(nums[n-1]==0){
        // 		System.out.println("111");

	       //  		break;
        // 		}
        // 		else{
        // 			        		System.out.println("111111111111");
        // 			nums[t]=nums[n-1];continue;
        // 		}
        // 	}
        // 	nums[t]=nums[i];
        // 	++t;
        // 	i--;
        // }
        // System.out.println(Arrays.toString(nums));
        
        return t;
    }
	public static boolean canBeIncreasing(int[] nums) {
     
		int n=nums.length;
		int k=0,t=0;


		for(int i=1;i<n;i++){
			if(nums[i-1]>nums[i]){
				k++;
				t++;
			}
			if(k==1 && t>0){
				if(t==2)
					return false;
				
				if(i>1 && nums[i-2]<nums[i]){
					k=0;
				}
				else if(n==1){
					System.out.println("yo");
					k=0;
				}
				else{
					//System.out.println("yo");
					return false;
				}
			}
			
		}

		return true;

    }

	// public int[] intersection(int[] nums1, int[] nums2) {
        
	// 	int n1=nums1.length;
	// 	int n2=nums2.length;

	// 	Arrays.sort(nums1);
	// 	Arrays.sort(nums2);

	// 	int i=0,j=0;

	// 	for (j=0;j<n1 ; ) {
	// 		k=nums1[j];
	// 		}

	// 		int arr[]={1}; 

	// 	return arr;

 //    }

	public static int[] rev_one(int [] nums){
		int n=nums.length;

		int k=nums[n-1];

		for (int i=n-1;i>0 ;i-- ) 
			nums[i]=nums[i-1];

		nums[0]=k;

		return nums;
		
	}
	public static void rotate(int[] nums, int k) {
        while(k!=0){
        	rev_one(nums);
        	k--;
        }


    }

	public static int posi(int nums[],int val){
		int n=nums.length;
		int key=val;

		int first=0,last=n-1,mid=(first+last)/2;

		  
   		while( first <= last ){  
      		if ( nums[mid] < key ){  
       			 first = mid + 1;     
      		}else if ( nums[mid] == key ){  
       			 break;  
      		}else{  
         		last = mid - 1;  
      		}  
     		 mid = (first + last)/2;  
   		}  
   
		while(mid>=0 && nums[mid]==val)
			mid--;

		return ++mid;
	}

	public static int removeElement(int[] nums, int val) {
        int n=nums.length;

        int k=posi(nums,val);

        int  i=k;
        int t=0;

        while(nums[i]==val){
        	i++;nums[i]=0;t++;
        }

        --t;
       	while(i<=n){

       		nums[i-t]=nums[i];
       		i++;
     
       	}
       	i--;
       	while(i-t<n)
       		nums[i-t]=0;
       
        return 0;
    }

	 public static int canCompleteCircuit(int[] gas, int[] cost) {
        int ng=gas.length;
        int nc=cost.length;

        int k=gas[0]-cost[0];int t=0;

        for (int i=1;i<ng ;i++ ) {
        	
        	if( k<gas[i]-cost[i] && gas[i]-cost[i]>0){
        		k=gas[i]-cost[i];t=i;
        	} 
        }

        int tank=gas[t];

        int z;	

        int i;

        for (i=1;i<=ng;i++ ) {

        	

        	z=t;
        	t++;

        	if(t==ng)
        		t=t-ng;
        	
        	
        	tank=tank-cost[z]+gas[t];
        	System.out.println(tank+" - "+cost[z]+" + "+gas[t]);
        	System.out.println(i+"Tank :- "+tank);

        	if(tank<0)
        		return -1;

        	}

        	return i;
        	
        }
        
    

//////////////////120

/*	public static int longestConsecutive(int[] nums) {
        
		int n=nums.length;

		int least,max;

		int add[]=new int [2000000001];
		int sub[]=new int [1000000000];

		Arrays.fill(add,0);
		Arrays.fill(sub,0);

		least=nums[0];
		max=num[0];

		for(int i=0;i<n;i++){

			if(least>nums[i])
				least=nums[i];
			
			if(max<nums[i]){
				if(nums[i]>=0)
				max=10000000000+nums[i]
			}

			if(nums[i]>=0)
				add[10000000000+nums[i]]++;
			else
				add[10000000000+nums[i]]++;
		}

		int k=0;
		for (int i=least;i<=max ;i++ ) {
			
		}

		return 0;
    }*/

	public static int comptri(List<List<Integer>> triangle,int k,int i){
		if(i==triangle.size())
			return 0;

		int sum=triangle.get(i).get(k);
		sum=sum+Math.min(comptri(triangle,k,++i),comptri(triangle,++k,++i));

		return sum;
	}

	public int minimumTotal(List<List<Integer>> triangle) {

		int k=0;

		int n=triangle.size();
		int sum=0,max=0;

		for (int i=0;i<n ;i++ ) {
			max=0;
			for(int j=0;j<n;j++){
				if(max<triangle.get(i).get(j))
					max=triangle.get(i).get(j);
			}
			sum=sum+max;
		}

        return (sum);
    }

	public static int maximumGap(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);

        int difference=0;

        for (int i=1;i<n ;i++ ) {
        	if(difference<nums[i]-nums[i-1])
        		difference=nums[i]-nums[i-1];
        }

        return difference;
    }

	//97
	public static boolean isInterleave(String s1, String s2, String s3) {
        
		int n1=s1.length();
		int n2=s2.length();
		int n3=s3.length();

		boolean k1=true,k2=true;

		int i1=0,i2=0,i3=0;
		while(i1<s3.length()&&(k1 || k2)){

			System.out.println(" 1 ");
			
			while(i3<n3 && i2<n2 && s3.charAt(i3)==s2.charAt(i2)){
				k1=true;k2=true;
				i3++;i2++;
			}

			System.out.println(" 2 ");

			if(i3<n3 && s3.charAt(i3)!=s2.charAt(i2))
				k1=false;
			
			System.out.println(" 3 ");

			//while(i3<n3 && i1<n1 s1.charAt(i1).isequalto(s3.charAt(i3))){
			//	k1=true;k2=true;
			//	i3++;i1++;
			//}

			System.out.println(" 4 ");

			if(i1<n3 && s1.charAt(i1)!=s3.charAt(i3))
				k2=false;
			
			System.out.println(k1+" 5 "+k2);

		}

		return k1||k2;

    }

	public static int finding(int nums[],int target){
		int pos=0;
		int n=nums.length;
		int start=0,end=n-1,mid=(start+end)/2;
		while(start<end){

			mid=(start+end)/2;
			
			if(nums[mid]==target)
				break;
			if(nums[mid]>target)
				start=mid;
			else
				end=mid;
		}

		if(target!=nums[mid])
			return -1;

		return mid;

	}

	//12

	/*

		I             1
		V             5
		X             10
		L             50
		C             100
		D             500
		M             1000

		I can be placed before V (5) and X (10) to make 4 and 9. 
		X can be placed before L (50) and C (100) to make 40 and 90. 
		C can be placed before D (500) and M (1000) to make 400 and 900.

	*/

	public static String intToRoman(int num) {
        
		String s="";

		if(num>=1000){
			while(num>=1000){
				s=s+"M";
				num=num-1000;
			}
			System.out.println(num);
		}

		System.out.println(num);

		if(num>=900){
			s=s+"CM";
			num=num-900;	
		}

		if(num>=500){
			s=s+"D";
			num=num-500;
		}

		if(num>=400){
			s=s+"CD";
			num=num-400;
		}

		if(num>=100){
			while(num>=100){
				s=s+"C";
				num=num-100;
			}
		}

		if(num>=90){
			s=s+"XC";
			num=num-90;
		}

		if(num>=50){
			s=s+"L";
			num=num-50;
		}

		if(num>=40){
			s=s+"XL";
			num=num-40;
		}

		if(num>=10){
			while(num>=10){
				s=s+"L";
				num=num-10;
			}
		}

		if(num==9){
			s=s+"IX";
			num=num-9;
		}

		if(num>=5){
			s=s+"V";
			num=num-5;
		}
		if(num==4){
			s=s+"IV";
			num=num-4;
		}
		if(num>=1){
			while(num>=1){
				s=s+"I";
				num=num-1;
			}
		}

		return s;

    }

	public static boolean cmprary(String a[],String b[]){
		
		if(Integer.parseInt(a[2])>1000)
			return true;	
		System.out.println("1");

		if(!a[0].equals(b[0]))
			return false;
		System.out.println("2");

		if(a[3].equals(b[3]))
			return false;
		System.out.println("3");

		if(Math.abs(Integer.parseInt(a[1])-Integer.parseInt(b[1]))<60)
			return true;

		System.out.println(Integer.parseInt(a[1])-Integer.parseInt(b[1]));
		System.out.println("4");

		return false;

	}

	public static String[] breakString(String s){

		System.out.println(s);

		String arr[]=new String[4];
		int m=0;
		
		for (int i=0;i<s.length() && m<4;i++ ) {
			int k=i;
			
			while(++i<s.length() && s.charAt(i)!=',');

			arr[m]=s.substring(k,i);

			System.out.println(arr[m]);m++;

		}

		return arr;

	}

//1169
	public static List<String> invalidTransactions(String[] transactions) {
 
		List<String> list1=new LinkedList<String>();
		
		if(transactions.length!=1)
		{
			for (int i=1;i<transactions.length ;i++ ) {
				
				String a1st[]=breakString(transactions[i-1]);
				String a2nd[]=breakString(transactions[i]);

				if(cmprary(a1st,a2nd))
					list1.add(transactions[i-1]);

				if(i==transactions.length-1 && cmprary(a2nd,a1st) )
					list1.add(transactions[i]);

			}
		}

		else{
			String arr[]=breakString(transactions[0]);
			if(Integer.parseInt(arr[2])>1000)
				list1.add(transactions[0]);
			return list1;
		}



		return list1;

    }

	public static String reverseWords(String s) {//316
        
    	Stack<String> stack = new Stack<String>();

    	s.trim();

    	for (int i=0;i<s.length() ;i++ ) {
    		int k=i;

    		while(++i<s.length() && s.charAt(i)!=' ');

    		System.out.println(k+" "+i+" - "+s.substring(k,i));

    		stack.push(s.substring(k,i).trim());
    	}
    	

    	String neww=stack.pop();

    	while(!stack.isEmpty())
    		neww=neww.trim()+" "+stack.pop(); 

    	return neww.trim();
        
    }

	public static int chk1(String s){
		
		int count =0;

		for (int i=0;i<s.length() ;i++ ) {

			if(s.charAt(i)=='1')
				count++;

		}

		return count;
	}

	public static int countDigitOne(int n) {
        
		int count=0;

		for(int i=0;i<=n;i++){
			count=count+chk1(i+"");
		}

		return count;

    }

	public static int llongestConsecutive(int[] nums) {
        
		int n=nums.length;

		int o=0,p=0;
		int min=nums[0],max=nums[0];

		for (int i=1;i<n ;i++ ) {
			if(min<nums[i] && min!=0)
				min=nums[i];
			if(max>nums[i])
				max=nums[i];
		}

		while(min<max)
		{
			int t=p;
			for (int i=0;i<n ;i++ ) {

				if(nums[i]==min)
					p++;			
			}
			t++;
			if(t!=p){
				if(o<p)
					t=p;
				t=0;p=0;
			}
			min++;
			
		}

		return 0;

    }

	public static double angleClock(int hour, int minutes) {
		//1344
        double mnt=6*minutes;
        if(hour==12)
        	hour=0;
        double hr=(hour)*30+((double)minutes/2) ;

        double k= Math.abs(hr-mnt);

        System.out.println(mnt+" "+hr);

        if(k<=180)
        	return k;

        return 360-k;
    }

	public static String frequencySort(String s) {

        int n=s.length();

        int a[]=new int[123];
        Arrays.fill(a,0);int k=0;
        
        String str[]=new String[123];
        Arrays.fill(str,"");

        for (int i=0;i<n ;i++ ) {


        	int p=(int)s.charAt(i);

        	a[p]++;

        	if(k<a[p])
        		k=a[p];

        }

        String b[]=new String[k+1];
        Arrays.fill(b,"");

        for (int i=65;i<123 ;i++ ) {

        	if(a[i]>0)
        		System.out.println((char)i+" - "+a[i]);
        	
        }
		
		return "l";        

    }

	public static int rob(int[] nums) {
        
		int n=nums.length;
		int sum1=0,sum2=0,i=0,sum3=0;
        

		while(i<n){

			if(i%2==0){

            System.out.println("sum1 "+nums[i]);
				sum1=sum1+nums[i];
			}
            else{
            	System.out.println("sum3 "+nums[i]);
                sum2=sum2+nums[i];
            }
            if(i%3==0){
			System.out.println("sum2 "+nums[i]);				
				sum3=sum3+nums[i];
			}

			i++;

			//System.out.println("sum - "+sum);

		}
        if(sum1>=sum2 && sum1>=sum3){
            System.out.println("sum1 - "+sum3);
            return sum1;
        }
        if(sum2>=sum3 && sum2>=sum1){
        	System.out.println("sum2 - "+sum2);
            return sum2;
        }
        else{
        	System.out.println("sum3 - "+sum3);
            return sum3;
        }

	
    }

	public static int clockmov(String startTime, String finishTime){

		int sth=Integer.parseInt(startTime.substring(0,2));
		int stm=Integer.parseInt(startTime.substring(3,5));

		int fth=Integer.parseInt(finishTime.substring(0,2));
		int ftm=Integer.parseInt(finishTime.substring(3,5));

		int k=0;

		if(stm==60){
			sth++;
		}
		if(sth==24)

		while(sth!=fth && stm!=ftm){

			sth=sth+15;
			k++;

			if(sth==60){
				sth=0;
				sth++;
			}
			if(sth==24)
				sth=0;
		
		}


		return k;

	}

	public static int numberOfRounds(String startTime, String finishTime) {
        
        int st=Integer.parseInt(startTime.substring(3,5));

        if(st%15 != 0)
        startTime=startTime.substring(0,3)+((st/15+1)*15);

        st=Integer.parseInt(finishTime.substring(3,5));


        if(st%15 != 0 )
        finishTime=finishTime.substring(0,3)+((st/15)*15);

    	System.out.println(startTime+" "+finishTime);

    	return 0;
    
    }

	public static int sumof(int n){
		
		if(n<=1)
			return n;
	
		return sumof(n-1)+n;

	}

	public static int consecutiveNumbersSum(int n) {///////////////////829
        
        int k=1;
        int y=1;
        int m=n/2+1;
        int sum=n;

        while(m>0 && sum<n){

        	if(sum==n)
        		k++;

        	sum = sumof(m)-sumof(m-y);
        	m--;

        }

        return 0;
    }


}
