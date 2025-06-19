package com.Hotel.Controller;

import com.Hotel.Entity.Hotel;
import com.Hotel.ServiceImpl.HotelServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hotel")
public class HotelController {

    @Autowired
    private HotelServiceImpl hotelService;

    @GetMapping
    public List<Hotel> getHotel(){
        return hotelService.getHotel();
    }
    @GetMapping("/{id}")
    public Hotel getHotelByid(@PathVariable Long id){
        return hotelService.getHotelById(id);
    }
    @PostMapping
    public Hotel CreateHotel(@RequestBody Hotel hotel){
        return hotelService.createHotel(hotel);
    }
    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable Long id){
        hotelService.deleteHotel(id);
    }
    @PutMapping("/{id}")
    public Hotel updateHotel(@PathVariable Long id,@RequestBody Hotel hotel){
        return hotelService.updateHotel(id,hotel);
    }
}
