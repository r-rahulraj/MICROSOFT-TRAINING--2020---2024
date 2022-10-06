class Solution {
    public int minDistance(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        
        int[][] mat=new int[l1+1][l2+1];
        
        for(int i=0;i<l1+1;i++) {
            for(int j=0;j<l2+1;j++) {
                if(i==0 || j==0) {
                    if(i==0) mat[i][j]=j;
                    else mat[i][j]=i;
                }
                else if(word1.charAt(i-1)==word2.charAt(j-1)) mat[i][j]=mat[i-1][j-1];
                else {
                    mat[i][j]=1+Math.min(Math.min(mat[i][j-1],mat[i-1][j]),mat[i-1][j-1]);
                }
            }
        }
        return mat[l1][l2];
    }
}
