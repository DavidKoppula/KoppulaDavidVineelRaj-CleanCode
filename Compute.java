class Compute {
	double principal, rate_of_interest, timePeriod;
	
	Compute(double principal, double rate_of_interest, double timePeriod){
		this.principal = principal;
		this.rate_of_interest = rate_of_interest;
		this.timePeriod = timePeriod;
	}
	
	double calculateCompoundInterest() {
		return (principal * (Math.pow(1 + rate_of_interest / 100, timePeriod)));
	}

	double CalculateSimpleInterest() {
		return (principal * rate_of_interest * timePeriod) / 100;
	}

}
