package arrays;

public class multi_arrays {
    public static void main(String[] args) {
        int[][] nums = {{00,01,02,03},{10,11,12,13}};
        for (int i = 0;i != nums.length;i++)
            for (int j = 0;j != nums[i].length;j++)
        System.out.println(nums[i][j]);
    }
}
