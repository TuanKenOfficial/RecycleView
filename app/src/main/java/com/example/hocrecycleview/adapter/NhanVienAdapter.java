package com.example.hocrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hocrecycleview.R;
import com.example.hocrecycleview.model.NhanVien;

import java.util.ArrayList;

public class NhanVienAdapter extends RecyclerView.Adapter<NhanVienAdapter.ViewHolderNhanVien> {

    private Context context;

    private ArrayList<NhanVien> arrayList ;

    public NhanVienAdapter(Context context, ArrayList<NhanVien> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolderNhanVien onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent, false );
        return new ViewHolderNhanVien(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderNhanVien holder, int position) {
        NhanVien nhanVien = arrayList.get(position);
        int ma = nhanVien.getManv();
        String ten = nhanVien.getTen();
        String address = nhanVien.getAddress();
        String phone = nhanVien.getPhone();
        String biensoxe = nhanVien.getBiensoxe();

        holder.txtMa.setText(""+ma); //lưu ý chỗ này nha ""
        holder.txtTen.setText(ten);
        holder.txtAddress.setText(address);
        holder.txtPhone.setText(phone);
        holder.txtBiensoxe.setText(biensoxe);

        holder.txtMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Mã= "+ma, Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Tên= "+ten, Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Địa chỉ= "+address, Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Sdt= "+phone, Toast.LENGTH_SHORT).show();
            }
        });
        holder.txtBiensoxe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Biển số xe= "+biensoxe, Toast.LENGTH_SHORT).show();
            }
        });

        //nhấp ở ngoài màn hình
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Mã-Tên-Địa chỉ-SĐT-Biển số xe: "
                        +ma+"-"
                        +ten+"-"
                        +address+"-"
                        +phone+"-"
                        +biensoxe, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolderNhanVien extends RecyclerView.ViewHolder{

        private TextView txtBiensoxe,txtPhone,txtAddress,txtTen,txtMa;
        public ViewHolderNhanVien(@NonNull View itemView) {
            super(itemView);

            txtMa = (TextView) itemView.findViewById(R.id.txtMa);
            txtTen = (TextView) itemView.findViewById(R.id.txtTen);
            txtAddress = (TextView) itemView.findViewById(R.id.txtAddress);
            txtPhone = (TextView) itemView.findViewById(R.id.txtPhone);
            txtBiensoxe = (TextView) itemView.findViewById(R.id.txtBiensoxe);
        }
    }
}
