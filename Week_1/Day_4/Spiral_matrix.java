class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int rs=0;
        int re=nums.length-1;
        int cs=0;
        int ce=nums[0].length-1;
        List<Integer> ans=new ArrayList<>();
        while(rs<=re && cs<=ce){
            // left -> right
            for(int i=cs;i<=ce;i++){
                ans.add(nums[rs][i]);
            }rs++;
            if(cs>ce || rs>re) break;
            // top -> bottom
            for(int j=rs;j<=re;j++){
                ans.add(nums[j][ce]);
            }ce--;
            if(cs>ce || rs>re) break;
            // right -> left
            for(int i=ce;i>=cs;i--){
                ans.add(nums[re][i]);
            }re--;
            if(cs>ce || rs>re) break;
            // bottom -> top
            for(int j=re;j>=rs;j--){
                ans.add(nums[j][cs]);
            }cs++;
        }
        return ans;
    }
}
