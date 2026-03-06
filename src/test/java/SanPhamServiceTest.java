import org.junit.jupiter.api.Test;
import udpm.hn.server.kiemthu.entity.SanPham;
import udpm.hn.server.kiemthu.ulitily.SanPhamService;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class SanPhamServiceTest {

    SanPhamService service;

    @BeforeEach
    void setup() {
        service = new SanPhamService();
        service.list.add(new SanPham("SP01", "Laptop", 2, 15000, 10, "Điện tử"));
        service.list.add(new SanPham("SP02", "Chuột", 1, 200, 50, "Phụ kiện"));
    }

    @Test
    void updateThanhCong() {
        SanPham sp = new SanPham("SP01", "Laptop Dell", 3, 20000, 5, "Điện tử");
        assertTrue(service.update(sp));
    }

    @Test
    void updateMaKhongTonTai() {
        SanPham sp = new SanPham("SP99", "ABC", 1, 100, 1, "Test");
        assertFalse(service.update(sp));
    }

    @Test
    void updateSanPhamNull() {
        assertFalse(service.update(null));
    }

    @Test
    void updateMaRong() {
        SanPham sp = new SanPham("", "ABC", 1, 100, 1, "Test");
        assertFalse(service.update(sp));
    }

    @Test
    void updateGiaAm() {
        SanPham sp = new SanPham("SP01", "ABC", 1, -100, 1, "Test");
        assertFalse(service.update(sp));
    }
}