class StoneWeight {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i : stones) {
            maxHeap.offer(i);
        }

        while (maxHeap.size() != 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            maxHeap.offer(Math.abs(stone1 - stone2));
        }
        
        return maxHeap.poll();
    }
}
