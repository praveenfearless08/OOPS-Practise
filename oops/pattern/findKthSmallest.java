package pattern;

import java.util.PriorityQueue;

class findKthSmallest{
     public static int findKthSmallest(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            throw new IllegalArgumentException("Invalid value of k.");
        }

        // Create a Max Heap (PriorityQueue) of size k
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b - a);

        // Insert the first k elements into the Max Heap
        for (int i = 0; i < k; i++) {
            maxHeap.offer(arr[i]);
        }

        // Compare remaining elements with the root (maximum element) of the Max Heap
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
        }

        // The root of the Max Heap is the kth smallest element
        return maxHeap.peek();
    }
      public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 3, 20, 15 };
        int k = 3;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element is: " + kthSmallest);
    }
}