package com.edu.seiryo.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.edu.seiryo.entity.Log;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.service.OrderService;
import com.edu.seiryo.util.BaseAction;

public class UserInfoAction extends BaseAction<UserInfo> {
	
	public String login() {
		UserInfo userInfo = this.getUserServiceImp().login(this.getModel());
		if(userInfo != null) {
			List<Order> list = this.getOrderServiceImp().query();
			getSession().put("OrderList", list);
			Log log = new Log();
			log.setUserName(this.getModel().getUserName());
			Date date = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String dtm = simpleDateFormat.format(date);
			log.setLoginDtm(dtm);
			this.getLogServiceImp().add(log);
			setUrl("orderInfo");
		}else {
			setMsg("’À∫≈ªÚ√‹¬Î¥ÌŒÛ£¨«Î…‘∫Û‘Ÿ ‘");
			this.getRequest().put("msg2", getMsg());
			setUrl("login");
		}
		return getUrl();
	}
}
