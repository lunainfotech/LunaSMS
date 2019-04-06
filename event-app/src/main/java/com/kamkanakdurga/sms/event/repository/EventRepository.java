package com.kamkanakdurga.sms.event.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.entities.Assignment;
import com.kamkanakdurga.sms.library.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{
	@Query(
			"SELECT "
					+ "E.id, "
					+ "E.schoolCode, "
					+ "E.eventTitle, "
					+ "E.eventContent, "
					+ "E.eventCategory, "
					+ "E.eventStatus, "
					+ "E.eventDate "
					+ "FROM Event AS E "
					+ "WHERE E.schoolCode = ?1"
			)
	
	Page<Event> findAllEventRecords(BigInteger schoolCode, Pageable pageable);

	Event findById(BigInteger id);
	
	List<Event> deleteById(BigInteger id);
}
