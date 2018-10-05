package com.docker.test.demo.domain.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 通天晓
 * @date 2018-10-05 22:57
 **/
@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
}
