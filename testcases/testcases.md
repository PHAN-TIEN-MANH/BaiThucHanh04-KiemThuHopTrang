# DANH SÁCH TEST CASE - KIỂM THỬ HỘP TRẮNG

## 1. Tính chu vi hình chữ nhật

| TC | Dữ liệu đầu vào | Kết quả mong đợi | Loại kiểm thử |
|---|---|---|---|
| CV01 | 5, 2 | 14 | Hợp lệ |
| CV02 | 0, 2 | IllegalArgumentException | Biên/Lỗi |
| CV03 | 5, 0 | IllegalArgumentException | Biên/Lỗi |

---

## 2. Tính diện tích hình chữ nhật

| TC | Dữ liệu đầu vào | Kết quả mong đợi | Loại kiểm thử |
|---|---|---|---|
| DT01 | 5, 2 | 10 | Hợp lệ |
| DT02 | 0, 2 | IllegalArgumentException | Biên/Lỗi |
| DT03 | 5, 0 | IllegalArgumentException | Biên/Lỗi |

---

## 3. Giải phương trình bậc hai

| TC | a | b | c | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---:|---|---|
| PT01 | 0 | 0 | 0 | Vô số nghiệm | Nhánh điều kiện |
| PT02 | 0 | 0 | 5 | Vô nghiệm | Nhánh điều kiện |
| PT03 | 0 | 2 | -4 | Một nghiệm: x = 2.0 | Hợp lệ |
| PT04 | 1 | 2 | 5 | Vô nghiệm | Delta < 0 |
| PT05 | 1 | -2 | 1 | Nghiệm kép: x = 1.0 | Delta = 0 |
| PT06 | 1 | -3 | 2 | Hai nghiệm: x1 = 2.0, x2 = 1.0 | Delta > 0 |

---

## 4. Tính số ngày trong tháng

| TC | Tháng | Năm | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---:|---|
| NT01 | 2 | 2000 | 29 | Chia hết cho 400 |
| NT02 | 2 | 1900 | 28 | Chia hết cho 100 |
| NT03 | 2 | 2024 | 29 | Chia hết cho 4 |
| NT04 | 2 | 2023 | 28 | Không chia hết cho 4 |
| NT05 | 4 | 2024 | 30 | Tháng 30 ngày |
| NT06 | 1 | 2024 | 31 | Tháng 31 ngày |
| NT07 | 0 | 2024 | IllegalArgumentException | Biên/Lỗi |
| NT08 | 13 | 2024 | IllegalArgumentException | Biên/Lỗi |

---

## 5. Kiểm tra số nguyên tố

| TC | n | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---|---|
| NT01 | 1 | false | Biên |
| NT02 | 2 | true | Biên/Vòng lặp |
| NT03 | 3 | true | Vòng lặp |
| NT04 | 4 | false | Hợp số |
| NT05 | 9 | false | Hợp số/Vòng lặp |
| NT06 | 17 | true | Số nguyên tố/Vòng lặp |

---

## 6. Tính tổng xen kẽ

Công thức:

**S = 1 - 2 + 3 - 4 + ... + n**

| TC | n | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---|
| XK01 | 1 | 1 | Biên/Vòng lặp |
| XK02 | 2 | -1 | Chẵn |
| XK03 | 5 | 3 | Lẻ/Vòng lặp |
| XK04 | 0 | IllegalArgumentException | Biên/Lỗi |

---

## 7. Tìm UCLN

| TC | a | b | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---:|---|
| UCLN01 | 12 | 8 | 4 | Vòng lặp |
| UCLN02 | 5 | 10 | 5 | Vòng lặp |
| UCLN03 | 0 | 5 | 5 | Biên |
| UCLN04 | 5 | 0 | 5 | Biên |
| UCLN05 | 0 | 0 | IllegalArgumentException | Lỗi |

---

## 8. Tính giai thừa

| TC | n | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---|
| GT01 | 0 | 1 | Biên/Vòng lặp 0 lần |
| GT02 | 1 | 1 | Vòng lặp |
| GT03 | 5 | 120 | Vòng lặp nhiều lần |
| GT04 | -1 | IllegalArgumentException | Lỗi |

---

## 9. Tính tổng giai thừa

Công thức:

**S = 1! + 2! + ... + n!**

| TC | n | Kết quả mong đợi | Loại kiểm thử |
|---|---:|---:|---|
| TGT01 | 0 | 0 | Biên |
| TGT02 | 4 | 33 | Vòng lặp |
| TGT03 | -1 | IllegalArgumentException | Lỗi |

---

# Tổng hợp kiểm thử

| Nhóm | Số test case |
|---|---:|
| Chu vi hình chữ nhật | 3 |
| Diện tích hình chữ nhật | 3 |
| Phương trình bậc hai | 6 |
| Số ngày trong tháng | 8 |
| Số nguyên tố | 6 |
| Tổng xen kẽ | 4 |
| UCLN | 5 |
| Giai thừa | 4 |
| Tổng giai thừa | 3 |
| **Tổng cộng** | **42** |

# Mục tiêu kiểm thử hộp trắng

Các test case được thiết kế để bao phủ:

- Các câu lệnh trong chương trình.
- Các nhánh điều kiện `if/else`.
- Các điều kiện biên.
- Các vòng lặp.
- Các trường hợp ngoại lệ.
- Các luồng xử lý hợp lệ và không hợp lệ.

Mục tiêu ưu tiên:

- Statement Coverage: 100%.
- Branch Coverage: 100%.