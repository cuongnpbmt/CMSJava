/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaparraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CuongNP
 */
public class BaiTapArrayList {

    static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        SinhVien [] mangSV = new SinhVien[3];
//        for(int i = 0; i < mangSV.length; i++){
//            mangSV[i] = new SinhVien();
//            mangSV[i].Nhap();
//        }
//        
//        for(int i = 0; i < mangSV.length; i++){
//            mangSV[i].Xuat();
//        }

//        ArrayList<SinhVien> arrSV = new ArrayList();
//        
//        SinhVien sv = new SinhVien();
//        sv.Nhap();
//        arrSV.add(sv);
//        
//        SinhVien sv2 = new SinhVien();
//        sv2.Nhap();
//        arrSV.add(sv2);
//        
//        for(int i = 0; i < arrSV.size(); i++ ){
//            //lấy sinh viên thứ i trong ArrayList, goi hàm Xuất
//            arrSV.get(i).Xuat(); 
//
//        }
        ArrayList<SinhVien> arrSV = new ArrayList<>();
        int luaChon = 0;
        do{
            MenuChucNang();
            luaChon = input.nextInt();

            switch (luaChon) {
                case 1:
                    SinhVien sv = new SinhVien();
                    sv.Nhap();
                    arrSV.add(sv);
                    break;
                case 2:
                    //gọi chức năng xuất
                    for(int i = 0; i < arrSV.size(); i++){
                        arrSV.get(i).Xuat();
                    }
                    break;
                
                case 3:
                    int viTriCanSua;
                    System.out.println("Nhap vi tri can sua:");
                    viTriCanSua = input.nextInt(); 
                    input.nextLine();
                    //Lấy SinhVien ở vị trị vừa nhập trên (tính từ 0->)                    
                    SinhVien svCanSua = arrSV.get(viTriCanSua); 
                    System.out.println("Nhap ten moi");
                    svCanSua.setTen(input.nextLine());
                    System.out.println("Nhap tuoi moi");
                    svCanSua.setTuoi(input.nextInt());
                    
                    arrSV.set(viTriCanSua, svCanSua);
                    
                    break;
                case 4:
                    //Xoa
                    String tenCanXoa;
                    System.out.println("Nhap ten can xoa");
                    tenCanXoa = input.nextLine();
                    
                    for(int i = 0; i < arrSV.size(); i++){
                        if(arrSV.get(i).getTen().contains(tenCanXoa)){
                            arrSV.remove(i);
                        }
                    }
                    
                    break;
                    
                case 5:
                    //Sap xep
                   
                    break;    
                case 6:
                    //Thoát
                    System.out.println("Tạm biệt!");
                    break;
                default:
                    //Thông báo không hợp lệ và nhập lại
                    break;
            }
        }while(luaChon != 6);
    }

    public static void MenuChucNang() {
        System.out.println("1. Nhap");
        System.out.println("2. Xuat");
        System.out.println("3. Sua");
        System.out.println("4. Xoa");
        System.out.println("5. Sap xep");
        System.out.println("6. Thoat");
        System.out.println("Nhap lua chon cua ban.");
    }

}
