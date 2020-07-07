package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@TableName//与表进行关联  如果名称一致，则可以省略不写
public class User {

}
