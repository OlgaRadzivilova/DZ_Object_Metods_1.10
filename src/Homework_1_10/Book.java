package Homework_1_10;

import java.util.Objects;

public class Book {

        private String title;
        private Author author;
        private int publishingYear;

        public Book(String title, Author author, int publishingYear) {
            this.title = title;
            this.author = author;
            this.publishingYear = publishingYear;
        }
        public String getTitle() {
            return title;
        }
        public Author getAuthor() {
            return author;
        }
        public int getPublishingYear() {
            return publishingYear;
        }
        public void setPublishingYear() {
            this.publishingYear = publishingYear;
        }

    @Override
    public boolean equals(Object b) {
        if (this == b)
            return true;
        if (b == null || getClass() != b.getClass())
            return false;
        Book book = (Book) b;
        return publishingYear == book.publishingYear && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishingYear);
    }

    @Override
    public String toString() {
        return title + ", " + author + ", " + publishingYear + ".";
    }

}
