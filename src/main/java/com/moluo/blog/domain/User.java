package com.moluo.blog.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

/**
 * @author zzh
 * @date 2018/11/6
 */
@Data
@Entity
@Table(name = "user")
@DynamicUpdate
@DynamicInsert
@EntityListeners(AuditingEntityListener.class)
public class User {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @GeneratedValue(strategy = GenerationType.TABLE)
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    @Column(length = 32)
    private String id;

    @Column
    private String name;

    @Column
    private String email;

    @CreatedDate
    private Date createTime;

    @LastModifiedDate
    private Date updateTime;
}
