package com.docker.test.demo.service.impl;

import com.docker.test.demo.domain.dao.LogMapper;
import com.docker.test.demo.domain.model.Log;
import com.docker.test.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author 通天晓
 * @date 2018-10-05 22:56
 **/
@Service
public class LogServiceImpl implements LogService {

    private final LogMapper logMapper;

    @Autowired
    public LogServiceImpl(final LogMapper logMapper) {
        this.logMapper = logMapper;
    }

    @Override
    public Integer record(String ip) {
        Log log = new Log();
        log.setIp(ip);
        log.setTime(new Date());
        logMapper.save(log);
        return logMapper.count();
    }
}
