package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.exam.activity.SecondActivity;
import com.example.exam.adapter.DiscountAdapter;
import com.example.exam.adapter.ServiceAdapter;
import com.example.exam.adapter.ViewPagerAdapter;
import com.example.exam.model.Discount;
import com.example.exam.model.Member;
import com.example.exam.model.Service;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerViewPager;
    RecyclerView recyclerViewService;
    RecyclerView recyclerViewDiscount;
    NestedScrollView scrollView;

    ArrayList<Member> members;
    ArrayList<Discount> discounts;
    ArrayList<Service> services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();
        refreshViewPagerAdapter(prepareMemberList());
        refreshViewServiceAdapter(prepareServiceList());
        refreshViewDiscountAdapter(prepareDiscountList());
    }


    private void initViews() {
        context = this;

        recyclerViewDiscount = findViewById(R.id.rv_discount);
        recyclerViewPager = findViewById(R.id.rv_viewpager);
        recyclerViewService = findViewById(R.id.rv_services);

        recyclerViewDiscount.setLayoutManager(new GridLayoutManager(context,1));

        recyclerViewService.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        recyclerViewPager.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        SnapHelper snapHelper = new PagerSnapHelper();
        snapHelper.attachToRecyclerView(recyclerViewPager);



    }

    private void refreshViewPagerAdapter(ArrayList<Member> members) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(context,members);
        recyclerViewPager.setAdapter(viewPagerAdapter);

    }
    private void refreshViewServiceAdapter(ArrayList<Service> services) {
        ServiceAdapter serviceAdapter = new ServiceAdapter(this,services);
        recyclerViewService.setAdapter(serviceAdapter);
    }
    private void refreshViewDiscountAdapter(ArrayList<Discount> discounts) {
        DiscountAdapter discountAdapter = new DiscountAdapter(context,discounts);
        recyclerViewDiscount.setAdapter(discountAdapter);
        recyclerViewDiscount.setNestedScrollingEnabled(false);
    }

    public void openSecondActivity(Service service){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }


    private ArrayList<Member> prepareMemberList() {
        ArrayList<Member> members = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            members.add(new Member(1,""));
        }
        return members;
    }
    private ArrayList<Service> prepareServiceList() {
        ArrayList<Service> services = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            services.add(new Service(1,""));
        }
        return services;
    }
    private ArrayList<Discount> prepareDiscountList() {
        ArrayList<Discount> discounts = new ArrayList<>();
        for(int i = 0; i < 6; i++){
            discounts.add(new Discount(1,""));
        }
        return discounts;
    }

}