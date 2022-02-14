package com.example.demo.board.domain;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : Iphone
 * author     : MinHye_Sim
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09   MinHye_Sim   최초 생성
 * 아이폰은 CelPhone에서 검색(search)속성이 추가된다.
 *  * 잡스는 아이폰을 휴대폰으로 불리는 것을 거부했다. 그래서 KIND는 아이폰이다.
 */
public class IPhone extends CelPhone {
    public final static String KIND = "아이폰";
    protected String search;

    public IPhone(String company) {
        super(KIND,company,"이동중");
    }


    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return String.format("%s에서 만든 %s을 사용해서 %s중에 [뉴스]를 검색한다.",super.getCompany(),KIND,super.getMove(),search);
    }

}
