
public class AccountingApp {

	public static void main(String[] args) {
		
		double VOS = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = VOS * vatRate;
		double total = VOS + vat;
		double expense = VOS * expenseRate;
		double income = VOS - expense;
		double divident1 = income * 0.5;
		double divident2 = income * 0.3;
		double divident3 = income * 0.2;

		System.out.println("Value of supply : " + VOS);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Expense : " + expense);
		System.out.println("Income : " + income);
		System.out.println("Divident 1 : " + divident1);
		System.out.println("Divident 1 : " + divident2);
		System.out.println("Divident 1 : " + divident3);
	}

}
