package com.sunwoda.mybatis.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.sunwoda.mybatis.mapper.UserMapper;
import com.sunwoda.mybatis.pojo.User;

public class UserMapperTest {
	private UserMapper userMapper;
	@Before
	public void setUp() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("configuration.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sessionFactory.openSession();
		this.userMapper  = session.getMapper(UserMapper.class);
	}

	@Test
	public void testfindUserById() {
		User user = userMapper.findUserById(1);
		System.out.println(user+"------findUserById");
	}
	
	@Test
	public void testfindAll() {
		List<User> list = userMapper.findAll();
		System.out.println(list+"------findUser");
	}
	
	@Test
	public void testSave() {
		User user = new User();
		user.setName("田海波");
		user.setAge(24);
		user.setAddress("上海市");
		userMapper.save(user);
		System.out.println("------save");
	}
	@Test
	public void testUpdate() {
		User user = new User();
		user.setId(3);
		user.setName("田海涛");
		user.setAge(24);
		user.setAddress("驻马店1111");
		userMapper.update(user);
		System.out.println("------update");
	}
	@Test
	public void testDeleteUserById() {
		User user = new User();
		userMapper.deleteUserById(3);
		System.out.println("------deleteUserById");
	}
	

}
