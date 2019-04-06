package com.kamkanakdurga.sms.cdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.EventAttachment;

public interface EventAttachmentRepository extends JpaRepository<EventAttachment, Integer> {

}
