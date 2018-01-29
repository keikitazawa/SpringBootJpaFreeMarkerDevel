/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.app.form;

/**
 * @author kitaz
 *
 */
public class TaxonomiesAdminSearchForm {
	
	private String keyword;
	private String hid;
	
	/**
	 * @return keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @return hid
	 */
	public String getHid() {
		return hid;
	}
	/**
	 * @param keyword セットする keyword
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	/**
	 * @param hid セットする hid
	 */
	public void setHid(String hid) {
		this.hid = hid;
	}

}
