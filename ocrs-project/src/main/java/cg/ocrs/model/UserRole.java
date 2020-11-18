package cg.ocrs.model;

public class UserRole {

	private String userName;
	private String password;
	private String rolecode;
	
	public UserRole(String username, String password, String rolecode) {
		super();
		this.userName = userName;
		this.password = password;
		this.rolecode = rolecode;
	}

	public UserRole() {
		}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRolecode() {
		return rolecode;
	}

	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}

	@Override
	public String toString() {
		return "UserRole [userName=" + userName + ", password=" + password + ", rolecode=" + rolecode + "]";
	}
	
	
}
