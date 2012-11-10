package ie.cit.teamphoenix.DAO;

import java.util.GregorianCalendar;
import java.util.List;

import ie.cit.teamphoenix.Family;
import ie.cit.teamphoenix.RefundRequest;

public interface RefundRequestDAO {

	void addRefundRequest(RefundRequest refundRequest);
	
	void updateRefundRequest(RefundRequest refundRequest);
	
	void deleteRefundRequest(RefundRequest refundRequest);
	
	RefundRequest findRefundRequestbyRefundId(int refundId);
	
	RefundRequest findRefundRequestbyRefundReqeustDate(GregorianCalendar refundRequestDate);
	
	RefundRequest findRefundRequestbyDecisionDate(GregorianCalendar refundRequestDate);
	
	RefundRequest findRefundRequestbyDispenseDate(GregorianCalendar refundRequestDate);
	
	List<RefundRequest> findRefundRequestbyFamilyId(int familyId);
	
	List<RefundRequest> findRefundRequestbyPharmacyId(int pharmacyId);
	
	List<RefundRequest> findRefundRequestbyStaffId(int staffId);
	
}
