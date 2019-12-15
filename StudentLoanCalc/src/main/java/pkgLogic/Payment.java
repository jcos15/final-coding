package pkgLogic;

public class Payment {
	private int PaymentNbr;
	private LocalDate dueDate;
	private double Payment;
	private double AdditionalPayment;
	private double InterestPayment;
	private double Principle;
	private double EndingBalance;
	
	
	public Payment(double beginningBalance,int PaymentNbr,localDate dueDate,Loan loan)
	{
		this.paymentNbr=paymentnbr;
		this.dueDate=dueDate;
		this.AdditionalPayment=loan.GetPMT;
		this.AdditionalPayment= loan.getAdditionalPayment();
		
		InterestPayment=
				beginningBalance*(loan.getIntrestRate()/12);
		Principle=loan.getPMT()+loan.getAdditionalPayment()-InterestPayment;
		
		EndingBalance= beginningBalance- Principle;
		
		
		
	}
	
	
}
	