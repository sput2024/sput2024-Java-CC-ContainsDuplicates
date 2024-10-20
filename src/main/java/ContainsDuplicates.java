import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        Boolean value = false;
       
           int k = nums.length;
           Set<Integer> set = new HashSet<Integer>(k);
       
            for(int i = 0; i < k; i++) {
               value = set.add(nums[i]);
              
            }
            int k1 = set.size();
            if (k !=k1) {
                value = true;
                return value;
            }
            if (k==k1) {
                value = false;
                return value;
            }
           return value;
    
}
}
