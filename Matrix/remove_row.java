import java.util.*;
class remove_row
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        ArrayList<Integer> al=new ArrayList<>();
        
            
            for(int i=0;i<m;i++)
                {
            if(al.contains(i))
                continue;
                for(int j=i+1;j<m;j++){
                    if(chk_simlarity(matrix[i],matrix[j]))
                    {
                        al.add(j);
                    }
                }
                    
            }
            
            Collections.sort(al);
             
        return al;       
        
    }
    public static boolean chk_simlarity(int a[],int b[]){
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
            return false;
        }
        return true;
    }
}