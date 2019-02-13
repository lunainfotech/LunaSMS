package com.kamkanakdurga.sms.event.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

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
					+ "E.eventDateß "
					+ "FROM Event AS E "
			)
	
	List<Event> findAllEventRecords(int Offset, int limit);
}
