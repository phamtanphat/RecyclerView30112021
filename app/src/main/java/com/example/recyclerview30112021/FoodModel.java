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
                new FoodModel(R.drawable.image_bunbodatthanh,"B??n B?? ?????t Th??nh - Shop Online","221/16 ?????t Th??nh, P. 6, T??n B??nh, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_rulesoftead,"Rules Of Tea - Tr?? S???a ????? V????ng - Nguy???n V??n C???","213D Nguy???n V??n C???, P. 3, Qu???n 5, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NIGHT,"Gi???m 15%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),12.7f),
                new FoodModel(R.drawable.image_tala,"T?? L??? - ??n V???t, M?? X??o, C??m Chi??n & Sinh T??? - Phan V??n Tr???","497/2 Phan V??n Tr???, P. 5, G?? V???p, TP. HCM",Arrays.asList(ServiceEnum.BUFFET),new Discount(DiscountSessionEnum.NOON,"Gi???m 15%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),16.8f),
                new FoodModel(R.drawable.image_anhquan,"Anh Qu??n - M?? Kh?? G?? Quay & H??? Ti???u M?? S???i C???o","80/17/138 D????ng Qu???ng H??m, P. 5, G?? V???p, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 10%"),Utils.getTime(6,0,0),Utils.getTime(20,0,0),16.3f),
                new FoodModel(R.drawable.image_cohai,"C?? Hai - B??nh B?? & B??nh Chu???i N?????c D???a","200/76 X??m Chi???u, P. 14, Qu???n 4, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.NOON,"Gi???m 30%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),14f),
                new FoodModel(R.drawable.image_kimbaptiti,"Kimbap TiTi - M??n H??n Qu???c - Ho??ng Sa","159/1/5 Tr???n V??n ??ang, P. 11, Qu???n 3, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.FAMILY,ServiceEnum.GROUP),new Discount(DiscountSessionEnum.NOON,"Gi???m 20%"),Utils.getTime(11,30,0),Utils.getTime(17,0,0),15.8f),
                new FoodModel(R.drawable.image_anvi,"An Vi - G?? R??n & Khoai Lang L???c - K??nh T??n H??a","128 K??nh T??n H??a, P. Ph?? Trung, T??n Ph??, TP. HCM",Arrays.asList(ServiceEnum.GROUP,ServiceEnum.SMALL_RESTAURANT),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 5%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),10.1f),
                new FoodModel(R.drawable.image_tocotoco,"TocoToco Bubble Tea - Th???ng Nh???t","195B Th???ng Nh???t, P. 11, G?? V???p, TP. HCM",Arrays.asList(ServiceEnum.GROUP,ServiceEnum.SMALL_RESTAURANT),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_myquang3anhem,"M?? Qu???ng 3 Anh Em - 23 Pasteur","23 Pasteur, P. Nguy???n Th??i B??nh, Qu???n 1, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f),
                new FoodModel(R.drawable.image_sucsongmoi,"S???c S???ng M???i - N?????c ??p & Sinh T??? - L?? L???i","27 L?? L???i, P. 4, G?? V???p, TP. HCM",Arrays.asList(ServiceEnum.RESTAURANT,ServiceEnum.BIRTHDAY),new Discount(DiscountSessionEnum.ALL_TIME,"Gi???m 20%"),Utils.getTime(7,0,0),Utils.getTime(22,0,0),13.1f)
        ));
    }
}
