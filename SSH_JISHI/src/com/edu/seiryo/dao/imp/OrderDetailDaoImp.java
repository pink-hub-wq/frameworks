package com.edu.seiryo.dao.imp;

import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.seiryo.dao.OrderDetailDao;
import com.edu.seiryo.entity.Order;
import com.edu.seiryo.entity.OrderDetail;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.BaseDaoImp;
@Repository
public class OrderDetailDaoImp extends BaseDaoImp<OrderDetail>  implements OrderDetailDao {

	@Override
	public List<OrderDetail> queryByOrderId(Integer orderId) {
		List<OrderDetail> orderDetails = (List<OrderDetail>) this.getHibernateTemplate().find("from OrderDetail where orderId = ?", orderId);
	    return orderDetails;
	}


}
