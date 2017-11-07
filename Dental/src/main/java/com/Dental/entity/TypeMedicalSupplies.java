package com.Dental.entity;
import static com.Dental.dao.AbstractDAO.*;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@javax.persistence.Entity
@Table(name = TYPE_MEDICAL_SUPPLIESS)
public class TypeMedicalSupplies extends Entity{
	
	@OneToMany(mappedBy="typeMedicalSupplies")
	private Set<MedicalSupplies> medicalSupplies ;
	
	@Column(name = NAME)
	private String name ;

	public TypeMedicalSupplies() {
		super();
	}

	public Set<MedicalSupplies> getMedicalSupplies() {
		return medicalSupplies;
	}

	public void setMedicalSupplies(Set<MedicalSupplies> medicalSupplies) {
		this.medicalSupplies = medicalSupplies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
