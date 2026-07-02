    import java.util.HashMap;
    public class debug{
        public static void main(String[] args) {
            int[] nums  = new int[10];
            int val = 0;
              int k = 0;
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] == val ){
                // nums[i] = nums [i+1];
                k++;
            }
        }
        int sol = 2%3;
        System.out.println(sol);
        int n = 19 ;
        int sum  = (n%10)*(n%10);
        System.out.println(sum);

        int[] array = new int[] {5,6,5,9,7};
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            map.put(array[i], i);
        }
        System.out.println(map);
        }
    }