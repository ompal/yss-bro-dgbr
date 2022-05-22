package net.javaguides.springboot.springsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.entity.Role; 

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query( "select r from Role r where id in :ids" )
	List<Role> findRoleByIds(@Param("ids") List<Long> ids);
	
	Role findByName(String name);
}
