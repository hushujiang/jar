package com.github.catvod.spider.merge.p055q;

import android.graphics.Bitmap;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p001B.C0006a;
import com.github.catvod.spider.merge.p063y.EnumC0747a;
import com.github.catvod.spider.merge.p063y.EnumC0748b;
import com.github.catvod.spider.merge.p064z.C0752b;
import java.util.EnumMap;

/* renamed from: com.github.catvod.spider.merge.q.b */
/* loaded from: classes.dex */
public final class C0650b {
    /* renamed from: a */
    public static Bitmap m151a(String str) {
        try {
            EnumMap enumMap = new EnumMap(EnumC0748b.class);
            enumMap.put((EnumMap) EnumC0748b.f1395b, (EnumC0748b) atm.m897d("3F2E3C5874"));
            enumMap.put((EnumMap) EnumC0748b.f1399f, (EnumC0748b) 2);
            C0752b mo14a = new C0006a().mo14a(str, EnumC0747a.f1390j, C0652d.m149b(), C0652d.m149b(), enumMap);
            int m3c = mo14a.m3c();
            int m4b = mo14a.m4b();
            int[] iArr = new int[m3c * m4b];
            for (int i = 0; i < m4b; i++) {
                int i2 = i * m3c;
                for (int i3 = 0; i3 < m3c; i3++) {
                    iArr[i2 + i3] = mo14a.m5a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(m3c, m4b, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, m3c, 0, 0, m3c, m4b);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
