package management.daoTest;

import java.util.Date;

import management.dao.ActionDao;
import management.entity.Action;

/**
 * 	private Integer aid;     //活动编号
	private String aname;   //活动名称
	private Integer cid;   //社团编号
	private String aintro;   //活动简介
	private String aImg;    //活动图片
	private Date startTime;   //开始时间
	private Date endTime;     //结束时间
 *
 * @author zoey
 */

public class ActionTest {
	
	//添加活动
	public void addTest() {
		Action a = new Action("活动1", 1, "这只是一个测试活动", "https://pic.cnblogs.com/avatar/1744251/20190718001240.png",new Date(), new Date());
		new ActionDao().add(a);
	}
	
	//修改活动名字
	public void changeAnameTest() {
		new ActionDao().changeAname(1, "新名字");
	}
	
	//修改活动简介
	public void changeAintroTest() {
		new ActionDao().changeAintro(1,"这是新的简介");
	}
	
	//修改活动图片
	public void changeAImgTest() {
		new ActionDao().changeAImg(1,"http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=0&spn=0&di=201300&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=2350302849%2C3323337377&os=4242248080%2C593001332&simid=3454316350%2C353014060&adpicid=0&lpn=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fblog%2F201312%2F04%2F20131204184148_hhXUT.jpeg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3B17tpwg2_z%26e3Bv54AzdH3Fks52AzdH3F%3Ft1%3Dcb8ac8dd0&gsm=&islist=&querylist=");
	}
	
	//修改活动时间
	public void changeTimeTest() {
		new ActionDao().changeTime(1, new Date(), new Date());
	}
	
	//根据aid获得整个活动信息
	public void selectByAidTest() {
		Action a = new ActionDao().selectByAid(1);
		System.out.println(a);
	}
	
	
	//删除活动
	public void deleteTest() {
		new ActionDao().delete(1);
	}
}
