import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CustomerInterfaceTest {
	static CustomerInterface customerRepository =null;

	@Test
	void testGetCustomerByApplicationId(String applicationId);() {
		Customer customer = customerRepository.getCustomerByApplicationId("NJOMKqop");
		assertEquals(expected,actual);
		fail("Not yet implemented");
	}
	
	@Test
	void testGetCustomerByCustomerId(String customerId);(){
		Customer customer = customerRepository.getCustomerByCustomerId("CLNOB6902L");
		assertEquals("CLNOB6902L",customer.getCustomerId());
		assertEquals("",customer.getName());
		assertEquals("",customer.getAddress());
		assertEquals("",customer.getContactDetails());
		assertEquals("",customer.getEmail());
		
		fail("Not yet implemented");
	}
	
	@Test
	void testNewCustomer() {
		fail("Not yet implemented");
	}


}
