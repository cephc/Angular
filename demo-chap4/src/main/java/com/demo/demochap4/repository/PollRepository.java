package com.demo.demochap4.repository;

import com.demo.demochap4.domain.Poll;
import org.springframework.data.repository.CrudRepository;

public interface PollRepository extends CrudRepository<Poll, Long> {

}
