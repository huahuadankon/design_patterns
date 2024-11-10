package com.huahuadan.pattern.iterator;

public class Client {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.add(new Book("Around the World in 80 Days"));
        bookShelf.add(new Book("Bible"));
        bookShelf.add(new Book("Cinderella"));
        bookShelf.add(new Book("Daddy-Long-Legs"));
        bookShelf.add(new Book("East of Eden"));
        bookShelf.add(new Book("Frankenstein"));
        bookShelf.add(new Book("Gulliver's Travels"));
        bookShelf.add(new Book("Hamlet"));
        Iterator it =  bookShelf.iterator();//返回一个迭代器接口的子实现类
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
