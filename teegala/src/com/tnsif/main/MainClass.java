package com.tnsif.main;

import com.tnsif.application.GSNormalAcc;
import com.tnsif.application.GSPrimeAcc;

public class MainClass {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(10,"pallavi",30,true);
		GSNormalAcc gsnormal = new GSNormalAcc(102,"akhi",40,22.9f);

		gsprime.bookProduct(44.3f);
		gsnormal.bookProduct(67.2f);
		
	}

}
