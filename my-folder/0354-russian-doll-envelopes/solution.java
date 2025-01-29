class Solution {
    private int customBinarySearch(List<Integer> list, int target) {
        int l = 0;
        int r = list.size() - 1;
        int ans = list.size();

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (list.get(mid) >= target) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    public int lengthOfLIS(int[] nums) {
        List<Integer> tails = new ArrayList<>();
        int ans = 0;
        for (int num : nums) {
            if (tails.isEmpty() || num > tails.get(tails.size() - 1)) {
                tails.add(num);
                ans++;
            } else {
                int idx = customBinarySearch(tails, num);
                tails.set(idx, num);
            }
        }
        return ans;
    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return b[1] - a[1];
        });
        //int[] dp = new int[envelopes.length + 1];
        //Arrays.fill(dp, 1);
        int[] arr = new int[envelopes.length];
        
        /* for(int i=0;i<envelopes.length;i++)
          {
          System.out.print("["+envelopes[i][0]+","+envelopes[i][1]+"] ");
          }
          System.out.println();
        */
         
        for (int i = 0; i < envelopes.length; i++) {
            arr[i] = envelopes[i][1];
        }
        return lengthOfLIS(arr);
    }
}
