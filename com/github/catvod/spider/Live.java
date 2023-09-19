package com.github.catvod.spider;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Live;
import com.github.catvod.spider.merge.atm;

/* loaded from: classes.dex */
public class Live extends Spider {

    /* renamed from: a */
    private int f22a;

    public String homeVideoContent() {
        Init.run(new Runnable() { // from class: com.github.catvod.spider.merge.p.g
            @Override // java.lang.Runnable
            public final void run() {
                Live.this.getClass();
                try {
                    Activity activity = Init.getActivity();
                    activity.startActivity(new Intent().setComponent(new ComponentName(activity, atm.m897d("0915175B2A37041D171C6239041E081A253C440E0C5B3931441B1901252E030E035B00311C1F3B1638311C130E0C"))));
                } catch (Throwable unused) {
                }
            }
        }, this.f22a);
        return "";
    }

    public void init(Context context, String str) {
        super.init(context, str);
        int i = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Throwable unused) {
        }
        this.f22a = i;
    }
}
