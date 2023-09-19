package com.github.catvod.spider.merge.p055q;

import android.app.Application;
import android.content.SharedPreferences;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.q.a */
/* loaded from: classes.dex */
public final class C0649a {
    /* renamed from: a */
    public static boolean m155a() {
        return m154b().getBoolean(atm.m897d("2813161C1D0A29151E10"), true);
    }

    /* renamed from: b */
    private static SharedPreferences m154b() {
        Application context = Init.context();
        return context.getSharedPreferences(Init.context().getPackageName() + atm.m897d("350A08102A3D181F1416292B"), 0);
    }

    /* renamed from: c */
    public static String m153c(String str) {
        return m154b().getString(str, "");
    }

    /* renamed from: d */
    public static void m152d(String str, Object obj) {
        SharedPreferences.Editor putLong;
        if (obj == null) {
            return;
        }
        if (obj instanceof String) {
            putLong = m154b().edit().putString(str, (String) obj);
        } else if (obj instanceof Boolean) {
            putLong = m154b().edit().putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            putLong = m154b().edit().putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Integer) {
            putLong = m154b().edit().putInt(str, ((Integer) obj).intValue());
        } else if (!(obj instanceof Long)) {
            return;
        } else {
            putLong = m154b().edit().putLong(str, ((Long) obj).longValue());
        }
        putLong.apply();
    }
}
