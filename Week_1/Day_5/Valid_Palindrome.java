class Solution {
    public boolean isPalindrome(String s) {
        char[] ch=s.toCharArray();
        StringBuilder ans=new StringBuilder();
        for(char ele:ch){
            if(ele>='a'&&ele<='z'||ele>='A'&&ele<='Z'||ele>='0'&&ele<='9'){
                ans.append(Character.toLowerCase(ele));
            }
        }
        String normal=ans.toString();
        String rev=ans.reverse().toString();
        return (normal.equals(rev));
    }
}