class Solution {
    public boolean isValidSudoku(char[][] mat) {
        for(int i=0;i<=6;i+=3) {
            for(int j=0;j<=6;j+=3) {
                if(!checkBox(mat,i,j)) return false;
            }
        }
        return checkRow(mat) && checkCol(mat);
    }
    public boolean checkRow(char[][] mat) {
        for(int i=0;i<mat.length;i++) {
            int[] arr=new int[9];
            for(int j=0;j<mat.length;j++) {
                if(!Character.isDigit(mat[i][j]))continue;
                int n=mat[i][j]-'0'-1;
                arr[n]++; 
                if(arr[n]>1) return false;
            }
        }
        return true;
    }
    public boolean checkCol(char[][] mat) {
        for(int i=0;i<mat.length;i++) {
            int[] arr=new int[9];
            for(int j=0;j<mat.length;j++) {
                if(!Character.isDigit(mat[j][i]))continue;
                int n=mat[j][i]-'0'-1;
                arr[n]++;
                if(arr[n]>1) return false;
            }
        }
        return true;
    }
    public boolean checkBox(char[][] mat,int row,int col) {
        int[] arr=new int[9];
        for(int i=row;i<=row+2;i++) {
            for(int j=col;j<=col+2;j++) {
                if(!Character.isDigit(mat[i][j]))continue;
                int n=mat[i][j]-'0'-1;
                arr[n]++; 
                if(arr[n]>1) return false;
            }
        }
        return true;
    }
    
}
