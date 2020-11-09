package com.pattern.crud_dao.medic.dao;

import com.pattern.crud_dao.common.dao.CRUD;
import com.pattern.crud_dao.medic.model.Medic;

public interface MedicDAO extends CRUD<Medic> {

    void curar();
}
