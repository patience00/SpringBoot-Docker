package com.docker.test.demo.domain.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 通天晓
 * @date 2018-10-05 21:19
 **/
@Data
public class Log implements Serializable {

    private Long id;

    private String ip;

    private Date time;

}
