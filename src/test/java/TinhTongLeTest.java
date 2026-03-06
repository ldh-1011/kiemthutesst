import org.junit.jupiter.api.Test;
import udpm.hn.server.kiemthu.ulitily.TinhTongLe;

import static org.junit.jupiter.api.Assertions.*;

public class TinhTongLeTest {

    TinhTongLe service = new TinhTongLe();

    @Test
    void testNBang10() {
        assertEquals(25, service.tinhTongLe(10));
    }

    @Test
    void testNBang1() {
        assertEquals(1, service.tinhTongLe(1));
    }

    @Test
    void testNAm() {
        assertEquals(0, service.tinhTongLe(-5));
    }

    @Test
    void testNBang0() {
        assertEquals(0, service.tinhTongLe(0));
    }

    @Test
    void testNBang5() {
        assertEquals(9, service.tinhTongLe(5));
    }



}