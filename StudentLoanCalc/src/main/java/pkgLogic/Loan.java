package pkgLogic;

import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class Loan {

	private LocalDate startDate;
	private double LoanAmount;
	private double LoanBalanceEnd;
	private double InterestRate;
	private double AdditionalPayment;
	private int LoanPaymentcnt;
	private boolean bCompoundingOption;
	
	private ArrayList<Payment> loanPayments= new ArrayList<payment>();
	
	public Loan(LocalDate startDate,
			double loanAmount,
			double loanBalance,
			double interestRate,
			double additional payment,
			int loanPaymentcnt,
			boolean bcompoundingOption)
		super();
		this.startDate=startdate;
		LoanAmount=loanAmount;
		InterestRate=intrestRate;
		AdditionalPayment=additonalPayment;
		LoanPaymentCnt=loanPaymentcnt;
		bCompundingOption=false;
		LoanBalanceEnd=0;
		
		double Remaningbalance=LoanAmount;
		int PaymentCnt=1;
		
		while (RemaningBalance >= this.GetPMT())
		{
			Payment _pmt = new Payment(RemainingBalance,
					PaymentCnt++,
					startDate.plusMonths(1),
					this);
			RemainingBalance = payment.getEndingBalance();
			loanPayments.add(payment);
		}
		
	}
}
public double getAdditionalPayment() {
	return AdditionalPayment;
	
	}

public int getLoanPaymentCnt() {
	return LoanPaymentCnt;
	
	}
public boolean bCompundingOptions() {
	return bCompundingOption;
	
	}

public double GetPMT()
	{
	PMT = Math.abs(FinanceLib.pmt(this.getInterestRate()/12, this.loanPaymentcnt,this.loanAmount ,this.LoanBalanceEnd,this.bCompundingOption));
	}


}
public double GetTotoalPayments()
{
	loanpayments.stream().flapMapToDouble(mapper)
}