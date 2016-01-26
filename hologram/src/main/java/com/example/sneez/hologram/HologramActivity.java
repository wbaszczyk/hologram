package com.example.sneez.hologram;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.glimpseframework.android.hologram.GlimpseHoloView;

public class HologramActivity extends AppCompatActivity {

    GlimpseHoloView glimpseHoloView1;
    GlimpseHoloView glimpseHoloView2;
    GlimpseHoloView glimpseHoloView3;
    GlimpseHoloView glimpseHoloView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hologram);

        glimpseHoloView1 = (GlimpseHoloView) findViewById(R.id.holo_view1);
        glimpseHoloView2 = (GlimpseHoloView) findViewById(R.id.holo_view2);
        glimpseHoloView3 = (GlimpseHoloView) findViewById(R.id.holo_view3);
        glimpseHoloView4 = (GlimpseHoloView) findViewById(R.id.holo_view4);
    }

    @Override
    protected void onResume() {
        super.onResume();
        glimpseHoloView1.onResume();
        glimpseHoloView2.onResume();
        glimpseHoloView3.onResume();
        glimpseHoloView4.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        glimpseHoloView1.onPause();
        glimpseHoloView2.onPause();
        glimpseHoloView3.onPause();
        glimpseHoloView4.onPause();
    }
}
