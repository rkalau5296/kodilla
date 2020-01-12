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
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Autowired
    private ItemDao itemDao;

    @Test
    public void InvoiceDaoTestSuite() {
        //Given
        Product product = new Product("Bread");
        Item item = new Item(product, new BigDecimal(5), 1, new BigDecimal(3));
        Item item2 = new Item(product, new BigDecimal(5), 1, new BigDecimal(3));
        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        product.getItems().add(item);
        product.getItems().add(item2);
        item.setProduct(product);
        item2.setProduct(product);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);
        itemDao.save(item2);
        Invoice invoiceFromDb = invoiceDao.getById(invoice.getId());

        //Then
        Assert.assertNotEquals(0, invoice.getId());
        Assert.assertNotEquals(0, product.getId());
        Assert.assertNotEquals(0, item.getId());
        Assert.assertNotEquals(0, item2.getId());
        Assert.assertEquals(invoiceFromDb.getItems(), invoice.getItems());
    }

    @Test
    public void ProductDaoTestSuite() {
        //Given
        Product product = new Product("Bread");
        Item item = new Item(product, new BigDecimal(5), 1, new BigDecimal(3));
        Item item2 = new Item(product, new BigDecimal(5), 1, new BigDecimal(3));
        Invoice invoice = new Invoice("1");

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        item.setInvoice(invoice);
        item2.setInvoice(invoice);

        product.getItems().add(item);
        product.getItems().add(item2);
        item.setProduct(product);
        item2.setProduct(product);

        //When
        invoiceDao.save(invoice);
        productDao.save(product);
        itemDao.save(item);
        itemDao.save(item2);
        Product productFromDb = productDao.getById(product.getId());

        //Then
        Assert.assertEquals(productFromDb.getItems(), product.getItems());
    }
}
