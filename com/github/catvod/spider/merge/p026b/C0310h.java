package com.github.catvod.spider.merge.p026b;

import com.github.catvod.spider.merge.atm;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.github.catvod.spider.merge.b.h */
/* loaded from: classes.dex */
public final class C0310h {
    @SerializedName("type_name")

    /* renamed from: a */
    private String f584a;
    @SerializedName("vod_id")

    /* renamed from: b */
    private String f585b;
    @SerializedName("vod_name")

    /* renamed from: c */
    private String f586c;
    @SerializedName("vod_pic")

    /* renamed from: d */
    private String f587d;
    @SerializedName("vod_remarks")

    /* renamed from: e */
    private String f588e;
    @SerializedName("vod_year")

    /* renamed from: f */
    private String f589f;
    @SerializedName("vod_area")

    /* renamed from: g */
    private String f590g;
    @SerializedName("vod_actor")

    /* renamed from: h */
    private String f591h;
    @SerializedName("vod_director")

    /* renamed from: i */
    private String f592i;
    @SerializedName("vod_content")

    /* renamed from: j */
    private String f593j;
    @SerializedName("vod_play_from")

    /* renamed from: k */
    private String f594k;
    @SerializedName("vod_play_url")

    /* renamed from: l */
    private String f595l;
    @SerializedName("vod_tag")

    /* renamed from: m */
    private String f596m;

    public C0310h() {
    }

    public C0310h(String str, String str2, String str3) {
        this.f585b = str;
        this.f586c = str2;
        this.f587d = str3;
    }

    /* renamed from: a */
    public final String m874a() {
        return this.f593j;
    }

    /* renamed from: b */
    public final void m873b(String str) {
        this.f584a = str;
    }

    /* renamed from: c */
    public final void m872c(String str) {
        this.f591h = str;
    }

    /* renamed from: d */
    public final void m871d(String str) {
        this.f590g = str;
    }

    /* renamed from: e */
    public final void m870e(String str) {
        this.f593j = str;
    }

    /* renamed from: f */
    public final void m869f(String str) {
        this.f592i = str;
    }

    /* renamed from: g */
    public final void m868g(String str) {
        this.f585b = str;
    }

    /* renamed from: h */
    public final void m867h(String str) {
        this.f586c = str;
    }

    /* renamed from: i */
    public final void m866i(String str) {
        this.f587d = str;
    }

    /* renamed from: j */
    public final void m865j(String str) {
        this.f594k = str;
    }

    /* renamed from: k */
    public final void m864k(String str) {
        this.f595l = str;
    }

    /* renamed from: l */
    public final void m863l(String str) {
        this.f588e = str;
    }

    /* renamed from: m */
    public final void m862m(String str) {
        this.f596m = str;
    }

    /* renamed from: n */
    public final void m861n(String str) {
        this.f589f = str;
    }

    public C0310h(String str, String str2, String str3, String str4) {
        this.f585b = str;
        this.f586c = str2;
        this.f587d = str3;
        this.f588e = str4;
    }

    public C0310h(String str, String str2, String str3, String str4, boolean z) {
        this.f585b = str;
        this.f586c = str2;
        this.f587d = str3;
        this.f588e = str4;
        this.f596m = z ? atm.m897d("0C151611292A") : atm.m897d("0C131610");
    }
}
