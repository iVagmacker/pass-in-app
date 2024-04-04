package rocketseat.com.passin.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rocketseat.com.passin.domain.checkIn.CheckIn;

@Repository
public interface CheckInRepository extends JpaRepository<CheckIn, Integer>{
  
  Optional<CheckIn> findByAttendeeId(String attendeedId);
}
