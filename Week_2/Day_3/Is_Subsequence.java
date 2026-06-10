class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int i=0;
        for(int j=0;i<n && j<t.length();j++ ){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==n;
    }
}