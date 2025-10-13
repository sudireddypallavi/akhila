package com.example.demoTeegala.services;

import com.example.demoTeegala.model.Placement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demoTeegala.repository.PlacementRepository;
import java.util.List;
@Service
public class PlacementService {
	 @Autowired
	    private PlacementRepository placementRepository;

	    // Add new placement
	    public Placement addPlacement(Placement placement) {
	        return placementRepository.save(placement);
	    }

	    // Get all placements
	    public List<Placement> getAllPlacements() {
	        return placementRepository.findAll();
	    }
	  
	    // Get placement by ID
	    public Placement getPlacementById(Long id) {
	        return placementRepository.findById(id).orElse(null);
	    }
	    public List<Placement> saveAllPlacements(List<Placement> placements) {
	        return placementRepository.saveAll(placements);
	    }
	    // Update placement
	    public Placement updatePlacement(Long id, Placement placement) {
	        Placement existing = placementRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setName(placement.getName());
	            existing.setDate(placement.getDate());
	            existing.setQualification(placement.getQualification());
	            existing.setYear(placement.getYear());
	            existing.setCollege(placement.getCollege());
	            return placementRepository.save(existing);
	        }
	        return null;
	    }

	    // Delete placement
	    public void deletePlacement(Long id) {
	        placementRepository.deleteById(id);
	    }
}