package com.lucasnscr.gcp.firestorestudy.repository;

import com.google.cloud.spring.data.firestore.FirestoreReactiveRepository;
import com.lucasnscr.gcp.firestorestudy.entity.User;

import reactor.core.publisher.Flux;

public interface UserRepository extends FirestoreReactiveRepository<User> {
	
	Flux<User> findByAge(int age);

}
