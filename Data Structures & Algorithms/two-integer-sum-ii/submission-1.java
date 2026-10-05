class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j;
        for(int i = 0; i < numbers.length; i++){
            j = Arrays.binarySearch(numbers, i+1, numbers.length, target-numbers[i]); //Since there is always one solution, we dont have to check whether the number surpassed the result
            if(j >= 0){
                return new int[] {i + 1,j + 1}; //Return normalized index
            }
        }
        return new int[] {-1,-1};
    }
}
