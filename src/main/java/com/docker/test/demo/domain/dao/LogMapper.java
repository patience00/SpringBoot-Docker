package com.docker.test.demo.domain.dao;

import com.docker.test.demo.domain.model.Log;
import org.springframework.stereotype.Repository;

/**
 * @author 通天晓
 * @date 2018-10-06 21:51
 **/
@Repository
public interface LogMapper {

    void save(Log log);

    Integer count();
}
