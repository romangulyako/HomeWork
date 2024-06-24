package home_work_1;

public class PhoneNumberFormat {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(createPhoneNumber(array));
    }
    public static String createPhoneNumber(int[] nums) {
        String phoneNumber = "(";
        for (int i = 0; i < nums.length; i++) {
            if (i == 2) {
                phoneNumber += (nums[i] + ") ");
            } else if (i == 5) {
                phoneNumber += (nums[i] + "-");
            }
            else {
                phoneNumber += nums[i];
            }
        }
        return phoneNumber;
    }
}
