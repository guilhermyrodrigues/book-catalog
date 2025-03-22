package book.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import book.backend.model.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
    
}
