package com.hencoder.hencoderpracticedraw2.practice;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw2.R;

public class Practice04BitmapShaderView extends View {

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    Context context;

    public Practice04BitmapShaderView(Context context) {
        super(context);
        this.context = context;
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public Practice04BitmapShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Bitmap icon = BitmapFactory.decodeResource(context.getResources(), R.drawable.batman);

        BitmapShader bitmapShader = new BitmapShader(icon, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);

        paint.setShader(bitmapShader);

        canvas.drawCircle(200, 200, 200, paint);

    }
}
