package rocketseat.com.passin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rocketseat.com.passin.domain.attendee.Attendee;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, String> {
    public List<Attendee> findByEventId(String eventId);
    public Optional<Attendee> findByEventIdAndEmail(String eventId, String email);
}
