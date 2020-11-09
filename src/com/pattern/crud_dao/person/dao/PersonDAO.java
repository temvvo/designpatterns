package com.pattern.crud_dao.person.dao;

import com.pattern.crud_dao.common.dao.CRUD;
import com.pattern.crud_dao.person.model.Person;

public interface PersonDAO extends CRUD<Person> {

    void mostrarNombre();
}
