package ar.com.tacsutn.grupo1.eventapp.repositories;

import ar.com.tacsutn.grupo1.eventapp.models.Event;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//public class EventRepositoryTest {
//    private Event event1, event2;
//    private List<Event> events;
//    private EventRepository eventRepository;
//
//    @Before
//    public void before() {
//        event1 = new Event("0", "Event 1", "Null");
//        event2 = new Event("1", "Event 2", "Null", LocalDateTime.now().minusDays(5));
//
//        events = new ArrayList<>();
//
//        events.add(event1);
//        events.add(event2);
//
//        eventRepository = new EventRepository(events);
//    }
//
//    @Test
//    public void shouldGetAllEventsInRange() {
//        LocalDateTime from = LocalDateTime.MIN;
//        LocalDateTime to = LocalDateTime.MAX;
//
//        assertEquals(2, eventRepository.getEventsCountBetween(from, to));
//    }
//
//    @Test
//    public void shouldGetSomeEventsInRange() {
//        LocalDateTime from = LocalDateTime.MIN;
//        LocalDateTime to = LocalDateTime.now().minusDays(2);
//
//        assertEquals(1, eventRepository.getEventsCountBetween(from, to));
//    }
//
//    @Test
//    public void shouldNotGetAnyEvent() {
//        LocalDateTime from = LocalDateTime.MAX;
//        LocalDateTime to = LocalDateTime.MAX;
//
//        assertEquals(0, eventRepository.getEventsCountBetween(from, to));
//    }
//}
