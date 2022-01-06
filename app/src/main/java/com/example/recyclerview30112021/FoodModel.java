package com.example.recyclerview30112021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FoodModel {
    private int image;
    private String name;
    private String address;
    private List<ServiceEnum> arrServiceEnum;
    private Discount discount;
    private long timeOpen;
    private long timeClose;
    private float distance;
    private boolean isOpen;

    public FoodModel(int image, String name, String address, List<ServiceEnum> arrServiceEnum, Discount discount, long timeOpen, long timeClose, float distance) {
        this.image = image;
        this.name = name;
        this.address = address;
        this.arrServiceEnum = arrServiceEnum;
        this.discount = discount;
        this.timeOpen = timeOpen;
        this.timeClose = timeClose;
        this.distance = distance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ServiceEnum> getArrServiceEnum() {
        return arrServiceEnum;
    }

    public void setArrServiceEnum(ArrayList<ServiceEnum> arrServiceEnum) {
        this.arrServiceEnum = arrServiceEnum;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public long getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(long timeOpen) {
        this.timeOpen = timeOpen;
    }

    public long getTimeClose() {
        return timeClose;
    }

    public void setTimeClose(long timeClose) {
        this.timeClose = timeClose;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }


    @Override
    public String toString() {
        return "FoodModel{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", arrServiceEnum=" + arrServiceEnum +
                ", discount=" + discount +
                ", timeOpen=" + timeOpen +
                ", timeClose=" + timeClose +
                ", distance=" + distance +
                ", isOpen=" + isOpen +
                '}';
    }

    public static List<FoodModel> getMock(){
        return new ArrayList<>(Arrays.asList(
                new FoodModel(R.drawable.image_bunbodatthanh,"Bún Bò Đất Thánh - Shop Online","221/16 Đất Thánh, P. 6, Tân Bình, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_rulesoftead,"Rules Of Tea - Trà Sữa Đế Vương - Nguyễn Văn Cừ","213D Nguyễn Văn Cừ, P. 3, Quận 5, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NIGHT,"Giảm 15%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),12.7f),
                new FoodModel(R.drawable.image_tala,"Tá Lả - Ăn Vặt, Mì Xào, Cơm Chiên & Sinh Tố - Phan Văn Trị","497/2 Phan Văn Trị, P. 5, Gò Vấp, TP. HCM",Arrays.asList(ServiceEnum.BUFFET),new Discount(DiscountSessionEnum.NOON,"Giảm 15%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),16.8f),
                new FoodModel(R.drawable.image_anhquan,"Anh Quán - Mì Khô Gà Quay & Hủ Tiếu Mì Sủi Cảo","80/17/138 Dương Quảng Hàm, P. 5, Gò Vấp, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 10%"),Utils.getTime(6,0,0),Utils.getTime(20,0,0),16.3f),
                new FoodModel(R.drawable.image_cohai,"Cô Hai - Bánh Bò & Bánh Chuối Nước Dừa","200/76 Xóm Chiếu, P. 14, Quận 4, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.NOON,"Giảm 30%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),14f),
                new FoodModel(R.drawable.image_kimbaptiti,"Kimbap TiTi - Món Hàn Quốc - Hoàng Sa","159/1/5 Trần Văn Đang, P. 11, Quận 3, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NOON,"Giảm 20%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),15.8f),
                new FoodModel(R.drawable.image_anvi,"An Vi - Gà Rán & Khoai Lang Lắc - Kênh Tân Hóa","128 Kênh Tân Hóa, P. Phú Trung, Tân Phú, TP. HCM",Arrays.asList(ServiceEnum.GROUP,ServiceEnum.SMALL_RESTAURANT),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 5%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),10.1f),
                new FoodModel(R.drawable.image_tocotoco,"TocoToco Bubble Tea - Thống Nhất","195B Thống Nhất, P. 11, Gò Vấp, TP. HCM",Arrays.asList(ServiceEnum.GROUP,ServiceEnum.SMALL_RESTAURANT),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_myquang3anhem,"Mì Quảng 3 Anh Em - 23 Pasteur","23 Pasteur, P. Nguyễn Thái Bình, Quận 1, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_sucsongmoi,"Sức Sống Mới - Nước Ép & Sinh Tố - Lê Lợi","27 Lê Lợi, P. 4, Gò Vấp, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Giảm 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f)
        ));
    }
}
