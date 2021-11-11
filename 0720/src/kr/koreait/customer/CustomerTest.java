package kr.koreait.customer;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("홍길동");
		customerLee.setBonusPoint(1000);
		System.out.println(customerLee.showCustomerInfo());
		
//		customerLee.calcPrice(35000);
		System.out.println(customerLee.calcPrice(35000) + " 구매시 적립 포인트는 " + customerLee.calcBonus(35000) + "점 입니다.");
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("================================");
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setBonusPoint(3000);		
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.calcPrice(35000) + " 구매시 실 구매금은 " + customerKim.calcVIPbonus(35000) + "원이고 적립 포인트는 " + customerKim.calcBonus(35000) + "점 입니다.");
		System.out.println(customerKim.showCustomerInfo());
	}

	


}

