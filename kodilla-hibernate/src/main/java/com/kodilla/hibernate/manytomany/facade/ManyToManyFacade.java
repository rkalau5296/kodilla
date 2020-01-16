package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class  ManyToManyFacade {

    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> retrieveCompaniesWhereNameLikeParam(String param){
        return companyDao.retrieveCompaniesNamesWhereNamesLikeParam(param);
    }

    public void retrieveEmployeesWhereNameLikeParam(String param){
        employeeDao.retrieveEmployeesNamesWhereNamesLikeParam(param);
    }
}
