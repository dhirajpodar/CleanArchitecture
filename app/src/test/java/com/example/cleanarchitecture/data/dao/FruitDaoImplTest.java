package com.example.cleanarchitecture.data.dao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertNotNull;

public class FruitDaoImplTest {

    private FruitDao fruitDao;
    private int id;

    @Before
    public void setup(){
        fruitDao = new FruitDaoImpl();
        id = new Random().nextInt(14);
    }

    @After
    public void tearDown(){
        fruitDao = null;
    }

    @Test
    public void whenIdCorrectGetFruitById(){assertNotNull(fruitDao.getFruitById(id));}

    @Test(expected = IndexOutOfBoundsException.class)
    public void whenIdWrongThrowExcception(){fruitDao.getFruitById(-1);}
}
