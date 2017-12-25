package cn.sunline.framework.controller.vo.v4.supplier;



import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import cn.sunline.framework.controller.vo.common.AbstractEntity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * �ʽ����󸴺�����
 */
public class FactorRiskManagementAuditVO extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7008648377787058350L;
	/*���������Ӷ���id*/	
	@JSONField(name="sub_financing_apply_id")
	private Integer subFinancingApplyId;
	/*������ͣ�1-�ʷ���س���2-�ʷ��������*/
	@JSONField(name="audit_type")
	private Integer auditType;
	/*������ҵ*/
	@JSONField(name="financing_enterprise")
	private String financingEnterprise;
	/*�����*/
	@JSONField(name="auditor")
	private String auditor;
	/*������*/
	@JSONField(name="opinion_number")
	private String opinionNumber;
	/*���ʽ��*/
	@JSONField(name="financing_amount")
	private BigDecimal financingAmount;
	/*��������*/
	@JSONField(name="financing_term", format = "yyyy-MM-dd")
	private Integer financingTerm;
	/*�շѷ�ʽ1-��������2-�����*/
	@JSONField(name="fee_mode")
	private Integer feeMode;
	/*��������*/
	@JSONField(name="financing_rate")
	private BigDecimal financingRate;
	/*�����*/
	@JSONField(name="service_fee")
	private BigDecimal serviceFee;
	/*����˵��*/
	@JSONField(name="financing_explain")
	private String financingExplain;
	/*���׽ṹ*/
	@JSONField(name="transaction_structure")
	private String transactionStructure;
	/*���Ŵ�ʩ*/
	@JSONField(name="trust_measure")
	private String trustMeasure;
	/*������*/
	@JSONField(name="audit_opinion")
	private String auditOpinion;
	/*�������*/
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JSONField(name = "audit_date", format = "yyyy-MM-dd")
	private Date auditDate;
	/*��ע*/
	@JSONField(name = "remark")
	private String remark;
	/*��˽����1-ͨ��2-��ͨ��3-����*/
	@JSONField(name = "audit_result")
	private Integer auditResult;
	
	
	
	
	/*����id*/
	@JSONField(name = "attachment_id")
	private Integer attachmentId;
	/*������ע*/
	@JSONField(name = "attachment_remark")
	private Integer attachmentRemark;
	/*����Ҫ�ر���*/
	@JSONField(name = "elements_order_no")
	private String elementsOrderNo;
	/*����Ҫ��������ҵ*/
	@JSONField(name = "elements_financing_enterprise")
	private Integer elementsFinancingEnterprise;
	
	/*����Ҫ���������*/
	@JSONField(name = "elements_give_quota")
	private BigDecimal elementsGiveQuota;
	/*����Ҫ����������*/
	@JSONField(name = "elements_financing_term")
	private Integer elementsFinancingTerm;
	/*����Ҫ���շѷ�ʽ*/
	@JSONField(name = "elements_fee_mode")
	private Integer elementsFeeMode;
	
	/*����Ҫ����������*/
	@JSONField(name = "elements_financing_rate")
	private BigDecimal elementsFinancingRate;
	/*����Ҫ�ط����*/
	@JSONField(name = "elements_service_fee")
	private BigDecimal elementsServiceFee;
	
	/*����Ҫ���ʲ�����*/
	@JSONField(name = "elements_assets_type")
	private Integer elementsAssetsType;
	/*����Ҫ�ػ��ʽ*/
	@JSONField(name = "elements_repayment_mode")
	private Integer elementsRepaymentMode;
	/*����Ҫ�طſ�����*/
	@JSONField(name = "elements_loan_terms")
	private String elementsLoanTerms;
	/*����Ҫ�ر�ע*/
	@JSONField(name = "elements_remark")
	private String elementsRemark;
	/*��������id*/
	@JSONField(name = "financing_apply_id")
	private Integer financingApplyId;
	/*����Ҫ��id*/
	@JSONField(name = "elements_id")
	private Integer elementsId;
	/*����Ҫ������*/
	@JSONField(name = "elements_audit_date")
	private Date elementsAuditDate;
	
	
	
	
	
	
	
	
	public Date getElementsAuditDate() {
		return elementsAuditDate;
	}
	public void setElementsAuditDate(Date elementsAuditDate) {
		this.elementsAuditDate = elementsAuditDate;
	}
	public Integer getAttachmentId() {
		return attachmentId;
	}
	public void setAttachmentId(Integer attachmentId) {
		this.attachmentId = attachmentId;
	}
	public Integer getAttachmentRemark() {
		return attachmentRemark;
	}
	public void setAttachmentRemark(Integer attachmentRemark) {
		this.attachmentRemark = attachmentRemark;
	}
	public String getElementsOrderNo() {
		return elementsOrderNo;
	}
	public void setElementsOrderNo(String elementsOrderNo) {
		this.elementsOrderNo = elementsOrderNo;
	}
	public Integer getElementsFinancingEnterprise() {
		return elementsFinancingEnterprise;
	}
	public void setElementsFinancingEnterprise(Integer elementsFinancingEnterprise) {
		this.elementsFinancingEnterprise = elementsFinancingEnterprise;
	}
	public BigDecimal getElementsGiveQuota() {
		return elementsGiveQuota;
	}
	public void setElementsGiveQuota(BigDecimal elementsGiveQuota) {
		this.elementsGiveQuota = elementsGiveQuota;
	}
	public Integer getElementsFinancingTerm() {
		return elementsFinancingTerm;
	}
	public void setElementsFinancingTerm(Integer elementsFinancingTerm) {
		this.elementsFinancingTerm = elementsFinancingTerm;
	}
	public Integer getElementsFeeMode() {
		return elementsFeeMode;
	}
	public void setElementsFeeMode(Integer elementsFeeMode) {
		this.elementsFeeMode = elementsFeeMode;
	}
	public BigDecimal getElementsFinancingRate() {
		return elementsFinancingRate;
	}
	public void setElementsFinancingRate(BigDecimal elementsFinancingRate) {
		this.elementsFinancingRate = elementsFinancingRate;
	}
	public BigDecimal getElementsServiceFee() {
		return elementsServiceFee;
	}
	public void setElementsServiceFee(BigDecimal elementsServiceFee) {
		this.elementsServiceFee = elementsServiceFee;
	}
	public Integer getElementsAssetsType() {
		return elementsAssetsType;
	}
	public void setElementsAssetsType(Integer elementsAssetsType) {
		this.elementsAssetsType = elementsAssetsType;
	}
	public Integer getElementsRepaymentMode() {
		return elementsRepaymentMode;
	}
	public void setElementsRepaymentMode(Integer elementsRepaymentMode) {
		this.elementsRepaymentMode = elementsRepaymentMode;
	}
	public String getElementsLoanTerms() {
		return elementsLoanTerms;
	}
	public void setElementsLoanTerms(String elementsLoanTerms) {
		this.elementsLoanTerms = elementsLoanTerms;
	}
	public String getElementsRemark() {
		return elementsRemark;
	}
	public void setElementsRemark(String elementsRemark) {
		this.elementsRemark = elementsRemark;
	}
	public Integer getFinancingApplyId() {
		return financingApplyId;
	}
	public void setFinancingApplyId(Integer financingApplyId) {
		this.financingApplyId = financingApplyId;
	}
	public Integer getElementsId() {
		return elementsId;
	}
	public void setElementsId(Integer elementsId) {
		this.elementsId = elementsId;
	}
	public String getOpinionNumber() {
		return opinionNumber;
	}
	public void setOpinionNumber(String opinionNumber) {
		this.opinionNumber = opinionNumber;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	public Integer getSubFinancingApplyId() {
		return subFinancingApplyId;
	}
	public void setSubFinancingApplyId(Integer subFinancingApplyId) {
		this.subFinancingApplyId = subFinancingApplyId;
	}
	public Integer getAuditType() {
		return auditType;
	}
	public void setAuditType(Integer auditType) {
		this.auditType = auditType;
	}
	public String getFinancingEnterprise() {
		return financingEnterprise;
	}
	public void setFinancingEnterprise(String financingEnterprise) {
		this.financingEnterprise = financingEnterprise;
	}
	public BigDecimal getFinancingAmount() {
		return financingAmount;
	}
	public void setFinancingAmount(BigDecimal financingAmount) {
		this.financingAmount = financingAmount;
	}
	
	public Integer getFinancingTerm() {
		return financingTerm;
	}
	public void setFinancingTerm(Integer financingTerm) {
		this.financingTerm = financingTerm;
	}
	public Integer getFeeMode() {
		return feeMode;
	}
	public void setFeeMode(Integer feeMode) {
		this.feeMode = feeMode;
	}
	public BigDecimal getFinancingRate() {
		return financingRate;
	}
	public void setFinancingRate(BigDecimal financingRate) {
		this.financingRate = financingRate;
	}
	public BigDecimal getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getFinancingExplain() {
		return financingExplain;
	}
	public void setFinancingExplain(String financingExplain) {
		this.financingExplain = financingExplain;
	}
	public String getTransactionStructure() {
		return transactionStructure;
	}
	public void setTransactionStructure(String transactionStructure) {
		this.transactionStructure = transactionStructure;
	}
	public String getTrustMeasure() {
		return trustMeasure;
	}
	public void setTrustMeasure(String trustMeasure) {
		this.trustMeasure = trustMeasure;
	}
	public String getAuditOpinion() {
		return auditOpinion;
	}
	public void setAuditOpinion(String auditOpinion) {
		this.auditOpinion = auditOpinion;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getAuditResult() {
		return auditResult;
	}
	public void setAuditResult(Integer auditResult) {
		this.auditResult = auditResult;
	}
	
}

