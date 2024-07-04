package home_work_1;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(array));
    }
    public static String createPhoneNumber(int[] nums) {
        StringBuilder phoneNumber = new StringBuilder("(");
        for (int i = 0; i < nums.length; i++) {
            if (i == 2) {
                phoneNumber.append(nums[i]).append(") ");
            } else if (i == 5) {
                phoneNumber.append(nums[i]).append("-");
            }
            else {
                phoneNumber.append(nums[i]);
            }
        }
        return phoneNumber.toString();
    }
}
