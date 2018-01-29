/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.core.config;

/**
 * @author kitaz
 *
 */
public final class AppConf {
	AppConf(){}
	
	/**
	 * ページャ設定
	 * @author kitaz
	 *
	 */
	public static class Pager {
		/**
		 * 表示件数
		 */
		public static final int Limit= 2;
		/**
		 * ページャの表示リンク数
		 */
		public static final int Width = 5;
    }
	
	public static class Download {
		
	}
	
	public static class Site {
		
		public static final String URI = "";
	}
	
	public static class Uuid {
		
		public static final String NoData = "00000000-0000-0000-0000-000000000000";
	}
}
