//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for(int t=0;t<testCases;t++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    ArrayList<Integer> A = new ArrayList<Integer>();
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		        A.add(arr[i]);
		        
		    }
		   
		   
		    
		    ArrayList <ArrayList<Integer>> res = new Solution().subsets(A);
		    for (int i = 0; i < res.size (); i++)
		    {
		        for (int j = 0; j < res.get(i).size (); j++)
		        {
		          System.out.print(res.get(i).get(j)+" ");
		        }
		        System.out.println();
		      
		    }
		    //System.out.println();
		}
	}
}
// } Driver Code Ends




//User function Template for Java
class comp implements Comparator<ArrayList<Integer>>{
    public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
        int n=Math.min(a.size(),b.size());
        for(int i=0;i<n;i++){
            if(a.get(i)!=b.get(i)){
                return a.get(i)-b.get(i);
            }
        }
        return a.size()-b.size();
    }
}
class Solution
{
    static void Subsets(ArrayList<Integer> nums,int i,ArrayList<Integer> cur,ArrayList<ArrayList<Integer>> ans)    
    {
        if(i==nums.size()) {ans.add(new ArrayList<>(cur));return;}
        cur.add(nums.get(i));
        Subsets(nums,i+1,cur,ans);
        cur.remove(cur.size()-1);
        Subsets(nums,i+1,cur,ans);
    }
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A)
    {
        //code here
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> cur=new ArrayList<Integer>();
        Subsets(A,0,cur,ans);
        Collections.sort(ans, new comp());
        return ans;
        
    }
}