package com.example.demo.board.service;

import com.example.demo.board.domain.CelPhone;
import com.example.demo.board.domain.GalPhone;
import com.example.demo.board.domain.IPhone;
import com.example.demo.board.domain.Phone;

/**
 * packageName: com.example.demo.oop.service
 * fileName   : PhoneServiceImpl
 * author     : MinHye_Sim
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09   MinHye_Sim   최초 생성
 */
public class PhoneServiceImpl implements PhoneService{
    @Override
    public void usePhone(Phone phone) {
        System.out.println(phone.toString());

    }

    @Override
    public void useCelPhone(CelPhone celPhone) {
        System.out.println(celPhone.toString());

    }

    @Override
    public void useGalPhone(GalPhone galPhone) {
        System.out.println(galPhone.toString());

    }

    @Override
    public void useIPhone(IPhone iPhone) {
        System.out.println(iPhone.toString());

    }
}
