import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findKthLargestTest1(){
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        int expected= 5;
        int actual = new Solution().findKthLargest(nums, k);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findKthLargestTest2(){
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;
        int expected= 4;
        int actual = new Solution().findKthLargest(nums, k);

        Assert.assertEquals(expected, actual);
    }
}
