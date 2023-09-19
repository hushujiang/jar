package com.github.catvod.spider.merge.p036g;

import android.net.Uri;
import android.text.TextUtils;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p055q.C0652d;
import com.google.gson.annotations.SerializedName;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.g.a */
/* loaded from: classes.dex */
public final class C0527a {
    @SerializedName("drives")

    /* renamed from: a */
    private List<C0527a> f952a;
    @SerializedName("name")

    /* renamed from: b */
    private String f953b;
    @SerializedName("server")

    /* renamed from: c */
    private String f954c;
    @SerializedName("user")

    /* renamed from: d */
    private String f955d;
    @SerializedName("pass")

    /* renamed from: e */
    private String f956e;
    @SerializedName("path")

    /* renamed from: f */
    private String f957f;
    @SerializedName("webdav")

    /* renamed from: g */
    private Sardine f958g;

    public C0527a(String str) {
        this.f953b = str;
    }

    /* renamed from: a */
    public final List<C0527a> m403a() {
        List<C0527a> list = this.f952a;
        return list == null ? new ArrayList() : list;
    }

    /* renamed from: b */
    public final String m402b() {
        return (TextUtils.isEmpty(this.f954c) ? "" : this.f954c).replace(m400d(), "");
    }

    /* renamed from: c */
    public final String m401c() {
        return TextUtils.isEmpty(this.f953b) ? "" : this.f953b;
    }

    /* renamed from: d */
    public final String m400d() {
        return TextUtils.isEmpty(this.f957f) ? "" : this.f957f;
    }

    /* renamed from: e */
    public final Sardine m399e() {
        if (this.f958g == null) {
            OkHttpSardine okHttpSardine = new OkHttpSardine();
            this.f958g = okHttpSardine;
            okHttpSardine.setCredentials(TextUtils.isEmpty(this.f955d) ? "" : this.f955d, TextUtils.isEmpty(this.f956e) ? "" : this.f956e);
            String path = Uri.parse(TextUtils.isEmpty(this.f954c) ? "" : this.f954c).getPath();
            this.f957f = TextUtils.isEmpty(path) ? "" : path;
        }
        return this.f958g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0527a) {
            return m401c().equals(((C0527a) obj).m401c());
        }
        return false;
    }

    /* renamed from: f */
    public final C0310h m398f(DavResource davResource, String str) {
        return new C0310h(m401c() + davResource.getPath(), davResource.getName(), str, C0652d.m146e(davResource.getContentLength().longValue()), davResource.isDirectory());
    }
}
