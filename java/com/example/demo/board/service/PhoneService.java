package com.example.demo.board.service;

import com.example.demo.board.domain.CelPhone;
import com.example.demo.board.domain.GalPhone;
import com.example.demo.board.domain.IPhone;
import com.example.demo.board.domain.Phone;

/**
 * packageName: com.example.demo.oop.service
 * fileName   : PhoneService
 * author     : MinHye_Sim
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09   MinHye_Sim   최초 생성
 */
public interface PhoneService {
    void usePhone(Phone phone);
    void useCelPhone(CelPhone celPhone);
    void useGalPhone(GalPhone galPhone);
    void useIPhone(IPhone iPhone);
}
