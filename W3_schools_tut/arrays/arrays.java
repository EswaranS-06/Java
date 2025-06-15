package arrays;

public class arrays {
    public static void main(String[] args) {
        String str = "123456";
        System.out.println(str.length()+" \n");
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        for(int i : nums){
            System.out.println(i+"\n");
        }

        System.out.println(nums.length);

        //you can change a particalur value by using the index

        System.out.println(nums[0]);
        System.out.println(nums[-1]);
        System.out.println(nums[-2]);
        nums[-1] = 200;
        System.out.println(nums[-1]);
        System.out.println(nums[nums.length - 1]);
        System.out.println(nums[20]); 
    }
}
