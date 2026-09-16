public class BaiThucHanh04 {

    // 1. Tinh chu vi hinh chu nhat
    public static double tinhChuViHinhChuNhat(double chieuDai, double chieuRong) {

        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException(
                    "Chieu dai va chieu rong phai lon hon 0"
            );
        }

        return 2 * (chieuDai + chieuRong);
    }


    // 2. Tinh dien tich hinh chu nhat
    public static double tinhDienTichHinhChuNhat(double chieuDai, double chieuRong) {

        if (chieuDai <= 0 || chieuRong <= 0) {
            throw new IllegalArgumentException(
                    "Chieu dai va chieu rong phai lon hon 0"
            );
        }

        return chieuDai * chieuRong;
    }


    // 3. Giai phuong trinh bac hai
    public static String giaiPhuongTrinhBac2(
            double a,
            double b,
            double c) {

        // Truong hop a = 0
        if (a == 0) {

            // Truong hop a = 0 va b = 0
            if (b == 0) {

                // a = 0, b = 0, c = 0
                if (c == 0) {
                    return "Vo so nghiem";
                }

                // a = 0, b = 0, c != 0
                return "Vo nghiem";
            }

            // a = 0, b != 0
            double x = -c / b;

            return "Mot nghiem: x = " + x;
        }


        // Tinh delta
        double delta = b * b - 4 * a * c;


        // Delta < 0
        if (delta < 0) {
            return "Vo nghiem";
        }


        // Delta = 0
        if (delta == 0) {

            double x = -b / (2 * a);

            return "Nghiem kep: x = " + x;
        }


        // Delta > 0
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        return "Hai nghiem: x1 = " + x1 + ", x2 = " + x2;
    }


    // 4. Tinh so ngay trong thang
    public static int tinhSoNgayTrongThang(int thang, int nam) {

        if (thang < 1 || thang > 12) {
            throw new IllegalArgumentException(
                    "Thang phai tu 1 den 12"
            );
        }

        switch (thang) {

            case 2:

                // Nam chia het cho 400
                if (nam % 400 == 0) {
                    return 29;
                }

                // Nam chia het cho 100
                if (nam % 100 == 0) {
                    return 28;
                }

                // Nam chia het cho 4
                if (nam % 4 == 0) {
                    return 29;
                }

                return 28;


            case 4:
            case 6:
            case 9:
            case 11:
                return 30;


            default:
                return 31;
        }
    }


    // 5. Kiem tra so nguyen to
    public static boolean laSoNguyenTo(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


    // 6. Tinh tong xen ke
    // S = 1 - 2 + 3 - 4 + ... + n
    public static int tinhTongXenKe(int n) {

        if (n < 1) {
            throw new IllegalArgumentException(
                    "n phai lon hon hoac bang 1"
            );
        }

        int tong = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                tong -= i;
            } else {
                tong += i;
            }
        }

        return tong;
    }


    // 7. Tim UCLN
    public static int timUCLN(int a, int b) {

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 && b == 0) {
            throw new IllegalArgumentException(
                    "Khong ton tai UCLN cua 0 va 0"
            );
        }

        while (b != 0) {

            int temp = b;

            b = a % b;

            a = temp;
        }

        return a;
    }


    // 8. Tinh giai thua
    public static long tinhGiaiThua(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "n phai lon hon hoac bang 0"
            );
        }

        long giaiThua = 1;

        for (int i = 1; i <= n; i++) {

            giaiThua *= i;
        }

        return giaiThua;
    }


    // Tinh S = 1! + 2! + 3! + ... + n!
    public static long tinhTongGiaiThua(int n) {

        if (n < 0) {
            throw new IllegalArgumentException(
                    "n phai lon hon hoac bang 0"
            );
        }

        long tong = 0;

        for (int i = 1; i <= n; i++) {

            tong += tinhGiaiThua(i);
        }

        return tong;
    }
}