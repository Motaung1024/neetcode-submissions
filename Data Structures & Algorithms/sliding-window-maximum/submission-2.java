class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        List<Integer> temp = new ArrayList<>();
        int[] result = new int[nums.length - k + 1];

        // Use a priorityqueue to keep track of the maximun
        // Evict the element at the l pointer before moving
        // Add the next element in the window
        // Find the maximum

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int l = 0, r = 0;
        int index = 0;

        while (r < nums.length) {

            if (r < k)  {
                pq.add(nums[r]);
                System.out.println("Added val: " + nums[r]);
                r++;
            }

            else    {
                result[index++] = pq.peek();
                pq.remove(nums[l]);
                pq.add(nums[r]);
                r++;
                l++;
            }
        }

        result[result.length - 1] = pq.peek();

        return result;
        
    }
}
