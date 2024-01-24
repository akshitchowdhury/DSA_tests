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

        for(int i=first; i< nums.length; i++){

            for(int j=last; j>first; j--){
                if(nums[first]+nums[last]==target){

                    store[0] = first;
                    store[1] = last;

                }
            }

        }


        return store;
    }
}
