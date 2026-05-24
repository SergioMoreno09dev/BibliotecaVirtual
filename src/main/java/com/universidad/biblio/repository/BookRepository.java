package com.universidad.biblio.repository;

import com.universidad.biblio.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, String> {
    @Query("""
            select distinct b from Book b
            left join b.author a
            left join b.category c
            where (:term is null or :term = ''
                or lower(b.title) like lower(concat('%', :term, '%'))
                or lower(b.isbn) like lower(concat('%', :term, '%'))
                or lower(a.name) like lower(concat('%', :term, '%')))
              and (:category is null or :category = ''
                or lower(c.name) = lower(:category))
            """)
    List<Book> search(@Param("term") String term, @Param("category") String category);
}
