import org.junit.jupiter.api.Test;
import udpm.hn.server.kiemthu.entity.BaiHat;
import udpm.hn.server.kiemthu.ulitily.BaiHatService;

import static org.junit.jupiter.api.Assertions.*;

public class BaiHatServiceTest {

    BaiHatService service = new BaiHatService();

    @Test
    void testThemThanhCong() {
        BaiHat bh = new BaiHat("BH01","Anh sai rồi","Sơn Tùng",3.5f,"Pop");
        assertTrue(service.them(bh));
    }

    @Test
    void testThoiLuongMin() {
        BaiHat bh = new BaiHat("BH02","Song","Ca Si",2.0f,"Pop");
        assertTrue(service.them(bh));
    }

    @Test
    void testThoiLuongMax() {
        BaiHat bh = new BaiHat("BH03","Song","Ca Si",5.59f,"Pop");
        assertTrue(service.them(bh));
    }

    @Test
    void testThoiLuongSai() {
        BaiHat bh = new BaiHat("BH04","Song","Ca Si",1.5f,"Pop");
        assertFalse(service.them(bh));
    }

    @Test
    void testMaRong() {
        BaiHat bh = new BaiHat("","Song","Ca Si",3.0f,"Pop");
        assertFalse(service.them(bh));
    }

}