package udpm.hn.server.kiemthu.ulitily;

public class TinhTongLe {

    public int tinhTongLe(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;

    }
}
