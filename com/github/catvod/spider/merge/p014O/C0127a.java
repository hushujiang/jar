package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.C0068C;
import com.github.catvod.spider.merge.p016Q.C0189k;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.O.a */
/* loaded from: classes.dex */
public final class C0127a {

    /* renamed from: a */
    public final List<AbstractC0151m> f234a = new ArrayList();

    /* renamed from: b */
    public final List<AbstractC0169v> f235b = new ArrayList();

    /* renamed from: c */
    public C0134d0[] f236c;

    /* renamed from: d */
    public C0136e0[] f237d;

    /* renamed from: e */
    public final int f238e;

    /* renamed from: f */
    public final int f239f;

    /* renamed from: g */
    public int[] f240g;

    /* renamed from: h */
    public InterfaceC0104C[] f241h;

    /* renamed from: i */
    public final List<C0162r0> f242i;

    public C0127a(int i, int i2) {
        new LinkedHashMap();
        this.f242i = new ArrayList();
        this.f238e = i;
        this.f239f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: a */
    public final void m1272a(AbstractC0151m abstractC0151m) {
        if (abstractC0151m != null) {
            abstractC0151m.f281a = this;
            abstractC0151m.f282b = this.f234a.size();
        }
        this.f234a.add(abstractC0151m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.v>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.O.v>, java.util.ArrayList] */
    /* renamed from: b */
    public final AbstractC0169v m1271b(int i) {
        if (this.f235b.isEmpty()) {
            return null;
        }
        return (AbstractC0169v) this.f235b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: c */
    public final C0189k m1270c(int i, C0068C c0068c) {
        if (i < 0 || i >= this.f234a.size()) {
            throw new IllegalArgumentException(atm.m897d("23140C1420310E5A09012D2C0F5A1400213A0F0854"));
        }
        C0189k m1268e = m1268e((AbstractC0151m) this.f234a.get(i));
        if (m1268e.m1201d(-2)) {
            C0189k c0189k = new C0189k(new int[0]);
            c0189k.m1202c(m1268e);
            c0189k.m1197h();
            while (c0068c != null && c0068c.f112b >= 0 && m1268e.m1201d(-2)) {
                m1268e = m1268e(((C0138f0) ((AbstractC0151m) this.f234a.get(c0068c.f112b)).m1243d(0)).f263c);
                c0189k.m1202c(m1268e);
                c0189k.m1197h();
                c0068c = c0068c.f111a;
            }
            if (m1268e.m1201d(-2)) {
                c0189k.m1204a(-1);
            }
            return c0189k;
        }
        return m1268e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<com.github.catvod.spider.merge.O.v>, java.util.ArrayList] */
    /* renamed from: d */
    public final int m1269d() {
        return this.f235b.size();
    }

    /* renamed from: e */
    public final C0189k m1268e(AbstractC0151m abstractC0151m) {
        C0189k c0189k = abstractC0151m.f286f;
        if (c0189k != null) {
            return c0189k;
        }
        C0189k m1267f = m1267f(abstractC0151m, null);
        abstractC0151m.f286f = m1267f;
        m1267f.m1196i();
        return abstractC0151m.f286f;
    }

    /* renamed from: f */
    public final C0189k m1267f(AbstractC0151m abstractC0151m, C0068C c0068c) {
        C0172y c0172y = new C0172y(this);
        C0189k c0189k = new C0189k(new int[0]);
        c0172y.m1231a(abstractC0151m, c0068c != null ? AbstractC0124X.m1277a(abstractC0151m.f281a, c0068c) : null, c0189k, new HashSet(), new BitSet());
        return c0189k;
    }
}
