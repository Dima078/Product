package ru.netology.product;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerProductTest {

    @Test
    public void add() {
        Book book1 = new Book(1, "book1", 100, "autor1");
        Book book2 = new Book(2, "book2", 150, "autor2");
        Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
        Smartphone smartphone2 = new Smartphone(3, "smartphone2", 1000, "man2");

        RepositoriyProduct repo = new RepositoriyProduct();
        ManagerProduct manager = new ManagerProduct(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {book1, book2, smartphone1, smartphone2};
        Product[] actual = repo.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void searchBy() {
        Book book1 = new Book(1, "book1", 100, "autor1");
        Book book2 = new Book(2, "book2", 150, "autor2");
        Book book3 = new Book(2, "book24", 150, "autor2");
        Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
        Smartphone smartphone2 = new Smartphone(3, "smartphone2", 1000, "man2");

        RepositoriyProduct repo = new RepositoriyProduct();
        ManagerProduct manager = new ManagerProduct(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);

        Product[] expected = {book2, book3};
        Product[] actual = manager.searchBy("book2");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void getRepos() {
        Book book1 = new Book(1, "book1", 100, "autor1");
        Book book2 = new Book(2, "book2", 150, "autor2");
        Smartphone smartphone1 = new Smartphone(3, "smartphone1", 1000, "man1");
        Smartphone smartphone2 = new Smartphone(3, "smartphone2", 1000, "man2");

        RepositoriyProduct repo = new RepositoriyProduct();
        ManagerProduct manager = new ManagerProduct(repo);
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
        manager.add(smartphone2);

        RepositoriyProduct expected = repo;
        RepositoriyProduct actual = manager.getRepository();
        assertEquals(expected, actual);
    }
}