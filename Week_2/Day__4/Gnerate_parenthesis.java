import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void valid(int n,List<String> ans,StringBuilder sb,int o,int c){
        if(sb.length()==2*n){
            ans.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append("(");
            valid(n,ans,sb,o+1,c);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            sb.append(")");
            valid(n,ans,sb,o,c+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        valid(n,ans,sb,0,0);
        return ans;

    }
}