package org.fslabs.springbootjpafreemarkerdevel.app.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Taxonomies")
public class Taxonomy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7346589350142862572L;

	@Column(name="modified")
	private Timestamp modified;
	
	@Column(name="deleted")
	private Timestamp deleted;
	
	// @KWON: 外部結合するキーは外部（One側）で取る
//	@Column(name="hid")
//	private String hid;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;

	@Column(name="weight")
	private String weight;
	
	@ManyToOne(targetEntity=TaxonomyHeader.class)
	@JoinColumn(name="hid", referencedColumnName="id")
	private TaxonomyHeader taxonomyHeaders;
	
//	@ManyToMany
//	@JoinTable(
//		name="taxonomyrelations",
//		joinColumns=@JoinColumn(name="pid", referencedColumnName="id"),
//		inverseJoinColumns=@JoinColumn(name="cid", referencedColumnName="id")
//	)
//	private Taxonomy taxonomyParents;
//	
//	@ManyToMany
//	@JoinTable(
//		name="taxonomyrelations",
//		joinColumns=@JoinColumn(name="cid", referencedColumnName="id"),
//		inverseJoinColumns=@JoinColumn(name="pid", referencedColumnName="id")
//	)
//	private Taxonomy taxonomyChilds;
	
	/** getter/setter **/
	public Timestamp getModified() {
		return modified;
	}
	public Timestamp getDeleted() {
		return deleted;
	}
	public String getName() {
		return name;
	}
	public String getWeight() {
		return weight;
	}
	public TaxonomyHeader getTaxonomyHeaders() {
		return taxonomyHeaders;
	}
//	public Taxonomy getTaxonomyParents() {
//		return taxonomyParents;
//	}
//	public Taxonomy getTaxonomyChilds() {
//		return taxonomyChilds;
//	}
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
	public void setDeleted(Timestamp deleted) {
		this.deleted = deleted;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public void setTaxonomyHeaders(TaxonomyHeader taxonomyHeaders) {
		this.taxonomyHeaders = taxonomyHeaders;
	}
//	public void setTaxonomyParents(Taxonomy taxonomyParents) {
//		this.taxonomyParents = taxonomyParents;
//	}
//	public void setTaxonomyChilds(Taxonomy taxonomyChilds) {
//		this.taxonomyChilds = taxonomyChilds;
//	}
}
