package com.example.Turizm.controller;

import com.example.Turizm.entity.Tour;
import com.example.Turizm.model.TourCreateModel;
import com.example.Turizm.service.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tour")
@RequiredArgsConstructor
public class TourController {

    private final TourService tourService;

    @PostMapping("/create")
    public ResponseEntity<Tour> createTour(@RequestBody TourCreateModel tourCreateModel) {
        return ResponseEntity.ok(tourService.create(tourCreateModel));
    }
}
