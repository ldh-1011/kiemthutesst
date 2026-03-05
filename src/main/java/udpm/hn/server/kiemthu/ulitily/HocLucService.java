package udpm.hn.server.kiemthu.ulitily;

public class HocLucService {
    public String xepLoai(double diem) {
        if (diem > 9.0) {
            return "Xuất sắc";
        } else if (diem >= 7.0) {
            return "Giỏi";
        } else if (diem >= 5.0) {
            return "Trung bình";
        } else {
            return "Yếu";
        }



    }






}
