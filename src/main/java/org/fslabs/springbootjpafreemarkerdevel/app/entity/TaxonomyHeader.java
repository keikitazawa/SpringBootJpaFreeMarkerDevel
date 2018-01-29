package org.fslabs.springbootjpafreemarkerdevel.app.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="taxonomyheaders")
public class TaxonomyHeader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4528002443497075105L;

	@Column(name="modified")
	private Timestamp modified;
	
	@Column(name="deleted")
	private Timestamp deleted;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="taxonomy")
	private String taxonomy;
	
	@Column(name="description")
	private String description;

	@OneToMany(targetEntity=Taxonomy.class, mappedBy="taxonomyHeaders")
	private List<Taxonomy> taxonomyList;

	/** getter/setter **/	
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
	 * @return taxonomy
	 */
	public String getTaxonomy() {
		return taxonomy;
	}

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return taxonomyList
	 */
	public List<Taxonomy> getTaxonomyList() {
		return taxonomyList;
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
	 * @param taxonomy セットする taxonomy
	 */
	public void setTaxonomy(String taxonomy) {
		this.taxonomy = taxonomy;
	}

	/**
	 * @param description セットする description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param taxonomyList セットする taxonomyList
	 */
	public void setTaxonomyList(List<Taxonomy> taxonomyList) {
		this.taxonomyList = taxonomyList;
	}
}
