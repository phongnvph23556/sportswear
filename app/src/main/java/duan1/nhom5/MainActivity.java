package duan1.nhom5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import duan1.nhom5.fragment.CaiDatFragment;
import duan1.nhom5.fragment.DangKiFragment;
import duan1.nhom5.fragment.DoanhthuFragment;
import duan1.nhom5.fragment.DonHangFragment;
import duan1.nhom5.fragment.KhachHangFragment;
import duan1.nhom5.fragment.LoaiSanPhamFragment;
import duan1.nhom5.fragment.NhanVienFragment;
import duan1.nhom5.fragment.SanPhamFragment;
import duan1.nhom5.fragment.TopBanChayFragment;

public class MainActivity extends AppCompatActivity {
    ImageView img_donhang, img_khachhang, img_sanpham, img_nhanvien, img_loaisanpham, img_topbanchay, img_doanhthu, img_caidat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_donhang = findViewById(R.id.donhang);
        img_khachhang = findViewById(R.id.khachhang);
        img_sanpham = findViewById(R.id.sanpham);
        img_nhanvien = findViewById(R.id.nhanvien);
        img_loaisanpham = findViewById(R.id.loaisanpham);
        img_topbanchay = findViewById(R.id.topbanchay);
        img_doanhthu = findViewById(R.id.doanhthu);
        img_caidat = findViewById(R.id.caidat);


        //set sự kiện
        //đơn hàng
        img_donhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new DonHangFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });
        //khách hàng
        img_khachhang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new KhachHangFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });
        //sản phẩm
        img_sanpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new SanPhamFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });
        //nhân viên
        img_nhanvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new NhanVienFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });
        //loại sản phẩm
        img_loaisanpham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new LoaiSanPhamFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });

        //top bán chạy
        img_topbanchay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new TopBanChayFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });

        //doanh thu
        img_doanhthu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new DoanhthuFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });

        //cài đặt
        img_caidat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment=new CaiDatFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.manhinh, fragment).commit();
            }
        });
    }
}