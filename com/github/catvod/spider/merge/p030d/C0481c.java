package com.github.catvod.spider.merge.p030d;

import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: com.github.catvod.spider.merge.d.c */
/* loaded from: classes.dex */
public final class C0481c {
    @SerializedName("name")

    /* renamed from: a */
    private String f903a;
    @SerializedName(alternate = {"parent"}, value = "path")

    /* renamed from: b */
    private String f904b;
    @SerializedName("type")

    /* renamed from: c */
    private int f905c;
    @SerializedName("size")

    /* renamed from: d */
    private long f906d;
    @SerializedName(alternate = {"thumbnail"}, value = "thumb")

    /* renamed from: e */
    private String f907e;
    @SerializedName(alternate = {"raw_url"}, value = "url")

    /* renamed from: f */
    private String f908f;
    @SerializedName(alternate = {"updated_at"}, value = "modified")

    /* renamed from: g */
    private String f909g;

    /* renamed from: a */
    public static List<C0481c> m588a(String str) {
        return (List) new Gson().fromJson(str, new C0480b().getType());
    }

    /* renamed from: b */
    public final Date m587b() {
        try {
            return new SimpleDateFormat(atm.m897d("1303030C611527571E116B0C4D32324F21355009095B1F0B3920"), Locale.getDefault()).parse(this.f909g);
        } catch (Exception unused) {
            return new Date();
        }
    }

    /* renamed from: c */
    public final String m586c() {
        return TextUtils.isEmpty(this.f903a) ? "" : this.f903a;
    }

    /* renamed from: d */
    public final String m585d(String str) {
        return ((TextUtils.isEmpty(this.f907e) ? "" : this.f907e).isEmpty() && m578k()) ? str : TextUtils.isEmpty(this.f907e) ? "" : this.f907e;
    }

    /* renamed from: e */
    public final long m584e() {
        return this.f906d;
    }

    /* renamed from: f */
    public final String m583f() {
        if (TextUtils.isEmpty(this.f908f)) {
            return "";
        }
        if (this.f908f.startsWith(atm.m897d("4555"))) {
            StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E0576"));
            m635a.append(this.f908f);
            return m635a.toString();
        }
        return this.f908f;
    }

    /* renamed from: g */
    public final C0310h m582g(C0479a c0479a, String str) {
        return new C0310h(m580i(c0479a.m595d()), m586c(), m585d(str), c0479a.m595d(), m578k());
    }

    /* renamed from: h */
    public final C0310h m581h(String str, String str2) {
        return new C0310h(m580i(str), m586c(), m585d(str2), C0652d.m146e(this.f906d), m578k());
    }

    /* renamed from: i */
    public final String m580i(String str) {
        StringBuilder m635a = C0424a.m635a(str);
        m635a.append(TextUtils.isEmpty(this.f904b) ? "" : this.f904b);
        m635a.append(atm.m897d("45"));
        m635a.append(m586c());
        return m635a.toString();
    }

    /* renamed from: j */
    public final boolean m579j(boolean z) {
        if (m586c().endsWith(atm.m897d("440E09"))) {
            return false;
        }
        if (z) {
            int i = this.f905c;
            return i == 0 || i == 4;
        }
        int i2 = this.f905c;
        return i2 == 0 || i2 == 2 || i2 == 5;
    }

    /* renamed from: k */
    public final boolean m578k() {
        return this.f905c == 1;
    }

    /* renamed from: l */
    public final boolean m577l(boolean z) {
        if (z) {
            int i = this.f905c;
            return i == 2 || i == 3;
        }
        int i2 = this.f905c;
        return i2 == 3 || i2 == 4;
    }
}
