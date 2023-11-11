package com.example.Turizm.controller;

import com.example.Turizm.entity.BookingRequest;
import com.example.Turizm.model.BookingCreateModel;
import com.example.Turizm.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping("/reserve")
    public BookingRequest bookingReserve(@RequestBody BookingCreateModel bookingCreateModel){
        return bookingService.create(bookingCreateModel);
    }
}
