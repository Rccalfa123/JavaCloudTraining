package in.com.capgemini.test;

public class Parked_CarOwner_Details {

	public static int checkingObject = -1;
	
	private String ownerName;
	private String carModel;
	private String carNO;
	private long ownerMobileNo;
	private String owerAddress;
	
	
	public Parked_CarOwner_Details(String ownerName, String carModel, String carNO, long ownerMobileNo,
			String owerAddress) {
		super();
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNO = carNO;
		this.ownerMobileNo = ownerMobileNo;
		this.owerAddress = owerAddress;
	}
	
	@Override
	public String toString() {
		return "Parked_CarOwner_Details [ownerName=" + ownerName + ", carModel=" + carModel + ", carNO=" + carNO
				+ ", ownerMobileNo=" + ownerMobileNo + ", owerAddress=" + owerAddress + "]";
	}
	
	protected String getOwnerName() {
		return ownerName;
	}
	protected void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	protected String getCarModel() {
		return carModel;
	}
	protected void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	protected String getCarNO() {
		return carNO;
	}
	protected void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	protected long getOwnerMobileNo() {
		return ownerMobileNo;
	}
	protected void setOwnerMobileNo(long ownerMobileNo) {
		this.ownerMobileNo = ownerMobileNo;
	}
	protected String getOwerAddress() {
		return owerAddress;
	}
	protected void setOwerAddress(String owerAddress) {
		this.owerAddress = owerAddress;
	}
	
	 
}
