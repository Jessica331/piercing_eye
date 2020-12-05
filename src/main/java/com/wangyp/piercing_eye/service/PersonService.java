package com.wangyp.piercing_eye.service;

import com.wangyp.piercing_eye.dao.PersonDao;
import com.wangyp.piercing_eye.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonDao personDao;

    public List<Person> findAll() {
        return personDao.findAll();
    }

    public boolean add(Integer pid, String pname, String ppsd) {
        return personDao.add(pid, pname, ppsd);
    }
}
