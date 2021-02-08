package com.example.data.dao

import groovy.transform.Canonical
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity


/**
 * User's entity.
 * @author Jamil Kafi
 * @since 1.0.0
 */
@Canonical
@MappedEntity
class User {

    @Id
    @GeneratedValue(value = GeneratedValue.Type.IDENTITY)
    Long id

    String name

    String email

    String phone

    String address

    String login

    String password

    // @Column(name = "enabled", insertable = false, updatable = false)
    Integer enabled

}
