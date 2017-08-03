package com.sunwoda.mybatis.mapper;

import java.util.List;

import com.sunwoda.mybatis.pojo.User;

public interface UserMapper {
	/**
	 * @param id
	 * @return
	 */
	public User findUserById(Integer id);
	/**
	 * @return
	 */
	public List<User> findAll();
	/**
	 * @param user
	 */
	public void save(User user);
	/**
	 * @param user
	 */
	public void update(User user);
	/**
	 * @param id
	 */
	public void deleteUserById(Integer id);
}
