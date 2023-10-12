
package com.crisbryann.mathutil.core;

//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho
//các nơi khác
//cái gì mà dùng chung cho nhiều nơi, nhận info,trả về về info qua
//hàm, mà ko cần lưu trữ gì hết, cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS.
//KO BH GỌI STATIC QUA CON ĐƯỜNG NEW!!!!!!!
public class MathUtility {
    public static final double PI = 3.14;
    //C: public const double Pi = 3.14 //ko cần chữ static mà vẫn là 
                                        //static nếu có từ khóa const
                                        //const C# ~ final java
    
    //hàm tính n! = 1.2.3...n
    //KO CÓ GIAI THỪA CỦA SỐ ÂM, N < 0 KO TÍNH ĐC
    //NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG CHỈ CHỊU ĐC 18 SỐ 0
    //20! VƯAD ĐỦ 18 SỐ 0, DO ĐÓ: KO TÍNH GIẢI THỪA TỪ 21 TRỞ ĐI
    //0! = 1! = - QUY ƯỚC
    public static long getFactorial(int n) {
        
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n == 0 || n == 1)
            return 1; //neu co the ket thuc som, thi ket thuc ngay 
        //song sot den cho nay, sure n = 2..20. Vi neu ko chet doc duong o
        //2 cum if o tren roi, ko can ELSE NEU
        
        long result = 1; //giai thua khoi dau la 1
        //nhan don 2 3 4 5....n vao bien nay thi thanh n!
        
        for(int i = 2; i <= n; i++){
            result *= i;
        }
        return result;
        
    }
    
}
