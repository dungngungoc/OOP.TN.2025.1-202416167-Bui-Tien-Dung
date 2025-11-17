/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hust.kstn;
import com.hust.kstn.models.Cart;
import com.hust.kstn.models.DigitalVideoDisc;
/**
 *
 * @author Admin
 */
public class Aims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Tạo một giỏ hàng mới
    Cart cart = new Cart(); //

    // 2. Tạo các đối tượng DVD mới (dùng constructor đầy đủ)
    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation",
            "Roger Allers", 87, 19.95); //

    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction",
            "George Lucas", 87, 24.95); //

    // 3. Thêm DVD vào giỏ
    cart.addDVD(dvd1); //
    cart.addDVD(dvd2); //

    // 4. In giỏ hàng và tính tổng
    cart.print(); //
    cart.calculateTotalCost(); //

    // 5. Xóa DVD khỏi giỏ
    cart.removeDVD(dvd2); //

    // 6. In lại giỏ hàng và tính tổng
    cart.print(); //
    cart.calculateTotalCost(); //
    }
    
}
