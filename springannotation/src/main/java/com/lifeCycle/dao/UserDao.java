package com.lifeCycle.dao;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Repository
@Data
/*@Getter
@Setter*/
public class UserDao {
    private String name = "会挂";
}
