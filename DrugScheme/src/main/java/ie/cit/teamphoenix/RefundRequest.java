package ie.cit.teamphoenix;

import java.util.GregorianCalendar;

public class RefundRequest {

	int refundId;
	int familyId;
	int pharmacyId;
	double itemCost;
	GregorianCalendar dispenseDate;
	boolean itemReceived;
	GregorianCalendar refundRequestDate;
	int staffId;
	boolean refundValidated;
	GregorianCalendar decisionDate;
	
	public RefundRequest(){
		
	}
	
	
	public RefundRequest(int refundId, int familyId, int pharmacyId,
			double itemCost, GregorianCalendar dispenseDate,
			boolean itemReceived, GregorianCalendar refundRequestDate,
			int staffId, boolean refundValidated, GregorianCalendar decisionDate) {
		super();
		this.refundId = refundId;
		this.familyId = familyId;
		this.pharmacyId = pharmacyId;
		this.itemCost = itemCost;
		this.dispenseDate = dispenseDate;
		this.itemReceived = itemReceived;
		this.refundRequestDate = refundRequestDate;
		this.staffId = staffId;
		this.refundValidated = refundValidated;
		this.decisionDate = decisionDate;
	}


	public int getRefundId() {
		return refundId;
	}


	public void setRefundId(int refundId) {
		this.refundId = refundId;
	}


	public int getFamilyId() {
		return familyId;
	}


	public void setFamilyId(int familyId) {
		this.familyId = familyId;
	}


	public int getPharmacyId() {
		return pharmacyId;
	}


	public void setPharmacyId(int pharmacyId) {
		this.pharmacyId = pharmacyId;
	}


	public double getItemCost() {
		return itemCost;
	}


	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}


	public GregorianCalendar getDispenseDate() {
		return dispenseDate;
	}


	public void setDispenseDate(GregorianCalendar dispenseDate) {
		this.dispenseDate = dispenseDate;
	}


	public boolean isItemReceived() {
		return itemReceived;
	}


	public void setItemReceived(boolean itemReceived) {
		this.itemReceived = itemReceived;
	}


	public GregorianCalendar getRefundRequestDate() {
		return refundRequestDate;
	}


	public void setRefundRequestDate(GregorianCalendar refundRequestDate) {
		this.refundRequestDate = refundRequestDate;
	}


	public int getStaffId() {
		return staffId;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public boolean isRefundValidated() {
		return refundValidated;
	}


	public void setRefundValidated(boolean refundValidated) {
		this.refundValidated = refundValidated;
	}


	public GregorianCalendar getDecisionDate() {
		return decisionDate;
	}


	public void setDecisionDate(GregorianCalendar decisionDate) {
		this.decisionDate = decisionDate;
	}


	@Override
	public String toString() {
		return "RefundRequest [refundId=" + refundId + ", familyId=" + familyId
				+ ", pharmacyId=" + pharmacyId + ", itemCost=" + itemCost
				+ ", dispenseDate=" + dispenseDate + ", itemReceived="
				+ itemReceived + ", refundRequestDate=" + refundRequestDate
				+ ", staffId=" + staffId + ", refundValidated="
				+ refundValidated + ", decisionDate=" + decisionDate + "]";
	}
	
	
	
	
}
