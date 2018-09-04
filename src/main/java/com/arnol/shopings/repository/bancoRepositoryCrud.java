package com.arnol.shopings.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.arnol.shopings.entity.Banco;



@Repository("bancoRepositoryCrud")
public interface bancoRepositoryCrud extends CrudRepository<Banco, Long> {

}
