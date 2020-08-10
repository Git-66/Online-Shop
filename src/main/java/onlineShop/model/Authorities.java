package onlineShop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "authorities")
public class Authorities implements Serializable {
// 为什么implements seriliazable？ 这个final什么意思？创建一个随机数，干什么的？
	private static final long serialVersionUID = 8734140534986494039L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // 帮助自动生成primary key
	private int id;
	
	private String emailId;

	private String authorities;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}
}
