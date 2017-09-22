package prob2.solution;

import java.util.List;

public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {

		double total=0.0;
		for (Employee employee:emps) {
			List<Account>accounts=employee.getAccounts();

			for (Account account:accounts) {
				total+=account.getBalance();
			}
		}
		return total;
	}
}
