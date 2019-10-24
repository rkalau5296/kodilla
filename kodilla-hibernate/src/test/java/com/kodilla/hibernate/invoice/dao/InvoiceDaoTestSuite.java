package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void InvoiceDaoTestSuite() {
        //Given

        Item item = new Item(new Product("Bread"), new BigDecimal(5), 1, new BigDecimal(3));
        Invoice invoice = new Invoice("1");
        invoice.getItems().add(item);
        item.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

//        //CleanUp
//        try{
//            invoiceDao.deleteById(String.valueOf(id));
//        }catch (Exception o) {
//            //do nothing
//        }
    }
}
