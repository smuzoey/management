package management;

import management.daoTest.UserTest;

public class Test {
	int i;
	
	public static void main(String[] args) {
		//new ActionTest().addTest();
		//new ActionTest().deleteTest();
		//new ActionTest().changeAImgTest();
		//new ActionTest().changeTimeTest();
		
		UserTest t = new UserTest();
		t.changeClassNameTest();
		t.changeFacultyTest();
		t.changeHeardImgTest();
		t.changePasswordTest();
		
	}

}
