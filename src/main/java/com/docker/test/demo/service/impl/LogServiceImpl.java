package com.docker.test.demo.service.impl;

import com.docker.test.demo.domain.model.Log;
import com.docker.test.demo.domain.model.LogRepository;
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

    private final LogRepository logRepository;

    @Autowired
    public LogServiceImpl(final LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void record(String ip) {
        Log log = new Log();
        log.setIp(ip);
        log.setTime(new Date());
        logRepository.save(log);
    }
}
