/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.app.form;

import java.sql.Timestamp;

/**
 * @author kitaz
 *
 */
public class TaxonomiesAdminRegistForm {

	private Timestamp modified;
	private Timestamp deleted;
	private String id;
	private String name;
	private String taxonomy;
	private String description;
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

}
