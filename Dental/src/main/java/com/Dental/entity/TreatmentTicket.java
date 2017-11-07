package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;

import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = TREATMENT_TICKETS)
public class TreatmentTicket extends Entity{
	
	@OneToMany(mappedBy="treatmentTicket")
	private Set<BillServiceTreatment> billServiceTreatment;
	
	@OneToMany(mappedBy="treatmentTicket")
	private Set<Prescription> prescription;
	
	@ManyToOne
	@JoinColumn(name = MEDICAL_RECORD_ID)
	private MedicalRecord medicalRecord;
	
	
	@Column(name = CREATED_DATE )
	private Date created_date ;
	
	@Column(name = FILE_IMAGES )
	private String fileImg ;
	
	@Column(name = EXAMINATION_RESULTS )
	private String examResult;
	
	@Column(name = ACTIVE)
	private int active;

	public TreatmentTicket() {
		super();
	}

	public Set<BillServiceTreatment> getBillServiceTreatment() {
		return billServiceTreatment;
	}

	public void setBillServiceTreatment(Set<BillServiceTreatment> billServiceTreatment) {
		this.billServiceTreatment = billServiceTreatment;
	}

	public Set<Prescription> getPrescription() {
		return prescription;
	}

	public void setPrescription(Set<Prescription> prescription) {
		this.prescription = prescription;
	}

	public MedicalRecord getMedicalRecord() {
		return medicalRecord;
	}

	public void setMedicalRecord(MedicalRecord medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public Date getCreated_date() {
		return created_date;
	}

	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	public String getFileImg() {
		return fileImg;
	}

	public void setFileImg(String fileImg) {
		this.fileImg = fileImg;
	}

	public String getExamResult() {
		return examResult;
	}

	public void setExamResult(String examResult) {
		this.examResult = examResult;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
	

}
