package udpm.hn.server.kiemthu.ulitily;

import udpm.hn.server.kiemthu.entity.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {

    public List<SanPham> list = new ArrayList<>();

    public boolean update(SanPham sp) {
        if (sp == null) {
            throw new RuntimeException("san pham khong duoc null");
        }
        if (sp.getMa() == null || sp.getMa().trim().isEmpty()) {
            throw new RuntimeException("ma san pham khong duoc e trong");
        }
        if (sp.getTen() == null || sp.getTen().trim().isEmpty()) {
            throw new RuntimeException("ten san pham khong duoc de trong");
        }
        if (sp.getGia() < 0) {
            throw new RuntimeException("gia phai lon khon 0");
        }
        if (sp.getSoLuong() < 0) {
            throw new RuntimeException("so luong phai lon hon 0");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMa().equals(sp.getMa())) {
                list.set(i, sp);
                return true;
            }
        }
        throw new RuntimeException("khong tin thay san phan can update");
    }
}