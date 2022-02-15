package ru.netology.product;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.ManagerProduct;
import ru.netology.repository.RepositoriyProduct;

import static org.junit.jupiter.api.Assertions.*;

class RepositoriyProductTest {
    private RepositoriyProduct repo = new RepositoriyProduct();
    private Book book1 = new Book(1, "book1", 100, "autor1");
    private Book book2 = new Book(2, "book2", 150, "autor2");
    private Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
    private Smartphone smartphone2 = new Smartphone(4, "smartphone2", 1000, "man2");

    @BeforeEach
    public void setUp() {
        repo.save(book1);
        repo.save(book2);
        repo.save(smartphone1);
        repo.save(smartphone2);
    }

    @Test
    void save() {
        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void findAll() {
        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        repo.removeById(3);
        Product[] expected = {book1, book2, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
}