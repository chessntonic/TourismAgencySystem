package com.TourismAgencySystem.Model;

import com.TourismAgencySystem.Helper.DBConnector;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeOp {
    public static ArrayList<Hotel> getList() {
        ArrayList<Hotel> hotelList = new ArrayList<>();
        String query = "SELECT * FROM hotel";
        Hotel obj;
        try {
            Statement st = DBConnector.getInstance().createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                obj = new Hotel();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("hotel_name"));
                obj.setCity(rs.getString("city"));
                obj.setDistrict(rs.getString("district"));
                obj.setStar(rs.getInt("star"));
                obj.setPhoneNumber(rs.getString("hotel_phone"));
                obj.setAddress(rs.getString("address"));
                obj.setEmail(rs.getString("hotel_email"));
                obj.setParking(rs.getString("parking"));
                obj.setWifi(rs.getString("wifi"));
                obj.setGym(rs.getString("gym"));
                obj.setPool(rs.getString("pool"));
                obj.setConcierge(rs.getString("concierge"));
                obj.setSpa(rs.getString("spa"));
                obj.setRoomService(rs.getString("room_service"));
                hotelList.add(obj);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return hotelList;
    }
}
