package com.pattern.crud_dao;

import com.pattern.crud_dao.common.dao.CRUD;
import com.pattern.crud_dao.person.dao.impl.PersonDAOImpl;
import com.pattern.crud_dao.person.model.Person;

public class App {
    public static void main(String[] args) {
        CRUD<Person> dao = new PersonDAOImpl();
        //dao.listarTodos().forEach(x -> System.out.println(x.getNames()));
        dao.listarTodos().forEach(System.out::println);

        Person per = new Person();
        per.setNames("Carlos Perez");
        dao.registrar(per);
    }
}
