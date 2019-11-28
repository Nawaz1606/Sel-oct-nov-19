package com.auto.tcs.order;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CanceledOrderTests {
	
	
	@Test(groups = {"functional","smoke"})
	@Parameters({"orderId"})
	public void canceledOrder(@Optional("4578") int orderId) {
		System.err.println("Orderid: " +orderId+ " now has been canceled");
	}
	
	
	@Test(groups = {"smoke"})
	@Parameters({"orderId2","itemNumber"})
	public void reOpenOrder(int orderId, int itemNumber) {
		System.err.println("Item number: "+itemNumber+" for Orderid: " +orderId+ " now has been re opened");
	}
	
	@Test
	public void canceledOrder3() {

	}
}
