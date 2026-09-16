import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaiThucHanh04Test {

    // =====================================================
    // 1. TEST CHU VI HINH CHU NHAT
    // =====================================================

    @Test
    void testTinhChuViHopLe() {
        assertEquals(
                14.0,
                BaiThucHanh04.tinhChuViHinhChuNhat(5, 2)
        );
    }

    @Test
    void testTinhChuViChieuDaiBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhChuViHinhChuNhat(0, 2)
        );
    }

    @Test
    void testTinhChuViChieuRongBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhChuViHinhChuNhat(5, 0)
        );
    }


    // =====================================================
    // 2. TEST DIEN TICH HINH CHU NHAT
    // =====================================================

    @Test
    void testTinhDienTichHopLe() {
        assertEquals(
                10.0,
                BaiThucHanh04.tinhDienTichHinhChuNhat(5, 2)
        );
    }

    @Test
    void testTinhDienTichChieuDaiBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhDienTichHinhChuNhat(0, 2)
        );
    }

    @Test
    void testTinhDienTichChieuRongBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhDienTichHinhChuNhat(5, 0)
        );
    }


    // =====================================================
    // 3. TEST PHUONG TRINH BAC HAI
    // =====================================================

    // a = 0, b = 0, c = 0
    @Test
    void testPhuongTrinhVoSoNghiem() {
        assertEquals(
                "Vo so nghiem",
                BaiThucHanh04.giaiPhuongTrinhBac2(0, 0, 0)
        );
    }

    // a = 0, b = 0, c != 0
    @Test
    void testPhuongTrinhVoNghiem() {
        assertEquals(
                "Vo nghiem",
                BaiThucHanh04.giaiPhuongTrinhBac2(0, 0, 5)
        );
    }

    // a = 0, b != 0
    @Test
    void testPhuongTrinhMotNghiem() {
        assertEquals(
                "Mot nghiem: x = 2.0",
                BaiThucHanh04.giaiPhuongTrinhBac2(0, 2, -4)
        );
    }

    // Delta < 0
    @Test
    void testPhuongTrinhDeltaAm() {
        assertEquals(
                "Vo nghiem",
                BaiThucHanh04.giaiPhuongTrinhBac2(1, 2, 5)
        );
    }

    // Delta = 0
    @Test
    void testPhuongTrinhNghiemKep() {
        assertEquals(
                "Nghiem kep: x = 1.0",
                BaiThucHanh04.giaiPhuongTrinhBac2(1, -2, 1)
        );
    }

    // Delta > 0
    @Test
    void testPhuongTrinhHaiNghiem() {
        assertEquals(
                "Hai nghiem: x1 = 2.0, x2 = 1.0",
                BaiThucHanh04.giaiPhuongTrinhBac2(1, -3, 2)
        );
    }


    // =====================================================
    // 4. TEST SO NGAY TRONG THANG
    // =====================================================

    // Nam chia het cho 400
    @Test
    void testNamChiaHetCho400() {
        assertEquals(
                29,
                BaiThucHanh04.tinhSoNgayTrongThang(2, 2000)
        );
    }

    // Nam chia het cho 100
    @Test
    void testNamChiaHetCho100() {
        assertEquals(
                28,
                BaiThucHanh04.tinhSoNgayTrongThang(2, 1900)
        );
    }

    // Nam chia het cho 4
    @Test
    void testNamChiaHetCho4() {
        assertEquals(
                29,
                BaiThucHanh04.tinhSoNgayTrongThang(2, 2024)
        );
    }

    // Nam khong chia het cho 4
    @Test
    void testNamKhongNhuan() {
        assertEquals(
                28,
                BaiThucHanh04.tinhSoNgayTrongThang(2, 2023)
        );
    }

    // Thang co 30 ngay
    @Test
    void testThang30Ngay() {
        assertEquals(
                30,
                BaiThucHanh04.tinhSoNgayTrongThang(4, 2024)
        );
    }

    // Thang co 31 ngay
    @Test
    void testThang31Ngay() {
        assertEquals(
                31,
                BaiThucHanh04.tinhSoNgayTrongThang(1, 2024)
        );
    }

    // Thang khong hop le
    @Test
    void testThangBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhSoNgayTrongThang(0, 2024)
        );
    }

    @Test
    void testThangLonHon12() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhSoNgayTrongThang(13, 2024)
        );
    }


    // =====================================================
    // 5. TEST SO NGUYEN TO
    // =====================================================

    @Test
    void testSoNhoHon2() {
        assertFalse(
                BaiThucHanh04.laSoNguyenTo(1)
        );
    }

    @Test
    void testSo2() {
        assertTrue(
                BaiThucHanh04.laSoNguyenTo(2)
        );
    }

    @Test
    void testSo3() {
        assertTrue(
                BaiThucHanh04.laSoNguyenTo(3)
        );
    }

    @Test
    void testSo4KhongNguyenTo() {
        assertFalse(
                BaiThucHanh04.laSoNguyenTo(4)
        );
    }

    @Test
    void testSo9KhongNguyenTo() {
        assertFalse(
                BaiThucHanh04.laSoNguyenTo(9)
        );
    }

    @Test
    void testSo17NguyenTo() {
        assertTrue(
                BaiThucHanh04.laSoNguyenTo(17)
        );
    }


    // =====================================================
    // 6. TEST TONG XEN KE
    // S = 1 - 2 + 3 - 4 + ... + n
    // =====================================================

    @Test
    void testTongXenKeN1() {
        assertEquals(
                1,
                BaiThucHanh04.tinhTongXenKe(1)
        );
    }

    @Test
    void testTongXenKeN2() {
        assertEquals(
                -1,
                BaiThucHanh04.tinhTongXenKe(2)
        );
    }

    @Test
    void testTongXenKeN5() {
        assertEquals(
                3,
                BaiThucHanh04.tinhTongXenKe(5)
        );
    }

    @Test
    void testTongXenKeN0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhTongXenKe(0)
        );
    }


    // =====================================================
    // 7. TEST UCLN
    // =====================================================

    @Test
    void testUCLNHaiSo() {
        assertEquals(
                4,
                BaiThucHanh04.timUCLN(12, 8)
        );
    }

    @Test
    void testUCLNChiaHet() {
        assertEquals(
                5,
                BaiThucHanh04.timUCLN(5, 10)
        );
    }

    @Test
    void testUCLNSoDauBang0() {
        assertEquals(
                5,
                BaiThucHanh04.timUCLN(0, 5)
        );
    }

    @Test
    void testUCLNSoSauBang0() {
        assertEquals(
                5,
                BaiThucHanh04.timUCLN(5, 0)
        );
    }

    @Test
    void testUCLNCaHaiBang0() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.timUCLN(0, 0)
        );
    }


    // =====================================================
    // 8. TEST GIAI THUA
    // =====================================================

    @Test
    void testGiaiThua0() {
        assertEquals(
                1,
                BaiThucHanh04.tinhGiaiThua(0)
        );
    }

    @Test
    void testGiaiThua1() {
        assertEquals(
                1,
                BaiThucHanh04.tinhGiaiThua(1)
        );
    }

    @Test
    void testGiaiThua5() {
        assertEquals(
                120,
                BaiThucHanh04.tinhGiaiThua(5)
        );
    }

    @Test
    void testGiaiThuaAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhGiaiThua(-1)
        );
    }


    // =====================================================
    // TONG GIAI THUA
    // S = 1! + 2! + 3! + ... + n!
    // =====================================================

    @Test
    void testTongGiaiThua0() {
        assertEquals(
                0,
                BaiThucHanh04.tinhTongGiaiThua(0)
        );
    }

    @Test
    void testTongGiaiThua4() {
        assertEquals(
                33,
                BaiThucHanh04.tinhTongGiaiThua(4)
        );
    }

    @Test
    void testTongGiaiThuaAm() {
        assertThrows(
                IllegalArgumentException.class,
                () -> BaiThucHanh04.tinhTongGiaiThua(-1)
        );
    }
}