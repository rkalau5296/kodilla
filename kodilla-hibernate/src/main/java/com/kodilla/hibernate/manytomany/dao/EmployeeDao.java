package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee, Integer> {
    List<Employee> getById(Integer id);

    @Query
    List<Employee> retrieveEmployeeNames(@Param("name") String name);

    @Query
    List<Employee> retrieveEmployeesNamesWhereNamesLikeParam(@Param("name") String name);
}
