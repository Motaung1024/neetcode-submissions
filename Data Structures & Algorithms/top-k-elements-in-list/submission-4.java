class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] result = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)    {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (Map.Entry<Integer, Integer> entry : map.entrySet())    {

            pq.offer(entry.getKey());

            if (pq.size() > k)  {
                pq.poll();
            }
        }

        System.out.println(pq);

        for (int i = 0; i < result.length; i++) {
            result[i] = pq.poll();
        }

        return result;

    }
}
