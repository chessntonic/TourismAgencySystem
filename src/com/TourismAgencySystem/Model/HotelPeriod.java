package com.TourismAgencySystem.Model;

import java.util.Date;

public class HotelPeriod {
    private int id;
    private int hotelId;
    private Date seasonStart;
    private Date seasonEnd;
    private Date offSeasonStart;
    private Date offSeasonEnd;

    public HotelPeriod(int id, int hotelId, Date seasonStart, Date seasonEnd, Date offSeasonStart, Date offSeasonEnd) {
        this.id = id;
        this.hotelId = hotelId;
        this.seasonStart = seasonStart;
        this.seasonEnd = seasonEnd;
        this.offSeasonStart = offSeasonStart;
        this.offSeasonEnd = offSeasonEnd;
    }
    public HotelPeriod(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public Date getSeasonStart() {
        return seasonStart;
    }

    public void setSeasonStart(Date seasonStart) {
        this.seasonStart = seasonStart;
    }

    public Date getSeasonEnd() {
        return seasonEnd;
    }

    public void setSeasonEnd(Date seasonEnd) {
        this.seasonEnd = seasonEnd;
    }

    public Date getOffSeasonStart() {
        return offSeasonStart;
    }

    public void setOffSeasonStart(Date offSeasonStart) {
        this.offSeasonStart = offSeasonStart;
    }

    public Date getOffSeasonEnd() {
        return offSeasonEnd;
    }

    public void setOffSeasonEnd(Date offSeasonEnd) {
        this.offSeasonEnd = offSeasonEnd;
    }
}
