package ru.netology.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getSetId() {
        Product product = new Product();
        product.setId(2);
        int expected = 2;
        int actual = product.getId();
        assertEquals(expected, actual);
    }

    @Test
    void getSetName() {
        Product product = new Product();
        product.setName("Book");
        String expected = "Book";
        String actual = product.getName();
        assertEquals(expected, actual);
    }

    @Test
    void getSetPrice() {
        Product product = new Product();
        product.setPrice(100);
        int expected = 100;
        int actual = product.getPrice();
        assertEquals(expected, actual);
    }

    @Test
    void getSetAutor() {
        Book book = new Book();
        book.setAutor("autor1");
        String expected = "autor1";
        String actual = book.getAutor();
        assertEquals(expected, actual);
    }

    @Test
    void getSetManufacturer() {
        Smartphone smartphone = new Smartphone();
        smartphone.setManufacturer("man1");
        String expected = "man1";
        String actual = smartphone.getManufacturer();
        assertEquals(expected, actual);
    }
}