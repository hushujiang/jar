package com.github.catvod.spider.merge.p032e;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p026b.C0310h;
import com.github.catvod.spider.merge.p028c.C0424a;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.e.b */
/* loaded from: classes.dex */
public final class C0486b {
    @SerializedName("key")

    /* renamed from: a */
    private String f914a;
    @SerializedName("cat")

    /* renamed from: b */
    private String f915b;
    @SerializedName("title")

    /* renamed from: c */
    private String f916c;
    @SerializedName("date")

    /* renamed from: d */
    private String f917d;

    /* renamed from: a */
    public static List<C0486b> m570a(String str) {
        return (List) new Gson().fromJson(str, new C0485a().getType());
    }

    /* renamed from: b */
    public final String m569b() {
        return this.f915b;
    }

    /* renamed from: c */
    public final String m568c() {
        return this.f916c;
    }

    /* renamed from: d */
    public final C0310h m567d() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("020E0E053F6245550D023B760B16130C39360E08130329760915175A3F77"));
        m635a.append(this.f914a);
        return new C0310h(m635a.toString(), this.f916c, atm.m897d("020E0E053F6245550D023B76061D09012D2C0319541623354513551C21390D1F485A01685B554B40636F2F553912231A5F1603060000293B3E127A022B3B38143C19222F1424016B584B541F3C3F"), this.f917d);
    }
}
