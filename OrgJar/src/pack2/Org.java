package pack2;

public class Org {

	private String OrgName;
	private int OrdId;
	
	
	public Org(String orgName, int ordId) {
		super();
		OrgName = orgName;
		OrdId = ordId;
	}


	@Override
	public String toString() {
		return "Org [OrgName=" + OrgName + ", OrdId=" + OrdId + "]";
	}
	
	

}
