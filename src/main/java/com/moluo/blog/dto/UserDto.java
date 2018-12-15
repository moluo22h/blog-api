package com.moluo.blog.dto;

import lombok.Data;
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

public class UserDto{

    private String id;

    private String name;

    private String email;

    private Date createTime;

    private Date updateTime;
}
