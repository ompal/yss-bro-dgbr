package net.javaguides.springboot.springsecurity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.springsecurity.entity.Project; 

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
	
	@Query( "select p from Project p where projType =:type" )
	List<Project> findAllByProjectType(String type);
	
	@Query( "select p from Project p where adg =:adg" )
	List<Project> findAllByAGD(String adg);

	Project findByProjName(String projName);
}
