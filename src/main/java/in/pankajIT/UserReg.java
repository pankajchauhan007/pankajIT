package in.pankajIT;

import in.coolIT.secur.PwdSecurityService;

public class UserReg {

	public static void main(String[] args) {
		
		PwdSecurityService pss=new PwdSecurityService();
		String encode = pss.encode("PakajIT");
		System.out.println(encode);
	}

}
