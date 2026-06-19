class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        Deque<Integer> q = new LinkedList<>();

        int[] res = new int[nums.length-k+1];

        int idx = 0;

        for(int i=0;i<nums.length;i++){

            while(!q.isEmpty() && q.peekLast() < nums[i]){ // remove smaller one

                q.removeLast();
            }

            q.add(nums[i]);

            
            if(i >= k-1){ // WIndow complete

                res[idx++] = q.peek();

                
                if(q.peek() == nums[i-k+1]){ 
                    q.remove();
                }
            }
        }

        return res;
    }
}