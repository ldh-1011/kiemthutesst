package udpm.hn.server.kiemthu.ulitily;

import udpm.hn.server.kiemthu.entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {

    List<BaiHat> list = new ArrayList<>();

    public boolean them(BaiHat bh) {

        if (bh == null) {
            throw new IllegalArgumentException("Bài hát không được null");
        }

        if (bh.getMa() == null || bh.getMa().trim().isEmpty()) {
            throw new IllegalArgumentException("Mã bài hát không được để trống");
        }

        if (bh.getTen() == null || bh.getTen().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên bài hát không được để trống");
        }

        if (bh.getTenCaSi() == null || bh.getTenCaSi().trim().isEmpty()) {
            throw new IllegalArgumentException("Tên ca sĩ không được để trống");
        }

        if (bh.getTheLoai() == null || bh.getTheLoai().trim().isEmpty()) {
            throw new IllegalArgumentException("Thể loại không được để trống");
        }

        if (bh.getThoiLuong() < 2 || bh.getThoiLuong() > 5.5) {
            throw new IllegalArgumentException("Thời lượng phải từ 2 đến 5.5 phút");
        }

        list.add(bh);
        return true;



    }
}