package net.javaguides.springboot.springsecurity.repository;

import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
 
@Repository 
@Transactional
public class GenericDaoImpl<T> implements IGenericDao<T> {
 
	@Autowired
    private JdbcTemplate jdbcTemplate;
	 
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public List<T> findAllByNativeQuery(String sql, T pojo) {  
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<T> list= jdbcTemplate.query(sql , new BeanPropertyRowMapper(pojo.getClass()));
		return list;
	}
 
}
