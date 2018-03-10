package org.chalenges.solutions.append_and_delete.repository;

import org.chalenges.solutions.append_and_delete.entity.RecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, Long> {

}
