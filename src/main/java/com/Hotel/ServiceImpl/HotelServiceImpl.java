package com.Hotel.ServiceImpl;

import com.Hotel.Entity.Hotel;
import com.Hotel.Exception.CustomException;
import com.Hotel.Repository.HotelRepo;
import com.Hotel.Service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepo hotelRepo;
    @Override
    public Hotel createHotel(Hotel hotel) {
        return hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> getHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public Hotel getHotelById(Long id) {
        return hotelRepo.findById(id).orElseThrow(()->new CustomException("Hotel ID not found"));
    }

    @Override
    public void deleteHotel(Long id) {
        hotelRepo.deleteById(id);
    }

    @Override
    public Hotel updateHotel(Long id, Hotel hotel) {
        Hotel hotelById = getHotelById(id);
        if(hotelById==null) return null;
        hotelById.setName(hotel.getName());
        hotelById.setAbout(hotel.getAbout());
        hotelById.setLocation(hotel.getLocation());
        return hotelRepo.save(hotelById);
    }
}
