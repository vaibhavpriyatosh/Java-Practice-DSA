import java.util.*;
class Minimum_sum {
    public static void main(String[] args) {
        
    }
    String solve(int[] arr, int n) {
        Arrays.sort(arr);
        String result="";
        int num1=0,num2=0,carry=0;
        for(int i=n-1;i>=0;i--){
            num1=arr[i];
            i--;
            num2=(i==-1)?0:arr[i];
            int res=num1+num2+carry;
            
            if(res>0)
            result=res%10+result;
            
            carry=res/10;
            
        }
        if(carry!=0)
        result=carry+result;
        
        return result;
        
    }

}
MinimumSum_final {
    String solve(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        StringBuilder sum = new StringBuilder();
        int i=n-2,j=n-1,carry = 0;
        while(i>=0 || j>=0){
            int a = 0,b=0;
            if(i>=0)
                a = arr[i];
            if(j>=0)
                b = arr[j];
            int s = a+b+carry;
            int add = s%10;
            if(s!=0)
                sum.insert(0,add);
            carry = (s-add)/10;
            i = i-2;
            j = j-2;
        }
        if(carry>0) sum.insert(0,carry);
        return sum.toString();
    }