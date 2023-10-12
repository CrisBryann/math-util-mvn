package com.crisbryann.mathutil.main;

import com.crisbryann.mathutil.core.MathUtility;

/**
 *
 * @author nguyenphuocthienan
 */
public class Main {
    public static void main(String[] args) {
        //Test case #1 xem mô tả chi tiết ở phần ghi chú
        int n = 0; //hàm ý kiểm tra 0!
        long expected = 1; //hàm ý rằng, hy vọng rằng n = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //thực tế là mấy, gọi hàm là biết ngay
        
        //So sánh giữa expected == actual hay không 
        System.out.println(n + "! -> expected: " + expected + " | actual: " + actual);
        
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n); //5!
        System.out.println(n + "! -> expected: " + expected + " | actual: " + actual);
        
    }
}


//DÂN DEV VIẾT RA CODE: HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM
//TEST CODE CỦA CHÍNH MÌNH LÀM RA
//LÀM SAO TEST CODE CỦA CHÍNH MÌNH
//CÓ 3 CÁCH
//CÁCH 1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM

//CÁCH 2: IN RA LOG FILE

//CÁCH 3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO - THƯ VIỆN ĐEM VÀO !!!!

//NHƯNG DÙ LÀ KIỂM THỬ THẾ NÀO THÌ CŨNG GỒM 3 CÔNG VIỆC
//THIẾT KẾ TEST CASE
//THỰC THI TEST CASE - TEST RUN
//GHI BUG NẾU CÓ = LOG BUG

//TEST CASE LÀ: BỘ DATA ĐƯA VÀO APP ĐỂ XEM APP HÀNH XỬ ĐÚNG K
//              KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ GIỐNG K
//              KÈM THÊM HƯỚNG DẪN SỬ DỤNG APP VỚI DATA ĐƯA VÀO
//              KÈM THÊM TRẠNG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI

//CẤU TRÚC CỦA 1 TEST CASE NHƯ SAU
//(DÙNG TRONG THỰC TẾ ĐI LÀM, VÀ DÙNG TRONG BÀI THI PE)

//MỘT TEST CASE GỒM NHỮNG INFO SAU:
//TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
//EXPECTED RESULT | STATUS (PASSED | FAILED)

//Test case là tình huống xài app với bộ data đưa vào và giá trị kì vọng app phải trả về
//Giờ ta muốn test hàm getF() ta phải thiết kế các test case coi xem hàm trả về đúng ko

//TEST CASE #1: VERIFY getFactorial(with n = 0) check 0! correct or not ?
//TEST STEPS/PROCEDURES 
//          1. Given n = 0
//          2. Call/invoke getFactorial(n = 0)

//EXPECTED RESULT:
//          the method must return 1 as the result of 0!

//STATUS: PASSED | FAILED, just waiting the method returns value
//                          ĐÓAN XEM


//TEST CASE #2: VERIFY getFactorial(with n = 5) check 5! correct or not ?
//TEST STEPS/PROCEDURES 
//          1. Given n = 5
//          2. Call/invoke getFactorial(n = 5)

//EXPECTED RESULT:
//          the method must return 1 as the result of 5!

//STATUS: PASSED | FAILED, just waiting the method returns value
//                          ĐÓAN XEM

//CÂU 3: BÀI THI PE VIẾT RA KHOẢNG 10 CÁI TEST CASE NHƯ TRÊN