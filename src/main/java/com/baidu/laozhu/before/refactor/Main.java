package com.baidu.laozhu.before.refactor;

public class Main {
    public static void main(String[] argv) {
        //		Customer customer = new Customer("王尼玛");
        //		customer.addRental(new Rental(new Movie("葫芦娃", 2), 3));
        //		customer.addRental(new Rental(new Movie("色戒", 0), 5));
        //		customer.addRental(new Rental(new Movie("匆匆那年", 1), 2));
        //		System.out.println(customer.statement());
        String a = "world";
        String b = "hello" + a + "<" + ">" + "!";
        System.out.println("heloo");
        a = " 中国佛山富达通通风设备有限公司".replaceAll("\\u00a0\\u4E2D", "");
        System.out.println(a);
    }
}
