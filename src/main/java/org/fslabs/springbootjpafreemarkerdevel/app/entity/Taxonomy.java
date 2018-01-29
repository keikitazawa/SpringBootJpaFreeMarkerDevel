package org.fslabs.springbootjpafreemarkerdevel.app.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	/**
	 * @return modified
	 */
	public Timestamp getModified() {
		return modified;
	}

	/**
	 * @return deleted
	 */
	public Timestamp getDeleted() {
		return deleted;
	}

	/**
	 * @return hid
	 */
//	public String getHid() {
//		return hid;
//	}

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return weight
	 */
	public String getWeight() {
		return weight;
	}

	/**
	 * @return taxonomyHeaders
	 */
	public TaxonomyHeader getTaxonomyHeaders() {
		return taxonomyHeaders;
	}

	/**
	 * @param modified セットする modified
	 */
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}

	/**
	 * @param deleted セットする deleted
	 */
	public void setDeleted(Timestamp deleted) {
		this.deleted = deleted;
	}

	/**
	 * @param hid セットする hid
	 */
//	public void setHid(String hid) {
//		this.hid = hid;
//	}

	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param weight セットする weight
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * @param taxonomyHeaders セットする taxonomyHeaders
	 */
	public void setTaxonomyHeaders(TaxonomyHeader taxonomyHeaders) {
		this.taxonomyHeaders = taxonomyHeaders;
	}
}
