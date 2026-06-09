class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        char[] sh = ransomNote.toCharArray();
        char[] th = magazine.toCharArray();
        for(int i=0;i<th.length;i++){
            if(map.containsKey(th[i])){
                map.put(th[i],map.get(th[i])+1);
            }
            else{
                map.put(th[i],1);
            }
        }
        for(int i=0;i<sh.length;i++){
            if(!map.containsKey(sh[i])) return false;
            map.put(sh[i],map.get(sh[i])-1);
            if(map.get(sh[i])==0){
                map.remove(sh[i]);
            }
        }
        return true;
    }
}