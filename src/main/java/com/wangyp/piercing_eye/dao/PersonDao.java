package com.wangyp.piercing_eye.dao;

import com.wangyp.piercing_eye.domain.Person;
import com.wangyp.piercing_eye.domain.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PersonDao {

    @Autowired
    PersonMapper personMapper;

    static Map<Integer, Person> dataMap = Collections.synchronizedMap(new HashMap<Integer, Person>());

    public List<Person> findAll() {
        return new ArrayList<>(dataMap.values());
    }

    public boolean add(Integer pid, String pname, String ppsd) {
        return true;
    }
}
