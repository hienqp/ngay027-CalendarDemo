package com.hienqp.calendardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView textViewTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTime = (TextView) findViewById(R.id.textview_time);

        // sử dụng package java.util lấy đối tượng của Calendar thông qua phương thức getInstance()
        Calendar calendar = Calendar.getInstance();

        textViewTime.append("\nThông tin toàn bộ: " + calendar.getTime() + "\n");
        textViewTime.append("Ngày: "+calendar.get(Calendar.DATE) + "\n");

        // lưu ý: giá trị tháng mà Calendar quản lý là từ 0 đến 11 (tương ứng cho tháng 1 đến tháng 12)
        textViewTime.append("Tháng (phải + thêm 1): " + calendar.get(Calendar.MONTH) + "\n");
        textViewTime.append("Năm: " + calendar.get(Calendar.YEAR) + "\n");

        // muốn lấy 1 chuỗi liên tục hiển thị ngày tháng năm
        // gọi đối tượng định dạng thời gian SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy"); // 09-11-2021
        textViewTime.append("Tháng-ngày-năm: " + dateFormat.format(calendar.getTime()) + "\n");

        textViewTime.append("Giờ: " + calendar.get(Calendar.HOUR) + "\n");
        textViewTime.append("Giờ Của Ngày: " + calendar.get(Calendar.HOUR_OF_DAY) + "\n");
        textViewTime.append("Phút: " + calendar.get(Calendar.MINUTE) + "\n");
        textViewTime.append("Giây: " + calendar.get(Calendar.SECOND) + "\n");

        // muốn lấy 1 chuỗi liên tục hiển thị giờ phút giây
        // gọi đối tượng định dạng thời gian SimpleDateFormat
        SimpleDateFormat timeFormat1 = new SimpleDateFormat("HH:mm:ss"); // 16:10:22
        SimpleDateFormat timeFormat2 = new SimpleDateFormat("hh:mm:ss a"); // 4:10:22 AM/PM
        textViewTime.append("Giờ:phút:giây - " + timeFormat1.format(calendar.getTime()) + "\n");
        textViewTime.append("Giờ:phút:giây - " + timeFormat2.format(calendar.getTime()) + "\n");
    }
}