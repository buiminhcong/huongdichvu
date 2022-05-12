# huongdichvu
#Giới thiệu:
- Dịch vụ tra điểm và kết quả ra trường sử dụng kiến trúc microservice, xây dựng bằng spring boot và eureka
- Dịch vụ bao gồm:
   + 1 API Gateway giúp chúng ta có thể định tuyến một request bất kỳ tới các service bên trong thông qua request parameter
   + 1 service registry sử dụng eureka để quản lý, đặt tên cho các service
   + 1 utility service notification để thông báo điểm và kết quả ra trường cho sinh viên
   + 2 dịch vụ: Student lưu thông tin sinh viên, Transcript lưu điểm sinh viên.
- Cài đặt môi trường: 
    + b1. Cài đặt IntelIj
    + b2. cài đặt môi trường maven, java
    + b3. Cài đặt mysql
-Chạy chương trình
   - b1. start dịch vụ Student Transcrip ubility service notification
   - b2. start dịch vụ eureka-server và chạy trên cổng 8761 bạn sẽ thấy các dịch vụ đang chạy
   - ![image](https://user-images.githubusercontent.com/93995859/167992487-6418eea5-10af-4dd5-b701-c765c57a4da2.png)
   - b3. start dịch vụ tast-serice và chạy trên cổng 9090 đã cấu hình trước
   - KQ:
      + ![image](https://user-images.githubusercontent.com/93995859/167992771-aeef7314-0422-471c-a7e0-a9892a1a2ca7.png)
      + dịch vụ ubiliti service sẽ gửi gmail thông báo cho email của sinh viên đấy:
      -  ![image](https://user-images.githubusercontent.com/93995859/167993043-e7c91cf1-2de1-4953-90fc-4405dad8a557.png)
    - Nếu mã sinh viên sai sẽ thông báo sai và hủy dịch vụ
    - ![image](https://user-images.githubusercontent.com/93995859/167994282-8085d683-af74-4190-abb7-c581632bad55.png)



