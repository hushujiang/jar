package com.github.catvod.spider.merge.p034f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.f.b */
/* loaded from: classes.dex */
public final class C0519b {
    @SerializedName("title")

    /* renamed from: a */
    private String f940a;
    @SerializedName("page_url")

    /* renamed from: b */
    private String f941b;
    @SerializedName("insert_time")

    /* renamed from: c */
    private String f942c;

    /* renamed from: a */
    public final String m466a() {
        return TextUtils.isEmpty(this.f941b) ? "" : this.f941b;
    }

    /* renamed from: b */
    public final String m465b() {
        return TextUtils.isEmpty(this.f940a) ? "" : this.f940a.replaceAll(atm.m897d("561F174B"), "").replaceAll(atm.m897d("56551F1872"), "");
    }

    /* renamed from: c */
    public final C0310h m464c() {
        return new C0310h(TextUtils.isEmpty(this.f941b) ? "" : this.f941b, m465b(), atm.m897d("020E0E053F624555131B292F19541D0125350D54191A2177041F0D062D281A2518016368454B49477A6B52494D4D7961454B4A457C"), TextUtils.isEmpty(this.f942c) ? "" : this.f942c);
    }

    /* renamed from: d */
    public final C0519b m463d(String str) {
        this.f941b = str;
        return this;
    }
}
