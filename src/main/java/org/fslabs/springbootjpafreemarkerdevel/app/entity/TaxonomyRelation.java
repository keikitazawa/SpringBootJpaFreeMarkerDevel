package org.fslabs.springbootjpafreemarkerdevel.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="taxonomyrelations")
public class TaxonomyRelation implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5073032560316644198L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private String id;
	
	@Column(name="pid")
	private String pid;
	
	@Column(name="cid")
	private String cid;
	
	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return pid
	 */
	public String getPid() {
		return pid;
	}

	/**
	 * @return cid
	 */
	public String getCid() {
		return cid;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param pid セットする pid
	 */
	public void setPid(String pid) {
		this.pid = pid;
	}

	/**
	 * @param cid セットする cid
	 */
	public void setCid(String cid) {
		this.cid = cid;
	}
}
