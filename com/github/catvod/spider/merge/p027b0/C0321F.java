package com.github.catvod.spider.merge.p027b0;

import com.github.catvod.spider.merge.p025a0.C0288h;
import java.io.StringReader;

/* renamed from: com.github.catvod.spider.merge.b0.F */
/* loaded from: classes.dex */
public final class C0321F {

    /* renamed from: a */
    private AbstractC0391j1 f668a;

    /* renamed from: b */
    private C0317D f669b = new C0317D();

    public C0321F(AbstractC0391j1 abstractC0391j1) {
        this.f668a = abstractC0391j1;
    }

    /* renamed from: d */
    public static C0288h m846d(String str) {
        AbstractC0341P m765u;
        C0365b c0365b = new C0365b();
        c0365b.mo647c(new StringReader(str), new C0321F(c0365b));
        C0346S c0346s = c0365b.f838c;
        do {
            m765u = c0346s.m765u();
            c0365b.mo645e(m765u);
            m765u.mo803h();
        } while (m765u.f705a != 6);
        c0365b.f837b.m742d();
        c0365b.f837b = null;
        c0365b.f838c = null;
        c0365b.f840e = null;
        c0365b.f844i = null;
        return c0365b.f839d;
    }

    /* renamed from: a */
    public final C0317D m849a() {
        return this.f669b;
    }

    /* renamed from: b */
    public final boolean m848b(String str) {
        return this.f668a.mo646d(str);
    }

    /* renamed from: c */
    public final boolean m847c() {
        return this.f669b.m856b() > 0;
    }
}
