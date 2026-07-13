class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        
        // Handle special cases separately... //

        boolean one = false;
        boolean more = false;

        for (int num : nums)    {
            if (num == 0)   {

                if (one == false)   {
                    one = true;
                }

                else if (one == true)    {
                    more = true;
                }
            }
        }

        System.out.println(one + " " + more);

        // If there is only one zero in the array
        if (one == true && more == false)   {

            int prod = 1;

            for (int i = 0; i < result.length; i++) {

                if (nums[i] != 0)   {
                    prod *= nums[i];
                }
            }

            for (int i = 0; i < result.length; i++)   {
                if (nums[i] != 0)   {
                    result[i] = 0;
                }

                else    {
                    result[i] = prod;
                }
            }

            System.out.println("Case 1:");

            return result;
        }

        // If there are more than one zeros

        else if (more == true)   {

            for (int i = 0; i < result.length; i++) {
                result[i] = 0;
            }

            System.out.println("Case 2:");

            return result;
        }

        // If there are no zeros at all

        else    {
            int prod = 1;

            for (int num : nums)    {
                prod *= num;
            }

            for (int i = 0; i < result.length; i++) {
                result[i] = prod / nums[i];
            }

            System.out.println("Case 3:");

            return result;
        }
    }
}  
