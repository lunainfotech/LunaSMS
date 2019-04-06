package com.kamkanakdurga.sms.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.event.dto.EventDTO;
import com.kamkanakdurga.sms.event.dto.HolidayDTO;
import com.kamkanakdurga.sms.event.dto.NoticeDTO;
import com.kamkanakdurga.sms.event.repository.EventAttachmentRepository;
import com.kamkanakdurga.sms.event.repository.EventCategoryRepository;
import com.kamkanakdurga.sms.event.repository.EventRepository;
import com.kamkanakdurga.sms.event.repository.HolidayRepository;
import com.kamkanakdurga.sms.event.repository.NoticeRepository;
import com.kamkanakdurga.sms.library.entities.Event;
import com.kamkanakdurga.sms.library.entities.EventAttachment;
import com.kamkanakdurga.sms.library.entities.EventCategory;
import com.kamkanakdurga.sms.library.entities.Holiday;
import com.kamkanakdurga.sms.library.entities.Notice;


@Service
public class EventService {
	@Autowired
	private HolidayRepository holidayRepository;
	
	@Autowired
	private EventRepository eventRepository;
	
	@Autowired
	private EventAttachmentRepository eventAttachmentRepository;
	
	@Autowired
	private EventCategoryRepository eventCategoryRepository;
	
	@Autowired
	private NoticeRepository noticeRepository;
	
	@SuppressWarnings("deprecation")
	public Page<HolidayDTO> findAllHolidayRecords(int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return holidayRepository.findAllHolidayRecords(new PageRequest(page,records));
	}	
	
	public Holiday saveHolidayRecord(Holiday holidayInfo) {

		Holiday result = holidayRepository.save(holidayInfo);
		return result;
	}
	
	public Holiday editHolidayRecord(Holiday holidayInfo) {
		Holiday record = new Holiday();

		//record = holidayRepositoryfindById(holidayInfo.getId());
		record.setId(holidayInfo.getId());
		record.setHolidayName(holidayInfo.getHolidayName());
		record.setHolidayFrom(holidayInfo.getHolidayFrom());
		record.setHolidayTo(holidayInfo.getHolidayTo());
		record.setActive(holidayInfo.getActive());
		
		Holiday updateHoliday = holidayRepository.save(record);
		return updateHoliday;
	}
	
	public void deleteHolidayRecord(int holidayId) {
		holidayRepository.deleteById(holidayId);
	}
	
	public List<EventCategory> getEventCategory(){
		List<EventCategory> result = eventCategoryRepository.findAll();
		return result;
	}
	
	public Event saveEvent(Event eventInfo) {

		Event result = eventRepository.save(eventInfo);
		return result;
	}
	/*
	public List<Event> getllEventRecords(int page, int limit) {
		int offset;
		
		if (page <= 1) {
			page = 1;
		} else {
			page--;
		}
		
		if (limit <= 0) {
			limit = 25;
		}
		
		offset = ( page - 1 ) * limit; 
				
		List<Event> result = eventRepository.findAllEventRecords(offset,limit);
		return result;
	}	
*/
	@SuppressWarnings("deprecation")
	public Page<Event> findAllEventRecords(BigInteger schoolCode, int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return eventRepository.findAllEventRecords(schoolCode, new PageRequest(page,records));
	}	

	public EventDTO getEventById(BigInteger eventId) {
		
		Event event = eventRepository.findById(eventId);
		List<EventAttachment> attachment = eventAttachmentRepository.findByEventId(eventId);
		
		EventDTO eventList = new EventDTO(
				event.getId(),
				event.getSchoolCode(),
				event.getEventTitle(),
				event.getEventContent(),
				event.getEventCategory(),
				event.getEventStatus(),
				event.getEventDate(),
				attachment
				);
	
		return eventList;
	}
	
	public void deleteEventRecord(BigInteger eventId) {
		eventRepository.deleteById(eventId);
	}
	
	@SuppressWarnings("deprecation")
	public Page<NoticeDTO> findAllNoticeRecords(BigInteger schoolCode, int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return noticeRepository.findAllNoticeRecords(schoolCode, new PageRequest(page,records));
	}
	
	public Notice saveNotice(Notice noticeInfo) {

		Notice result = noticeRepository.save(noticeInfo);
		return result;
	}
	
	public void deleteNoticeRecord(BigInteger noticeId) {
		noticeRepository.deleteById(noticeId);
	}
}
