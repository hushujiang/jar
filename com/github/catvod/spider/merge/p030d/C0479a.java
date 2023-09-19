package com.github.catvod.spider.merge.p030d;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p042j.C0574b;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.d.a */
/* loaded from: classes.dex */
public final class C0479a {
    @SerializedName("drives")

    /* renamed from: a */
    private List<C0479a> f896a;
    @SerializedName("vodPic")

    /* renamed from: b */
    private String f897b;
    @SerializedName("name")

    /* renamed from: c */
    private String f898c;
    @SerializedName("server")

    /* renamed from: d */
    private String f899d;
    @SerializedName("password")

    /* renamed from: e */
    private String f900e;
    @SerializedName("version")

    /* renamed from: f */
    private int f901f;
    @SerializedName("path")

    /* renamed from: g */
    private String f902g;

    public C0479a(String str) {
        this.f898c = str;
    }

    /* renamed from: a */
    public final C0479a m598a() {
        if (this.f902g == null) {
            String path = Uri.parse(TextUtils.isEmpty(this.f899d) ? "" : this.f899d).getPath();
            this.f902g = TextUtils.isEmpty(path) ? "" : path;
        }
        if (this.f901f == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(m596c());
            sb.append(atm.m897d("451B0A1C63281F18161C2F77191F0E0125360D09"));
            this.f901f = C0574b.m307f(sb.toString(), null, null).contains(atm.m897d("1C4854")) ? 2 : 3;
        }
        return this;
    }

    /* renamed from: b */
    public final List<C0479a> m597b() {
        List<C0479a> list = this.f896a;
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: c */
    public final String m596c() {
        return (TextUtils.isEmpty(this.f899d) ? "" : this.f899d).replace(m593f(), "");
    }

    /* renamed from: d */
    public final String m595d() {
        return TextUtils.isEmpty(this.f898c) ? "" : this.f898c;
    }

    /* renamed from: e */
    public final String m594e() {
        return TextUtils.isEmpty(this.f900e) ? "" : this.f900e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0479a) {
            return m595d().equals(((C0479a) obj).m595d());
        }
        return false;
    }

    /* renamed from: f */
    public final String m593f() {
        return TextUtils.isEmpty(this.f902g) ? "" : this.f902g;
    }

    /* renamed from: g */
    public final String m592g() {
        return TextUtils.isEmpty(this.f897b) ? atm.m897d("020E0E053F62455509446239124B025B2F37075548457E6B454A4F5A7C6C450A43012B11524B5405223F") : this.f897b;
    }

    /* renamed from: h */
    public final boolean m591h() {
        return this.f901f == 3;
    }

    /* renamed from: i */
    public final String m590i(String str) {
        HashMap hashMap;
        Gson gson;
        boolean m591h = m591h();
        String m897d = atm.m897d("45");
        if (m591h) {
            hashMap = new HashMap();
            hashMap.put(atm.m897d("011F0302232A0E09"), str);
            hashMap.put(atm.m897d("1A1B1D10"), 1);
            hashMap.put(atm.m897d("1A1B0810222C"), m897d);
            hashMap.put(atm.m897d("1A1F082A3C390D1F"), 100);
            gson = new Gson();
        } else {
            hashMap = new HashMap();
            hashMap.put(atm.m897d("011F0302232A0E"), str);
            hashMap.put(atm.m897d("1A1B0E1D"), m897d);
            gson = new Gson();
        }
        return gson.toJson(hashMap);
    }

    /* renamed from: j */
    public final String m589j() {
        StringBuilder sb = new StringBuilder();
        sb.append(m596c());
        sb.append(m591h() ? atm.m897d("451B0A1C633E195509102D2A0912") : atm.m897d("451B0A1C63281F18161C2F77191F1B072F30"));
        return sb.toString();
    }
}
