class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        
        for(String x : arr) {
            int a=x.charAt(x.length()-1)-'0';
            ans[a-1]=x.substring(0,x.length()-1);
        }
        String str=String.join(",",ans);
        str=str.replaceAll(","," ");
        return str;
    }
}
