package com.example.oodles_tech_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OodlesServiceImpl {

    @Autowired
    OodlesRepository oodlesDao;
    public List<OodlesData> getDetails() {
        List<OodlesData> data=new ArrayList<OodlesData>();
        data=oodlesDao.findAll();
        return data;

    }

    public Optional<OodlesData> findById(Long id) {
        return oodlesDao.findById(id);

    }

    public OodlesData save(OodlesData details_new) {
        return oodlesDao.save(details_new);
    }

    public void delete(OodlesData oodlesData_new) {
        oodlesDao.delete(oodlesData_new);
    }
}
