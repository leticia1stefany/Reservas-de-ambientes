package com.reservasDeAmbientes.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.lang.NonNull;

import jakarta.transaction.Transactional;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends JpaRepository<T, ID> {

    @Query("SELECT e from #{#entityName} e WHERE e.ativo = true")
    @NonNull
    List<T> findAll();

    @Transactional
    @Modifying
    @Query("UPDATE #{#entityName} e SET e.ativo = FALSE, e.deletedAt = CURRENT_TIMESTAMP WHERE e.id = :id")
    void softDeleteById(ID id);

}
