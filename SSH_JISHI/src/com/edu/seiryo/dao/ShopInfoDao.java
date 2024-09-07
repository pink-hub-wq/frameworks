package com.edu.seiryo.dao;

import java.io.Serializable;
import java.util.List;

import com.edu.seiryo.entity.Cart;
import com.edu.seiryo.entity.ShopInfo;

public interface ShopInfoDao {
	/**
	 * 根据id查询商品
	 * @param id
	 * @return ShopInfo
	 */
	ShopInfo queryById(Serializable id);
	/**
	 * 查询所有商品
	 * @return 所有商品
	 */
	List<ShopInfo> query();
	/**
	 * 根据名称查询商品
	 * @param name
	 * @return ShopInfo
	 */
	List<ShopInfo> queryShopInfoByName(String name);
	/**
	 * 根据名称查询商品id
	 * @param name
	 * @return 商品id
	 */
	int queryShopInfoIdByName(String name);
}
