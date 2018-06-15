package inciManager.inciRepository;

import org.springframework.data.repository.CrudRepository;

import inciManager.entities.Operator;

interface OperatorRepository  extends CrudRepository<Operator, Long>{

}
