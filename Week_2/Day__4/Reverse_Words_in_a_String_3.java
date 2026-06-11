
class Solution {
    private String reverse(int index,String[] st,StringBuilder sb){
        if(st.length<=index){
            return sb.toString();
        }
        char[] ch=st[index].toCharArray();
        String t="";
        for(int i=0;i<ch.length/2;i++){
            char temp=ch[i];
            ch[i]=ch[ch.length-i-1];
            ch[ch.length-i-1]=temp;
        }
        sb.append(new String(ch));

        if(index<st.length-1){
            sb.append(" ");
        }
        return reverse(index+1,st,sb);
    }
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        String[] st=s.split(" ");
        return reverse(0,st,sb);
    }
}