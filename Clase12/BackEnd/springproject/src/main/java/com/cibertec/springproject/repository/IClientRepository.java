package com.cibertec.springproject.repository;

import com.cibertec.springproject.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IClientRepository extends JpaRepository<Client, Integer> {
}
