package net.javaguides.springboot.springsecurity.repository;

import java.util.List;

public interface IGenericDao<T> {
 
	List<T> findAllByNativeQuery(String query, T pojo); 
}
