import java.util.HashSet;
import java.util.Set;

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
        Set<Integer> set = new HashSet<>(k);
    
         for(int i = 0; i < k; i++) {
            set.add(nums[i]);
         }
         for(int i = 0; i < k; i++) {
          
            if (set.contains(nums[i])){
                
                value = true;
                break;
            }
         }
        value = false;
        return value;
    
}
}
