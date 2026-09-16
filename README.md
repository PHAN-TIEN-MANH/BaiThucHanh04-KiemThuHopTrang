# BÀI THỰC HÀNH 04 - KIỂM THỬ HỘP TRẮNG

## 1. Thông tin bài thực hành

- Môn học: Kiểm thử phần mềm
- Bài thực hành: Bài thực hành 04 - Kiểm thử hộp trắng
- Ngôn ngữ: Java
- Framework kiểm thử: JUnit 5
- Công cụ quản lý dự án: Maven
- Công cụ đo độ bao phủ: JaCoCo
- Phương pháp: White-box Testing

---

## 2. Mục tiêu

Bài thực hành nhằm áp dụng phương pháp kiểm thử hộp trắng để phân tích và kiểm thử các chương trình Java.

Các mục tiêu chính:

- Kiểm thử các câu lệnh trong chương trình.
- Kiểm thử các nhánh điều kiện.
- Kiểm thử các vòng lặp.
- Kiểm thử các điều kiện biên.
- Kiểm thử các trường hợp lỗi và ngoại lệ.
- Sử dụng JUnit 5 để tự động hóa kiểm thử.
- Sử dụng JaCoCo để kiểm tra độ bao phủ mã nguồn.
- Ưu tiên đạt 100% Statement Coverage và 100% Branch Coverage.

---

## 3. Các chức năng được xây dựng

Chương trình gồm 8 nhóm chức năng:

### Chức năng 1: Tính chu vi hình chữ nhật

Công thức:

P = 2 × (chiều dài + chiều rộng)

Kiểm tra dữ liệu chiều dài và chiều rộng phải lớn hơn 0.

### Chức năng 2: Tính diện tích hình chữ nhật

Công thức:

S = chiều dài × chiều rộng

Kiểm tra dữ liệu chiều dài và chiều rộng phải lớn hơn 0.

### Chức năng 3: Giải phương trình bậc hai

Dạng phương trình:

ax² + bx + c = 0

Chương trình xử lý:

- Vô số nghiệm.
- Vô nghiệm.
- Phương trình bậc nhất.
- Phương trình bậc hai có delta < 0.
- Phương trình bậc hai có delta = 0.
- Phương trình bậc hai có delta > 0.

### Chức năng 4: Tính số ngày trong tháng

Chương trình xác định số ngày dựa trên:

- Tháng hợp lệ từ 1 đến 12.
- Năm nhuận chia hết cho 400.
- Năm chia hết cho 100 nhưng không chia hết cho 400.
- Năm chia hết cho 4.
- Năm không chia hết cho 4.
- Tháng có 30 ngày.
- Tháng có 31 ngày.

### Chức năng 5: Kiểm tra số nguyên tố

Kiểm tra một số nguyên n có phải số nguyên tố hay không.

Các trường hợp được kiểm thử:

- n < 2.
- Số nguyên tố.
- Số hợp số.
- Trường hợp vòng lặp không thực hiện.
- Trường hợp vòng lặp thực hiện.

### Chức năng 6: Tính tổng xen kẽ

Công thức:

S = 1 - 2 + 3 - 4 + ... + n

Chương trình kiểm tra n phải lớn hơn hoặc bằng 1.

### Chức năng 7: Tìm UCLN

Sử dụng thuật toán Euclid để tìm ước chung lớn nhất của hai số.

Các trường hợp được kiểm thử:

- Hai số dương.
- Một số bằng 0.
- Hai số bằng 0.
- Các trường hợp vòng lặp thực hiện nhiều lần.

### Chức năng 8: Tính tổng giai thừa

Gồm hai hàm:

- Tính n!
- Tính S = 1! + 2! + ... + n!

Các trường hợp biên và lỗi được kiểm thử bằng JUnit.

---

## 4. Cấu trúc project

```text
BaiThucHanh04-KiemThuHopTrang
│
├── src
│   ├── main
│   │   └── java
│   │       └── BaiThucHanh04.java
│   │
│   └── test
│       └── java
│           └── BaiThucHanh04Test.java
│
├── testcases
│   └── testcases.md
│
├── .gitignore
├── pom.xml
└── README.md