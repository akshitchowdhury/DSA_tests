import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {

        int[] store = new int[2];

         Arrays.sort(nums);

         int first =0;
         int last = nums.length-1;

//         while(first<last){
//
//             if(nums[first]+nums[last]==target){
//
//                 store[0] = first;
//                 store[1] = last;
//             }
//             else{
//                 first++;
//                 last--;
//             }
//
//         }

        for(int i=first; i< nums.length; i++)public int[] twoSum(int[] nums, int target) {

            int[] store = new int[2];

            //  Arrays.sort(nums);

            int first =0;
            int last = nums.length-1;

            for(int i=first; i< nums.length-1; i++){

                for(int j= 1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target && i!= j){

                        store[0] = i;
                        store[1] = j;
                        break;

                    }
                }

            }


            return store;
        }


        return store;
    }
}
