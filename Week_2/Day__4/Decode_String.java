  class Solution {
    private int index = 0;

    public String decodeString(String s) {
        return decode(s);
    }

    private String decode(String s){
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(index<s.length()){
            char c=s.charAt(index);
            if(Character.isDigit(c)){
                num =num*10+(c-'0');
                index++;
            }
            else if(c=='['){
                index++;
                String inner=decode(s);
                for(int i=0;i<num;i++){
                    sb.append(inner);
                }
                num=0;
            }
            else if(c==']'){
                index++;
                return sb.toString();
            }
            else{
                sb.append(c);
                index++;
            }
        }
        return sb.toString();
    }
}
