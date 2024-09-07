package com.edu.seiryo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.edu.seiryo.entity.User;

public interface UserMapperAnnotation {
	@Insert("insert into t_user (user_name, user_pwd) values (#{name}, #{pwd})")
	public int add(User user);
	@Select("select user_id id,user_name name,user_pwd pwd from t_user order by user_id ${order}")
	public List<User> query(@Param("order")String order);
	@Select("select user_id id,user_name name,user_pwd pwd from t_user where user_id = #{id} ")
	public User queryById(int id);
	@Update("update t_user set user_pwd = #{pwd} where user_name = #{name}")
	public int update(@Param("name") String name,@Param("pwd")String pwd);
	@Delete("delete from t_user where user_id = #{id}")
	public int delete(int id);
}
