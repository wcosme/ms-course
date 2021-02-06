package com.wg.rhworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wg.rhworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
