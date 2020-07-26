public class Interest {

	static {
		Scanner sc = new Scanner(System.in);
		
		System.out.format("%s", "Enter principle amount");
		double principal = sc.nextDouble();
		System.out.format("%s", "Enter rate of interest");
		double rate_of_interest = sc.nextDouble();
		System.out.format("%s", "Enter number of years");
		double timePeriod = sc.nextDouble();
		
		Compute com = new Compute(principal, rate_of_interest, timePeriod);
		
		System.out.format("%s",
				"1)Select This option for Calculating Simple Interest 2)Select This option for Calculating Compound Interest");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			logger.info(String.valueOf(com.CalculateSimpleInterest()));
			break;
		case 2:
			logger.info(String.valueOf(com.calculateCompoundInterest()));
			break;

		}
		sc.close();
	}

	public static void main(String[] args) {

	}

}
