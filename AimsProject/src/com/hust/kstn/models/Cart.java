/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hust.kstn.models
       ;

/**
 *
 * @author Admin
 */
public class Cart {
  
    public static final int MAX_NUMBER_ORDERED = 20; 
    
   
    private DigitalVideoDisc itemsInCart[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];
    
   
    private int qtyOrdered = 0;
    public void addDVD(DigitalVideoDisc disc) {
        // Yêu cầu 4.5: Kiểm tra xem giỏ hàng đã đầy chưa
        if (qtyOrdered >= MAX_NUMBER_ORDERED) {
            // Nếu giỏ đầy (đã đủ 20 DVD)
            System.out.println("The cart is almost full"); // In thông báo lỗi [cite: 507]
        } else {
            // Nếu giỏ chưa đầy, thêm đĩa vào vị trí tiếp theo
            itemsInCart[qtyOrdered] = disc;
            
            // Tăng biến đếm lên 1
            qtyOrdered++;
            
            // In thông báo thành công
            System.out.println("The disc has been added successfully"); // [cite: 505]
        }
    }
    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered + 2 <= MAX_NUMBER_ORDERED) {
            
            itemsInCart[qtyOrdered] = disc1;
            qtyOrdered++;
            
            itemsInCart[qtyOrdered] = disc2;
            qtyOrdered++;
            
            System.out.println("Added 2 discs successfully.");
            
        } else if (qtyOrdered + 1 <= MAX_NUMBER_ORDERED) {
            
            System.out.println("The cart is almost full. Adding only disc 1.");
            itemsInCart[qtyOrdered] = disc1;
            qtyOrdered++;
            
        } else {
            System.out.println("The cart is full. Cannot add any more discs.");
        }
    }
    public void addDVD(DigitalVideoDisc[] discs) {
        if (qtyOrdered + discs.length <= MAX_NUMBER_ORDERED) {
            
            for (DigitalVideoDisc disc : discs) {
                itemsInCart[qtyOrdered] = disc;
                qtyOrdered++;
            }
            System.out.println("Added " + discs.length + " discs successfully.");
            
        } else {
            System.out.println("Cannot add " + discs.length + " discs. The cart capacity is only " + MAX_NUMBER_ORDERED);
        }
    }
    
    public void removeDVD(DigitalVideoDisc disc) {
        // Yêu cầu 4.5: Kiểm tra trường hợp giỏ hàng đang rỗng
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty"); // [cite: 508]
            return; // Dừng hàm ngay lập tức
        }

        // Tìm vị trí (index) của đĩa DVD cần xóa
        int indexToRemove = -1; // Giả sử không tìm thấy
        for (int i = 0; i < qtyOrdered; i++) {
            // So sánh xem DVD ở vị trí 'i' có phải là DVD ta muốn xóa không
            if (itemsInCart[i] == disc) { 
                indexToRemove = i; // Ghi lại vị trí tìm thấy
                break; // Thoát khỏi vòng lặp
            }
        }

        // Sau khi tìm xong, kiểm tra xem có thấy không
        if (indexToRemove == -1) {
            // Nếu không tìm thấy
            System.out.println("The disc does not exist"); // [cite: 509]
        } else {
            // Nếu tìm thấy tại vị trí 'indexToRemove'
            // Dịch chuyển tất cả các DVD phía sau nó lên 1 bậc
            for (int i = indexToRemove; i < qtyOrdered - 1; i++) {
                itemsInCart[i] = itemsInCart[i + 1];
            }
            
            // Đặt vị trí cuối cùng (trước đây là DVD cuối) thành null (rỗng)
            itemsInCart[qtyOrdered - 1] = null;
            
            // Giảm biến đếm đi 1
            qtyOrdered--;
            
            // In thông báo thành công
            System.out.println("The disc has been removed successfully"); // [cite: 506]
        }
    }
    // Phương thức để tính tổng giá trị giỏ hàng
    public double calculateTotalCost() {
        double totalCost = 0.0;
        
        // Duyệt qua mảng các đĩa (chỉ duyệt đến 'qtyOrdered')
        for (int i = 0; i < qtyOrdered; i++) {
            // Cộng dồn chi phí của từng đĩa
            totalCost += itemsInCart[i].getCost();
        }
        
        // Trả về tổng chi phí
        return totalCost;
    }
    // Phương thức để in ra thông tin giỏ hàng
    public void print() {
        System.out.println("*********************** GIO HANG ***********************");
        System.out.println("Cac san pham co trong gio:");
        
        // Duyệt qua tất cả các DVD có trong giỏ
        for (int i = 0; i < qtyOrdered; i++) {
            // In ra Tên và Giá tiền của từng DVD [cite: 502]
            System.out.println((i + 1) + ". " + itemsInCart[i].getTitle() + 
                               " - " + itemsInCart[i].getCost() + " $");
        }
        
        System.out.println("------------------------------------------------------");
        // In ra tổng số lượng sản phẩm [cite: 502]
        System.out.println("Tong so luong: " + qtyOrdered);
        // In ra tổng chi phí bằng cách gọi hàm vừa tạo
        System.out.println("Tong chi phi: " + calculateTotalCost() + " $");
        System.out.println("********************************************************");
    }
}
