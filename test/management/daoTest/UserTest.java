package management.daoTest;

import management.dao.UserDao;
import management.entity.User;

public class UserTest {
	
	//添加用户
	public void addTest() {
		User u = new User("201731104181","13477178887","第一个","421087199812121111","计算机科学与技术","软件工程1701","https://pic.cnblogs.com/avatar/1077694/20161213083850.png","123456","女");
		new UserDao().add(u);
	}
	
	//修改电话号码
	public void changePhoneTest() {
		new UserDao().changePhone("201731104181", "13477178888");
	}
	
	//查找此人全部信息
	public void selectByUid() {
		System.out.println(new UserDao().selectByUid("201731104181"));
	}
	
	//修改学院
	public void changeFacultyTest() {
		new UserDao().changeFaculty("201731104181", "新学院");
	}
	
	//修改班级
	public void changeClassNameTest() {
		new UserDao().changeClassName("201731104181", "新班级");
	}
	
	//修改头像
	public void changeHeardImgTest() {
		new UserDao().changeHeardImg("201731104181", "新头像");
	}
	
	//修改密码
	public void changePasswordTest() {
		new UserDao().changePassword("201731104181", "abcd");
	}
}
