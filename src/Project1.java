import java.rmi.activation.ActivationGroupID;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Project1 {
	
	public static void main(String args[])
	{
		
		Employee e1 = new Employee(1,"Abhi","CSC","yes", 2000);
		Employee e2 = new Employee(2,"Mahi","CSC","yes", 5000);
		Employee e3 = new Employee(3,"Sahi","IT","no", 1000);
		Employee e4 = new Employee(4,"Kabi","CSC","yes", 4000);
		
		List<Employee> emplist = new ArrayList<>();
		emplist.add(e1);
		emplist.add(e2);
		emplist.add(e3);
		emplist.add(e4);
		
		Map<String,List<Employee>> deptList = emplist.stream().collect(Collectors.groupingBy(Employee::getDept));
		deptList.forEach((k,v) -> System.out.println(k + " : " + v));
		
		Map<String,Long> deptList1 = emplist.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		deptList1.forEach((k,v) -> System.out.println(k + " : " + v));
		
		Map<String,Optional<Employee>> deptList2 = emplist.stream().collect(Collectors.
				groupingBy(Employee::getDept,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		
		deptList2.forEach((k,v) -> System.out.println(k + " : " + v));
       
//		deptList.forEach((k,v) ->{
//			
//			List<Employee> list = v;
//			
//			Employee maxSal = list.stream().max(Comparator.comparing(Employee::getSalary)).get();
//			
//			
//			System.out.println(maxSal.getSalary());
//		});
       
		long activeCount = emplist.stream().filter(e -> "yes".equals(e.getStatus())).count();
		System.out.println(activeCount); 
		
		Employee maxs = emplist.stream().max(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(maxs.getSalary());
		Employee mins = emplist.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(mins.getSalary());
		
	}

}
