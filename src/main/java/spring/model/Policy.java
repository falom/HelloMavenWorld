package spring.model;

import java.sql.Timestamp;
import java.util.Date;

public class Policy {
	  private int policyId;
	  private String quotationNumber;
	  private String policyNumber;
	  private int statusId;
	  private int agentCode;
	  private String product;
	  private Timestamp effectiveDatetime;
	  private Timestamp expiryDatetime;
	  private Date quotationCreateDate;
	  private Date proposalDate;
	  private Date applicationReceivedDate;
	  private int branchId;
	  private int policyHolderId;
	  private int insuredPersonId;
	  private int driverId;
	  private int vehicalId;
	  private int companyId;
	  private Timestamp updatedDateTime;
	  private int updatedBy;

	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public int getPolicyId() {
		return policyId;
	}

	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}

	public String getQuotationNumber() {
		return quotationNumber;
	}

	public void setQuotationNumber(String quotationNumber) {
		this.quotationNumber = quotationNumber;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getAgentCode() {
		return agentCode;
	}

	public void setAgentCode(int agentCode) {
		this.agentCode = agentCode;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Timestamp getEffectiveDatetime() {
		return effectiveDatetime;
	}

	public void setEffectiveDatetime(Timestamp effectiveDatetime) {
		this.effectiveDatetime = effectiveDatetime;
	}

	public Timestamp getExpiryDatetime() {
		return expiryDatetime;
	}

	public void setExpiryDatetime(Timestamp expiryDatetime) {
		this.expiryDatetime = expiryDatetime;
	}

	public Date getQuotationCreateDate() {
		return quotationCreateDate;
	}

	public void setQuotationCreateDate(Date quotationCreateDate) {
		this.quotationCreateDate = quotationCreateDate;
	}

	public Date getProposalDate() {
		return proposalDate;
	}

	public void setProposalDate(Date proposalDate) {
		this.proposalDate = proposalDate;
	}

	public Date getApplicationReceivedDate() {
		return applicationReceivedDate;
	}

	public void setApplicationReceivedDate(Date applicationReceivedDate) {
		this.applicationReceivedDate = applicationReceivedDate;
	}

	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public int getPolicyHolderId() {
		return policyHolderId;
	}

	public void setPolicyHolderId(int policyHolderId) {
		this.policyHolderId = policyHolderId;
	}

	public int getInsuredPersonId() {
		return insuredPersonId;
	}

	public void setInsuredPersonId(int insuredPersonId) {
		this.insuredPersonId = insuredPersonId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public int getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public Timestamp getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(Timestamp updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public int getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(int updatedBy) {
		this.updatedBy = updatedBy;
	}

}
