package com.whathebea.timetrack.timetrack.repository;

import com.whathebea.timetrack.timetrack.model.TimeEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeEntryRepository extends JpaRepository<TimeEntry, Long> {

}

