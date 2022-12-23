package com.whathebea.timetrack.timetrack.model;

import jakarta.persistence.*;
import org.springframework.scheduling.config.Task;

import java.time.Duration;
import java.time.LocalDateTime;

@Entity
public class TimeEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "task")
    private Task task;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Duration duration;

    public TimeEntry() {
    }

    public TimeEntry(Task task, LocalDateTime startTime, LocalDateTime endTime, Duration duration) {
        this.task = task;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = duration;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
