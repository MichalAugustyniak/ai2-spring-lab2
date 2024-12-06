package com.kct.ai2lab2.repository;

import com.kct.ai2lab2.model.Location;
import com.kct.ai2lab2.model.Measurement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.time.LocalDate;

@RepositoryRestResource
public interface MeasurementRepository extends JpaRepository<Measurement, Long> {
    public Page<Measurement> findAllByDateGreaterThanEqualAndLocation(
            Pageable pageable,
            LocalDate date,
            Location location
    );
}
