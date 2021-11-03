import java.util.*;
import java.util.stream.Collectors;

public class SumOfArray {

	public static void main(String[] args) {


		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
		int[] arr = {1,2,3,4,5};
		
		
		int num = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.summingInt(Integer::intValue)));
         System.out.println(num);
         
         Arrays.stream(arr).boxed().filter(i->i%2==0).forEach(i -> System.out.println(i));
         
         System.out.println(Arrays.stream(arr).anyMatch(x->x == 8));
         
         int[] arr1 = {1,2,3,4,4,6,7,8,2,3,4};
        System.out.println(Arrays.stream(arr1).boxed().filter(i->i==4).count());
	}

}
