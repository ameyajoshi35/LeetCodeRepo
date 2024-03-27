class Solution {
    public int[] twoSum(int[] nums, int target) {

        int left=0, right = nums.length-1;

        int[] oldNums = new int[nums.length];
        int index = 0;
        for(int num: nums){
             oldNums[index++] = num;
        }
        // Arrays.stream(oldNums).forEach(System.out::print);

        Arrays.sort(nums);
        // Arrays.stream(nums).forEach(System.out::print);
        List<Integer> oldNumsList = Arrays.stream(oldNums).boxed().collect(Collectors.toList());
        oldNumsList.stream().forEach(System.out::print);
        while(left < right) {

            int sum = nums[left] + nums[right];

            if(sum > target){
                right--;
            } else if (sum == target) {
                int leftIndex = oldNumsList.indexOf(nums[left]);
                int rightIndex = oldNumsList.indexOf(nums[right]);
                if(nums[left] == nums[right]){
                   rightIndex = oldNumsList.lastIndexOf(nums[right]);
                }
                
                return new int[]{leftIndex,rightIndex};

            } else {
                left++;
            }

        }


        return new int[0];
        
    }
}