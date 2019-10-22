package management.daoTest;

import java.util.Date;

import management.dao.ClubDao;
import management.entity.Club;

public class ClubTest {
	
	//添加社团
	public void addTest() {
		Club c = new Club("计算机协会","201731104180","201731104181","修电脑的",new Date());
		new ClubDao().add(c);
	}
	
	//修改社团名称
	public void changeCnameTest() {
		new ClubDao().changeCname(1, "新计协");
	}
	
	//修改社长
	public void changeChairmanTest() {
		new ClubDao().changeChairman(1, "201731104181");
	}
	
	//修改副社长
	public void changeVicechairmanTest() {
		new ClubDao().changeVicechairman(1, "201731104180");
	}
	
	//修改社团的简介
	public void changeCintroTest() {
		new ClubDao().changeCintro(1, "新的简介");
	}
	
	//根据cid查找整个社团的信息
	public void selectByCidTest() {
		System.out.println(new ClubDao().selectByCid(1));
	}
	
	//根据cid删除社团
	public void delete() {
		new ClubDao().delete(1);
	}
}
