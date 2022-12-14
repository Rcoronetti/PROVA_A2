package Cerveja.repository;

import org.springframework.data.repository.CrudRepository;

import Cerveja.model.Cerveja;

public interface CervejaRepository extends CrudRepository<Cerveja, Long> {

}