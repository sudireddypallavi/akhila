package com.example.demoTeegala.controller;

import com.example.demoTeegala.model.Placement;
import com.example.demoTeegala.services.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PlacementController {

    @Autowired
    private PlacementService placementService;

    // Add a single placement
    @PostMapping("/addPlacement")
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }

    //  Add multiple placements
    @PostMapping("/addPlacements")
    public List<Placement> addPlacements(@RequestBody List<Placement> placements) {
        return placementService.saveAllPlacements(placements);
    }

    //  Get placement by ID
    @GetMapping("/getPlacement/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id);
    }

    //  Get all placements
    @GetMapping("/getAllPlacements")
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    // Update placement by ID
    @PutMapping("/updatePlacement/{id}")
    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return placementService.updatePlacement(id, placement);
    }

    //  Delete placement by ID
    @DeleteMapping("/deletePlacement/{id}")
    public String deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
        return "Placement with ID " + id + " deleted successfully";
    }
}