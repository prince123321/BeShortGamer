package com.beshortgamer.ndx;

import android.app.Activity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class HttpServer {
    private static final String[] sectors = {"10", "3", "6", "8", "2", "4", "7", "9", "5","1"};
    private static final int[] sectorDegrees = new int[sectors.length];
    private static final Random RANDOM = new Random();
    private static int degree = 0;
    private static boolean isSpinning = false;
    public static void StartSpin(ImageView imageView, Activity activity){
        getDegreeOfEverySector();
        if (!isSpinning) {
            spin(activity,imageView);
            isSpinning = true;
        }
    }
    private static void spin(Activity activity,ImageView imageView) {
        // we calculate random angle for rotation of our wheel
        degree = RANDOM.nextInt(sectors.length - 1);
        String Count;
        // rotation effect on the center of the wheel
        RotateAnimation rotateAnim = new RotateAnimation(0, (360 * sectors.length) + sectorDegrees[degree],
                RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnim.setDuration(3600); // rotation duration in milliseconds
        rotateAnim.setFillAfter(true);
        rotateAnim.setInterpolator(new DecelerateInterpolator());
        rotateAnim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Toast.makeText(activity, ""+getCount(), Toast.LENGTH_SHORT).show();
                isSpinning = false;
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(rotateAnim);
    }
    private static String getCount(){
        return sectors[sectors.length - (degree + 1)];
    }
    private static void getDegreeOfEverySector() {
        // get one sector degree(angle) among total sectors
        int sectorDegree = 360 / sectors.length;
        for (int i = 0; i < sectors.length; i++) {
            sectorDegrees[i] = (i + 1) * sectorDegree;
        }
    }
    public static int key_method(String key,String code){
        int a = Integer.parseInt(key);
        int method = 0;
        int b = Integer.parseInt(code);
        switch (a)
        {
            case 0:
                method = b * 3 +1;
                break;

            case 1:
                method = b * 2 +21;
                break;

            case 2:
                method = b * 3 +23;
                break;

            case 3:
                method = b * 1 +01;
                break;

            case 4:
                method = b * 12 +12;
                break;

            case 5:
                method = b * 2 +19;
                break;

            case 6:
                method = b * 3 +12;
                break;

            case 7:
                method = b * 1 +23;
                break;

            case 8:
                method = b * 4 +12;
                break;

            case 9:
                method = b * 3 +8;
                break;

            case 10:
                method = b * 3 +2;
                break;

            case 11:
                method = b * 1 +32;
                break;

            case 12:
                method = b * 2 +1;
                break;

            case 13:
                method = b * 1 +2;
                break;

            case 14:
                method = b * 2 +22;
                break;

        }
        return method;
    }
}
