package prob1;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {

		List<Employee> list= new ArrayList<>();

		for (String ssn: socSecNums) {
			if (table.containsKey(ssn)){
				list.add(table.get(ssn));
			}
		}
		Collections.sort(list,new EmployeeSorted());
		return list;
		
	}

	private static class EmployeeSorted implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getSsn().compareTo(o2.getSsn());
		}
	}
	
}
