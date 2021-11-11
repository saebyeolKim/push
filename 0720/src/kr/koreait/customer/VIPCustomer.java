package kr.koreait.customer;

// 	우수 고객 클래스
//	이미 Customer 클래스에 구현된 내용이 중복되므로  Customer 클래스를 상속(확장)받아 만든다.
public class VIPCustomer extends Customer{

//	담당 전문 상담원이 배정된다.
	private int agentID;			// 전문 상담원 ID
//	제품을 살 때 10%를 할인해주고 보너스 포인스틑 5%를 적립한다.
	private double salesRatio;		// 추가 할인 비율
	
	public VIPCustomer() {
//		customerGrade = "VIP";
		setCustomerGrade("VIP");
		setBonusRatio(0.05);
		salesRatio = 0.1;
		
	}
	
	public int getAgentID() {
		return agentID;
	}
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	public double getSalesRatio() {
		return salesRatio;
	}
	public void setSalesRatio(double salesRatio) {
		this.salesRatio = salesRatio;
	}
	
	public int calcVIPbonus(int price) {
		price -= (price * salesRatio);
		return price  ;
	}
	
}
