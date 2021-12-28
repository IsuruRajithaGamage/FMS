package com.example.FMS.repositories;

import com.example.FMS.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleMaintainRepository extends JpaRepository<VehicleMaintenance,Integer> {
}
