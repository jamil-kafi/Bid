package com.example.data.repo

import com.example.data.dao.User
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.Repository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository
import io.reactivex.Maybe
import io.reactivex.Single


/**
 * User CRUD operations.
 * @author Jamil Kafi
 * @since 1.0.0
 */
@Repository
@R2dbcRepository(dialect = Dialect.MYSQL)
interface UserRepository extends ReactiveStreamsCrudRepository<User, Long> {

    Single<Boolean> existsByEmailOrPhone(String email, String phone)

    Maybe<User> findByLoginAndPassword(String login, String password)

    Single<Integer> updateProfileById(@Id Long id,
                                      String email,
                                      String phone,
                                      String name,
                                      String address,
                                      String login,
                                      String password)

}