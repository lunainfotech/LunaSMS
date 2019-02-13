package com.kamkanakdurga.sms.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.EventCategory;

public interface EventCategoryRepository extends JpaRepository<EventCategory, Integer>{

}
