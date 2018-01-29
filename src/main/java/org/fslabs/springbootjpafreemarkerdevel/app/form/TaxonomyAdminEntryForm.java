/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.app.form;

import java.io.Serializable;

/**
 * @author kitaz
 *
 */
public class TaxonomyAdminEntryForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -160465638300021186L;
	
	private String targetId;
	private int currentPage;
	private String keyword;
	
	/**
	 * @return targetId
	 */
	public String getTargetId() {
		return targetId;
	}
	/**
	 * @return currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}
	/**
	 * @return keyword
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * @param targetId セットする targetId
	 */
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	/**
	 * @param currentPage セットする currentPage
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	/**
	 * @param keyword セットする keyword
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}
