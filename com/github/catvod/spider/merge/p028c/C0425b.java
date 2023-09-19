package com.github.catvod.spider.merge.p028c;

import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.c.b */
/* loaded from: classes.dex */
public final class C0425b {
    @SerializedName("items")

    /* renamed from: a */
    private List<C0425b> f847a;
    @SerializedName("next_marker")

    /* renamed from: b */
    private String f848b;
    @SerializedName("file_id")

    /* renamed from: c */
    private String f849c;
    @SerializedName("share_id")

    /* renamed from: d */
    private String f850d;
    @SerializedName("name")

    /* renamed from: e */
    private String f851e;
    @SerializedName("type")

    /* renamed from: f */
    private String f852f;
    @SerializedName("file_extension")

    /* renamed from: g */
    private String f853g;
    @SerializedName("category")

    /* renamed from: h */
    private String f854h;
    @SerializedName("size")

    /* renamed from: i */
    private double f855i;
    @SerializedName("parent")

    /* renamed from: j */
    private String f856j;

    public C0425b(String str) {
        this.f849c = str;
    }

    /* renamed from: a */
    public final String m634a() {
        return TextUtils.isEmpty(this.f854h) ? "" : this.f854h;
    }

    /* renamed from: b */
    public final String m633b() {
        String sb;
        String[] strArr = new String[3];
        boolean isEmpty = TextUtils.isEmpty(this.f856j);
        String str = "";
        String m897d = atm.m897d("37");
        String m897d2 = atm.m897d("31");
        if (isEmpty) {
            sb = "";
        } else {
            StringBuilder m635a = C0424a.m635a(m897d2);
            m635a.append(this.f856j);
            m635a.append(m897d);
            sb = m635a.toString();
        }
        strArr[0] = sb;
        strArr[1] = m629f();
        if (this.f855i != 0.0d) {
            StringBuilder m635a2 = C0424a.m635a(m897d2);
            m635a2.append(C0652d.m146e(this.f855i));
            m635a2.append(m897d);
            str = m635a2.toString();
        }
        strArr[2] = str;
        return TextUtils.join(atm.m897d("4A"), Arrays.asList(strArr)).trim();
    }

    /* renamed from: c */
    public final String m632c() {
        return TextUtils.isEmpty(this.f853g) ? "" : this.f853g;
    }

    /* renamed from: d */
    public final String m631d() {
        return TextUtils.isEmpty(this.f849c) ? "" : this.f849c;
    }

    /* renamed from: e */
    public final List<C0425b> m630e() {
        List<C0425b> list = this.f847a;
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: f */
    public final String m629f() {
        return TextUtils.isEmpty(this.f851e) ? "" : this.f851e;
    }

    /* renamed from: g */
    public final String m628g() {
        return TextUtils.isEmpty(this.f848b) ? "" : this.f848b;
    }

    /* renamed from: h */
    public final String m627h() {
        return TextUtils.isEmpty(this.f852f) ? "" : this.f852f;
    }

    /* renamed from: i */
    public final C0425b m626i(String str) {
        this.f856j = str;
        return this;
    }
}
