package home_work_1;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(array));
    }
    public static String createPhoneNumber(int[] nums) {
        if (nums.length != 10) {
            return "Неверное количество символов";
        } else {
            for (int num : nums) {
                if (num < 0 || num >= 10) {
                    return "Одно из чисел массива больше 10. Неверный формат";
                }
            }

            return String.format("(%d%d%d) %d%d%d-%d%d%d%d",nums[0],nums[1], nums[2],nums[3],nums[4],nums[5],nums[6],nums[7],nums[8],nums[9]);
        }
    }
}
