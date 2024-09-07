package com.edu.seiryo.dao.imp;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.edu.seiryo.dao.ShopInfoDao;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.entity.UserInfo;
import com.edu.seiryo.util.BaseDaoImp;
@Repository
public class ShopInfoDaoImp extends BaseDaoImp<ShopInfo> implements ShopInfoDao {

	
	/**
	 * 根据名称查询商品
	 */
	@Override
	public List<ShopInfo> queryShopInfoByName(String name) {
		List<ShopInfo> list = this.getHibernateTemplate().find("from ShopInfo where shopName = ?",new String[] {name});
		return list;
	}
	/**
	 * 根据名称查询商品id
	 */
	@Override
	public int queryShopInfoIdByName(String name) {
		List<ShopInfo> list = this.getHibernateTemplate().find("from ShopInfo where shopName = ?",new String[] {name});
        return list.get(0).getId();
	}

}
