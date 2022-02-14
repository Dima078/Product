package ru.netology.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoriyProductTest {

    @Test
    void save() {
        Book book1 = new Book(1, "book1", 100, "autor1");
        Book book2 = new Book(2, "book2", 150, "autor2");
        Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
        Smartphone smartphone2 = new Smartphone(4, "smartphone2", 1000, "man2");

        RepositoriyProduct repo = new RepositoriyProduct();
        repo.save(book1);
        repo.save(book2);
        repo.save(smartphone1);
        repo.save(smartphone2);

        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    void findAll() {
        Book book = new Book(1, "book", 100, "autor1");
        Smartphone smartphone = new Smartphone(2, "smartphone1", 1000, "man1");

        RepositoriyProduct repo = new RepositoriyProduct();
        repo.save(book);
        repo.save(smartphone);

        Product[] expected = {book, smartphone};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeById() {
        Book book1 = new Book(1, "book1", 100, "autor1");
        Book book2 = new Book(2, "book2", 150, "autor2");
        Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
        Smartphone smartphone2 = new Smartphone(4, "smartphone2", 1000, "man2");

        RepositoriyProduct repo = new RepositoriyProduct();
        repo.save(book1);
        repo.save(book2);
        repo.save(smartphone1);
        repo.save(smartphone2);

        repo.removeById(3);

        Product[] expected = {book1, book2, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }
}