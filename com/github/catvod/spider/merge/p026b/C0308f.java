package com.github.catvod.spider.merge.p026b;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.github.catvod.spider.merge.b.f */
/* loaded from: classes.dex */
public final class C0308f {
    @SerializedName("class")

    /* renamed from: a */
    private List<C0304b> f568a;
    @SerializedName("list")

    /* renamed from: b */
    private List<C0310h> f569b;
    @SerializedName("filters")

    /* renamed from: c */
    private LinkedHashMap<String, List<C0306d>> f570c;
    @SerializedName("header")

    /* renamed from: d */
    private String f571d;
    @SerializedName("url")

    /* renamed from: e */
    private String f572e;
    @SerializedName("subs")

    /* renamed from: f */
    private List<C0309g> f573f;
    @SerializedName("parse")

    /* renamed from: g */
    private int f574g;
    @SerializedName("jx")

    /* renamed from: h */
    private int f575h;
    @SerializedName("page")

    /* renamed from: i */
    private int f576i;
    @SerializedName("pagecount")

    /* renamed from: j */
    private int f577j;
    @SerializedName("limit")

    /* renamed from: k */
    private int f578k;
    @SerializedName("total")

    /* renamed from: l */
    private int f579l;

    /* renamed from: g */
    public static String m888g(C0310h c0310h) {
        C0308f c0308f = new C0308f();
        c0308f.f569b = Arrays.asList(c0310h);
        return c0308f.toString();
    }

    /* renamed from: h */
    public static String m887h(List<C0310h> list) {
        C0308f c0308f = new C0308f();
        c0308f.f569b = list;
        return c0308f.toString();
    }

    /* renamed from: i */
    public static String m886i(List<C0304b> list, LinkedHashMap<String, List<C0306d>> linkedHashMap) {
        C0308f c0308f = new C0308f();
        c0308f.f568a = list;
        c0308f.f570c = linkedHashMap;
        return c0308f.toString();
    }

    /* renamed from: j */
    public static String m885j(List<C0304b> list, List<C0310h> list2) {
        C0308f c0308f = new C0308f();
        c0308f.f568a = list;
        c0308f.f569b = list2;
        return c0308f.toString();
    }

    /* renamed from: k */
    public static String m884k(List<C0304b> list, List<C0310h> list2, LinkedHashMap<String, List<C0306d>> linkedHashMap) {
        C0308f c0308f = new C0308f();
        c0308f.f568a = list;
        c0308f.f569b = list2;
        c0308f.f570c = linkedHashMap;
        return c0308f.toString();
    }

    /* renamed from: l */
    public static String m883l(List<C0304b> list, List<C0310h> list2, JSONObject jSONObject) {
        C0308f c0308f = new C0308f();
        c0308f.f568a = list;
        c0308f.f569b = list2;
        c0308f.m894a(jSONObject);
        return c0308f.toString();
    }

    /* renamed from: m */
    public static String m882m(List<C0304b> list, JSONObject jSONObject) {
        C0308f c0308f = new C0308f();
        c0308f.f568a = list;
        c0308f.m894a(jSONObject);
        return c0308f.toString();
    }

    /* renamed from: a */
    public final C0308f m894a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this;
        }
        this.f570c = (LinkedHashMap) new Gson().fromJson(jSONObject.toString(), new C0307e().getType());
        return this;
    }

    /* renamed from: b */
    public final List<C0310h> m893b() {
        List<C0310h> list = this.f569b;
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: c */
    public final C0308f m892c(Map<String, String> map) {
        if (map.isEmpty()) {
            return this;
        }
        this.f571d = new Gson().toJson(map);
        return this;
    }

    /* renamed from: d */
    public final C0308f m891d() {
        this.f575h = 1;
        return this;
    }

    /* renamed from: e */
    public final C0308f m890e() {
        this.f576i = 1;
        this.f578k = Integer.MAX_VALUE;
        this.f579l = 1;
        this.f577j = 1;
        return this;
    }

    /* renamed from: f */
    public final C0308f m889f() {
        this.f574g = 1;
        return this;
    }

    /* renamed from: n */
    public final C0308f m881n(List<C0309g> list) {
        this.f573f = list;
        return this;
    }

    /* renamed from: o */
    public final C0308f m880o(String str) {
        this.f572e = str;
        return this;
    }

    /* renamed from: p */
    public final C0308f m879p(List<C0310h> list) {
        this.f569b = list;
        return this;
    }

    public final String toString() {
        return new Gson().toJson(this);
    }
}
