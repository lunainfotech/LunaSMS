package com.kamkanakdurga.sms.event.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.EventAttachment;

public interface EventAttachmentRepository extends JpaRepository<EventAttachment, Integer> {
	List<EventAttachment> findByEventId(BigInteger id);

}
