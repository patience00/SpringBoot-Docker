package com.docker.test.demo.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 通天晓
 * @date 2018-10-05 21:19
 **/
@Table(name = "log")
@Data
@Entity
public class Log implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String ip;

    @Column
    private Date time;

}
