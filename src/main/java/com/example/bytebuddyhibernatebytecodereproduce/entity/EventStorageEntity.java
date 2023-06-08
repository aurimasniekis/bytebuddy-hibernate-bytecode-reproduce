package com.example.bytebuddyhibernatebytecodereproduce.entity;

import com.example.bytebuddyhibernatebytecodereproduce.domain.AbstractEventStorageEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "event_storage")
@SuperBuilder
@NoArgsConstructor
public class EventStorageEntity extends AbstractEventStorageEntity {

}
