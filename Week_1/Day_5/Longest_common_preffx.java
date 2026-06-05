class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        String s=strs[0];
        for(int i=1;i<n;i++){
            while(strs[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
                if(s.equals("")) return "";
            }
        }
        return s;
    }
}
