package com.example.lazycolumn.repository

import com.example.lazycolumn.model.Person

class PersonRepo {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                0,
                "John",
                "Doe",
                20
            ),
            Person(
                1,
                "Maria",
                "Doe",
                20
            ),
            Person(
                2,
                "travis",
                "Doe",
                20
            ),
            Person(
                3,
                "eren",
                "jaeger",
                20
            ),
            Person(
                4,
                "mikasa",
                "eren",
                20
            ),
            Person(
                5,
                "death",
                "note",
                20
            ),
            Person(
                6,
                "John",
                "Doe",
                20
            ),
            Person(
                7,
                "Maria",
                "Doe",
                20
            ),
            Person(
                8,
                "travis",
                "Doe",
                20
            ),
            Person(
                9,
                "eren",
                "jaeger",
                20
            ),
            Person(
                10,
                "mikasa",
                "eren",
                20
            ),
        )
    }
}