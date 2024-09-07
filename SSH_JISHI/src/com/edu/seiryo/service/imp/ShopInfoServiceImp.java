package com.edu.seiryo.service.imp;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.seiryo.dao.ShopInfoDao;
import com.edu.seiryo.dao.imp.ShopInfoDaoImp;
import com.edu.seiryo.entity.ShopInfo;
import com.edu.seiryo.service.ShopInfoService;
@Service
public class ShopInfoServiceImp implements ShopInfoService {
	@Autowired
	ShopInfoDao shopInfoDao;
	
	public ShopInfoDao getShopInfoDao() {
		return shopInfoDao;
	}
	public void setShopInfoDao(ShopInfoDao shopInfoDao) {
		this.shopInfoDao = shopInfoDao;
	}
	/**
	 * 根据id查询商品
	 */
	@Override
	public ShopInfo queryById(Serializable id) {
		return shopInfoDao.queryById(id);
	}
	/**
	 * 查询所有商品
	 */
	@Override
	public List<ShopInfo> query() {
		return shopInfoDao.query();
	}
	/**
	 * 根据名称查询商品
	 */
	@Override
	public List<ShopInfo> queryShopInfoByName(String name) {
		return shopInfoDao.queryShopInfoByName(name);
	}
	/**
	 * 根据名称查询商品id
	 */

	@Override
	public int queryShopInfoIdByName(String name) {
		return shopInfoDao.queryShopInfoIdByName(name);
	}
	
}
