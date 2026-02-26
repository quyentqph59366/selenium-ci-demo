package com.poly.demo.thiThu2602;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitimexTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Truy cập trực tiếp trang tìm kiếm
        driver.get("https://vitimex.com.vn/search?q=Giày");

        // Đợi 5 giây để thấy kết quả (không bắt buộc nhưng nên có khi demo)
        Thread.sleep(5000);

        System.out.println("Tìm kiếm thành công!");

        driver.quit();
    }
}