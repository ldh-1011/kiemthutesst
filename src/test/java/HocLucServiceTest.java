import org.junit.jupiter.api.Test;
import udpm.hn.server.kiemthu.ulitily.HocLucService;
import static org.junit.jupiter.api.Assertions.*;

public class HocLucServiceTest {

    HocLucService service = new HocLucService();

    @Test
    void testXuatSac() {
        assertEquals("Xuất sắc", service.xepLoai(9.5));
    }

    @Test
    void testGioi() {
        assertEquals("Giỏi", service.xepLoai(8.0));
    }









    @Test
    void testGioiBoundary() {
        assertEquals("Giỏi", service.xepLoai(7.0));
    }

    @Test
    void testTrungBinh() {
        assertEquals("Trung bình", service.xepLoai(6.0));
    }

    @Test
    void testYeu() {
        assertEquals("Yếu", service.xepLoai(4.5));
    }

}