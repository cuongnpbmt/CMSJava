/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaparraylist;
import java.util.Scanner;
/**
 *
 * @author CuongNP
 */
public class SinhVien {
    String Ten;
    int Tuoi;
    Scanner input =new Scanner(System.in);
    
    public void Nhap(){
        System.out.println("Nhap ten sinh vien");
        setTen(input.nextLine());
        System.out.println("Nhap tuoi");
        setTuoi(input.nextInt());
    }
    
    public void Xuat(){
        System.out.println("Ten: " + getTen());
        System.out.println("Tuoi: " + getTuoi());
    }
    
    public SinhVien() {
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
    
}
