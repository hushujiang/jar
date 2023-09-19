package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p010K.C0052e;

/* renamed from: com.github.catvod.spider.merge.O.z */
/* loaded from: classes.dex */
public final class C0173z extends C0129b {

    /* renamed from: f */
    private final C0105D f304f;

    /* renamed from: g */
    private final boolean f305g;

    public C0173z(AbstractC0151m abstractC0151m, int i, AbstractC0124X abstractC0124X) {
        super(abstractC0151m, i, abstractC0124X, AbstractC0150l0.f280a);
        this.f305g = false;
        this.f304f = null;
    }

    public C0173z(C0173z c0173z, AbstractC0151m abstractC0151m) {
        super(c0173z, abstractC0151m, c0173z.f245c, c0173z.f247e);
        this.f304f = c0173z.f304f;
        this.f305g = m1229d(c0173z, abstractC0151m);
    }

    public C0173z(C0173z c0173z, AbstractC0151m abstractC0151m, C0105D c0105d) {
        super(c0173z, abstractC0151m, c0173z.f245c, c0173z.f247e);
        this.f304f = c0105d;
        this.f305g = m1229d(c0173z, abstractC0151m);
    }

    public C0173z(C0173z c0173z, AbstractC0151m abstractC0151m, AbstractC0124X abstractC0124X) {
        super(c0173z, abstractC0151m, abstractC0124X, c0173z.f247e);
        this.f304f = c0173z.f304f;
        this.f305g = m1229d(c0173z, abstractC0151m);
    }

    /* renamed from: d */
    private static boolean m1229d(C0173z c0173z, AbstractC0151m abstractC0151m) {
        return c0173z.f305g || ((abstractC0151m instanceof AbstractC0169v) && ((AbstractC0169v) abstractC0151m).f301h);
    }

    @Override // com.github.catvod.spider.merge.p014O.C0129b
    /* renamed from: a */
    public final boolean mo1230a(C0129b c0129b) {
        boolean z = true;
        if (this == c0129b) {
            return true;
        }
        if (c0129b instanceof C0173z) {
            C0173z c0173z = (C0173z) c0129b;
            if (this.f305g != c0173z.f305g) {
                return false;
            }
            C0105D c0105d = this.f304f;
            C0105D c0105d2 = c0173z.f304f;
            if (c0105d != null) {
                z = c0105d.equals(c0105d2);
            } else if (c0105d2 != null) {
                z = false;
            }
            if (z) {
                return super.mo1230a(c0129b);
            }
            return false;
        }
        return false;
    }

    /* renamed from: e */
    public final C0105D m1228e() {
        return this.f304f;
    }

    /* renamed from: f */
    public final boolean m1227f() {
        return this.f305g;
    }

    @Override // com.github.catvod.spider.merge.p014O.C0129b
    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1410i(C0052e.m1411h(C0052e.m1410i(C0052e.m1410i(C0052e.m1411h(C0052e.m1411h(7, this.f243a.f282b), this.f244b), this.f245c), this.f247e), this.f305g ? 1 : 0), this.f304f), 6);
    }
}
