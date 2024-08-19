class Solution {
    static String longestPalindrome(String str) {

		String max="";

		for(int i=0;i<str.length();i++) {

			for(int j=str.length()-1;j>=i;j--) {

				if(str.charAt(i)==str.charAt(j)) {

				   if(palin(str.substring(i,j+1))) {

				     max=max.length()<str.substring(i, j+1).length()? str.substring(i, j+1):max;  
                    break;
				}

				}

			}

		}

		return max;

	}

	static boolean palin(String str) {

		int i=0,j=str.length()-1,c=0;

		while(i<j) {

			if(str.charAt(i)==str.charAt(j)) {

				c++;i++;j--;

			}

			else 

				return false;

		}

		
		return true;

	}
}