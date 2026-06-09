
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int m = p.length();
        List<Integer> res=new ArrayList<>();
        if (n < m)
            return res;

        
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < m; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(freq1, freq2)) {
            res.add(0);
        }
        for (int i = m; i < n; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq1[s.charAt(i - m) - 'a']--;
            if (Arrays.equals(freq1, freq2)) {
                res.add(i-m+1);
            }
        }
        return res;
    }
}