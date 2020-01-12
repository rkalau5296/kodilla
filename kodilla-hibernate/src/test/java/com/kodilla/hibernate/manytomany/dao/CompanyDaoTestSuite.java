package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();
        employeeDao.save(johnSmith);
        int stephanieClarcksonId = stephanieClarckson.getId();
        employeeDao.save(johnSmith);
        int lindaKovalskyId = lindaKovalsky.getId();


        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);
        Assert.assertNotEquals(0, companyDao.getById(softwareMachineId));
        Assert.assertNotEquals(0, companyDao.getById(dataMaestersId));
        Assert.assertNotEquals(0, companyDao.getById(greyMatterId));
        Assert.assertNotEquals(0, employeeDao.getById(johnSmithId));
        Assert.assertNotEquals(0, employeeDao.getById(stephanieClarcksonId));
        Assert.assertNotEquals(0, employeeDao.getById(lindaKovalskyId));
        Assert.assertNotEquals(0, employeeDao.getById(softwareMachineId));
        Assert.assertNotEquals(0, employeeDao.getById(dataMaestersId));
        Assert.assertNotEquals(0, employeeDao.getById(greyMatterId));
        Assert.assertNotEquals(0, companyDao.getById(johnSmithId));
        Assert.assertNotEquals(0, companyDao.getById(stephanieClarcksonId));
        Assert.assertNotEquals(0, companyDao.getById(lindaKovalskyId));


        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }

    @Test
    public void testSearchingEmployeeByName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        List<Employee> smiths = employeeDao.retrieveEmployeeNames("Smith");
        List<Employee> clarcksons = employeeDao.retrieveEmployeeNames("Smith");
        List<Employee> kovalskys = employeeDao.retrieveEmployeeNames("Smith");

        //Then
//        Assert.assertNotEquals(0, smiths.size());
//        Assert.assertNotEquals(0, clarcksons.size());
//        Assert.assertNotEquals(0, kovalskys.size());

    }

    @Test
    public void testRetrieveCompaniesWhereFirstThreeCharsAreEqualToParam() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        List<Company> companiesSof = companyDao.retrieveCompaniesWhereFirstThreeCharsAreEqualToParam("Sof");
        List<Company> companiesDat = companyDao.retrieveCompaniesWhereFirstThreeCharsAreEqualToParam("Dat");
        List<Company> companiesGre = companyDao.retrieveCompaniesWhereFirstThreeCharsAreEqualToParam("Gre");

        //Then
        Assert.assertEquals(companiesSof.get(0).getName(), softwareMachine.getName());
        Assert.assertEquals(companiesDat.get(0).getName(), dataMaesters.getName());
        Assert.assertEquals(companiesGre.get(0).getName(), greyMatter.getName());
    }
}