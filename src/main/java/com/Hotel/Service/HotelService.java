package com.Hotel.Service;

import com.Hotel.Entity.Hotel;

import java.util.List;


public interface HotelService {
    public Hotel createHotel(Hotel hotel);
    public List<Hotel> getHotel();
    public Hotel getHotelById(Long id);
    public void deleteHotel(Long id);
    public Hotel updateHotel(Long id,Hotel hotel);


}
