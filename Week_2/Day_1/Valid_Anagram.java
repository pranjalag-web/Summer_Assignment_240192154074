class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        char[] sh = s.toCharArray();
        char[] th = t.toCharArray();
        for(int i=0;i<sh.length;i++){
            if(map.containsKey(sh[i])){
                map.put(sh[i],map.get(sh[i])+1);
            }
            else{
                map.put(sh[i],1);
            }
        }
        for(int i=0;i<th.length;i++){
            if(!map.containsKey(th[i])) return false;
            map.put(th[i],map.get(th[i])-1);
            if(map.get(th[i])==0){
                map.remove(th[i]);
            }
        }
        return map.isEmpty();
    }
}