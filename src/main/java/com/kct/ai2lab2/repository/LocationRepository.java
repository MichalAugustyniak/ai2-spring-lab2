package com.kct.ai2lab2.repository;

import com.kct.ai2lab2.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@RepositoryRestResource
public interface LocationRepository extends JpaRepository<Location, Long> {
    public Page<Location> findAllByCountryCode(Pageable pageable, String countryCode);
    public Optional<Location> findByCity(String city);
}
