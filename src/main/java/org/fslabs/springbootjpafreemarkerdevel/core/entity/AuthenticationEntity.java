/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.core.entity;

import java.sql.Timestamp;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author kitaz
 *
 */
@Entity
@Table(name = "users")
public class AuthenticationEntity implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2664725757766647574L;

	
	private Timestamp modified;
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String id;
	private String email;
	private String password;
	private String role;
	private Timestamp deleted;

	/**
	 * @return modified
	 */
	public Timestamp getModified() {
		return modified;
	}
	/**
	 * @return uuid
	 */
	public String getId() {
		return id;
	}
	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return role
	 */
	public String getRole() {
		return role;
	}
	/**
	 * @return deleted
	 */
	public Timestamp getDeleted() {
		return deleted;
	}
	/**
	 * @param modified セットする modified
	 */
	public void setModified(Timestamp modified) {
		this.modified = modified;
	}
	/**
	 * @param uuid セットする uuid
	 */
	public void setUuid(String id) {
		this.id = id;
	}
	/**
	 * @param email セットする email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param role セットする role
	 */
	public void setRole(String role) {
		this.role = role;
	}
	/**
	 * @param deleted セットする deleted
	 */
	public void setDeleted(Timestamp deleted) {
		this.deleted = deleted;
	}
	
	/**
	 * override
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}
	@Override
	public String getUsername() {
		return this.email;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
