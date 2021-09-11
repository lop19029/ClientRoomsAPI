package com.dio.crud.saladereuniao.SalaDeReuniao.repository;

import com.dio.crud.saladereuniao.SalaDeReuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
