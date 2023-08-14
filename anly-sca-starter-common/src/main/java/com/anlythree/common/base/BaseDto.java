package com.anlythree.common.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * dto基类
 * @DATE: 2023/8/14
 * @USER: anlythree
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseDto {
    private Integer id;

    private Integer creatorId;

    private Integer tenantId;

    private String lockVersion;
}
