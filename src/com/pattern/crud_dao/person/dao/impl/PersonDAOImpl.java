package com.pattern.crud_dao.person.dao.impl;

import com.pattern.crud_dao.person.dao.PersonDAO;
import com.pattern.crud_dao.person.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImpl implements PersonDAO {

    @Override
    public List<Person> listarTodos() {
        List<Person> lista = new ArrayList<>();
        Person per = new Person();
        per.setId(1);
        per.setNames("Caro");

        lista.add(per);

        per = new Person();
        per.setId(2);
        per.setNames("Lia");

        lista.add(per);

        return lista;
    }

    @Override
    public Person leerPorId(int id) {
        //logica
        return null;
    }

    @Override
    public void registrar(Person person) {
        System.out.println("Person " + person.getNames() + " registrada");
    }

    @Override
    public void actualizar(Person person) {
        System.out.println("Person " + person.getNames() + " actualizada");
    }

    @Override
    public void eliminar(int id) {
        System.out.println("id " + id + "eliminado");
    }

    @Override
    public void mostrarNombre() {
        // TODO Auto-generated method stub

    }
}
