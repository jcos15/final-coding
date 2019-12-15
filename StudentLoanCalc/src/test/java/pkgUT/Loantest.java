package pkgUT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Loantest {

	@Test
	void TestLoan() {
		LocalDate ld= new LocalDate(2019,12,31);
		Loan l= new Loan(ld,100000.00,0.07,0,240);
	}

}
