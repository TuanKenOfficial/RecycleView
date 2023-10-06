package com.example.hocrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;

import com.example.hocrecycleview.adapter.NhanVienAdapter;
import com.example.hocrecycleview.model.NhanVien;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView nhanvienRv;

    private ArrayList<NhanVien> nhanVienArrayList;

    private NhanVienAdapter nhanVienAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nhanvienRv = (RecyclerView) findViewById(R.id.nhanvienRv);
        nhanVienArrayList = new ArrayList<>();
        duLieu();
        nhanVienAdapter = new NhanVienAdapter(MainActivity.this,nhanVienArrayList);
        nhanvienRv.setAdapter(nhanVienAdapter);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        nhanvienRv.setLayoutManager(linearLayoutManager);


    }


    private void duLieu() {
        nhanVienArrayList.add(new NhanVien(1,"Khang","Đồng Tháp",
                "0855792196","66SA-00174"));
        nhanVienArrayList.add(new NhanVien(2,"Lan","Đồng Tháp1",
                "0855792196","66SA-00170"));
        nhanVienArrayList.add(new NhanVien(3,"Tú","Đồng Tháp2",
                "0855792196","66SA-00171"));
        nhanVienArrayList.add(new NhanVien(4,"Ngọc","Đồng Tháp3",
                "0855792196","66SA-00172"));
        nhanVienArrayList.add(new NhanVien(5,"Duy","Đồng Tháp4",
                "0855792196","66SA-00173"));
        nhanVienArrayList.add(new NhanVien(6,"Bình","Đồng Tháp5",
                "0855792196","66SA-00176"));
        nhanVienArrayList.add(new NhanVien(7,"Bi","Đồng Tháp6",
                "0855792196","66SA-00179"));
        nhanVienArrayList.add(new NhanVien(8,"Còn","Đồng Tháp7",
                "0855792196","66SA-00178"));
        nhanVienArrayList.add(new NhanVien(9,"Phước","Đồng Tháp8",
                "0855792196","66SA-00175"));
        nhanVienArrayList.add(new NhanVien(10,"Minh","Đồng Tháp9",
                "0855792196","66SA-00173"));


    }


}