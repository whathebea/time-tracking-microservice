package com.whathebea.timetrack.timetrack.service;

import com.whathebea.timetrack.timetrack.model.TimeEntry;
import com.whathebea.timetrack.timetrack.repository.TimeEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TimeEntryService {
    @Autowired
    private TimeEntryRepository timeEntryRepository;

    public TimeEntryService(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    public TimeEntry createTimeEntry(TimeEntry timeEntry) {
        return timeEntryRepository.save(timeEntry);
    }

    public TimeEntry getTimeEntriesForTask(long taskId) {
        return timeEntryRepository.findById(taskId).get();
    }
}
