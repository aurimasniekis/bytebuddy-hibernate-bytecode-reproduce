package com.example.bytebuddyhibernatebytecodereproduce.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@MappedSuperclass
@NoArgsConstructor
public abstract class AbstractEventStorageEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  protected long id;

  protected String eventName;

  protected long timestamp;

  protected String eventType;

  protected boolean durable;

  @Lob
  @Column(length = Integer.MAX_VALUE)
  protected String serializedEvent;

  public long getTimestamp() {
    return timestamp;
  }

  public String getEventName() {
    return eventName;
  }

  public boolean isDurable() {
    return durable;
  }

  public String getEventType() {
    return eventType;
  }

  public String getSerializedEvent() {
    return serializedEvent;
  }

  public void setSerializedEvent(String serializedEvent) {
    this.serializedEvent = serializedEvent;
  }
}
