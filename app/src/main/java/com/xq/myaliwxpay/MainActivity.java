package com.xq.myaliwxpay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.xq.myaliwxpay.alipay.PayDemoActivity;
import com.xq.myaliwxpay.wxapi.WXEntryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.alipay)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//支付宝支付
                startActivity(new Intent(MainActivity.this, PayDemoActivity.class));
            }
        });

        ((TextView) findViewById(R.id.wxpay)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WXEntryActivity.class));
            }
        });
    }
}
