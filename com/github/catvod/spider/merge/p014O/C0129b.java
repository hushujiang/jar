package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;

/* renamed from: com.github.catvod.spider.merge.O.b */
/* loaded from: classes.dex */
public class C0129b {

    /* renamed from: a */
    public final AbstractC0151m f243a;

    /* renamed from: b */
    public final int f244b;

    /* renamed from: c */
    public AbstractC0124X f245c;

    /* renamed from: d */
    public int f246d;

    /* renamed from: e */
    public final AbstractC0150l0 f247e;

    public C0129b(C0129b c0129b, AbstractC0151m abstractC0151m, AbstractC0124X abstractC0124X, AbstractC0150l0 abstractC0150l0) {
        this.f243a = abstractC0151m;
        this.f244b = c0129b.f244b;
        this.f245c = abstractC0124X;
        this.f247e = abstractC0150l0;
        this.f246d = c0129b.f246d;
    }

    public C0129b(AbstractC0151m abstractC0151m, int i, AbstractC0124X abstractC0124X, AbstractC0150l0 abstractC0150l0) {
        this.f243a = abstractC0151m;
        this.f244b = i;
        this.f245c = abstractC0124X;
        this.f247e = abstractC0150l0;
    }

    /* renamed from: a */
    public boolean mo1230a(C0129b c0129b) {
        AbstractC0124X abstractC0124X;
        AbstractC0124X abstractC0124X2;
        if (this == c0129b) {
            return true;
        }
        return c0129b != null && this.f243a.f282b == c0129b.f243a.f282b && this.f244b == c0129b.f244b && ((abstractC0124X = this.f245c) == (abstractC0124X2 = c0129b.f245c) || (abstractC0124X != null && abstractC0124X.equals(abstractC0124X2))) && this.f247e.equals(c0129b.f247e) && m1265c() == c0129b.m1265c();
    }

    /* renamed from: b */
    public final int m1266b() {
        return this.f246d & (-1073741825);
    }

    /* renamed from: c */
    public final boolean m1265c() {
        return (this.f246d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0129b) {
            return mo1230a((C0129b) obj);
        }
        return false;
    }

    public int hashCode() {
        return C0052e.m1415d(C0052e.m1410i(C0052e.m1410i(C0052e.m1411h(C0052e.m1411h(7, this.f243a.f282b), this.f244b), this.f245c), this.f247e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f243a);
        String m897d = atm.m897d("46");
        sb.append(m897d);
        sb.append(this.f244b);
        if (this.f245c != null) {
            sb.append(atm.m897d("4621"));
            sb.append(this.f245c.toString());
            sb.append(atm.m897d("37"));
        }
        AbstractC0150l0 abstractC0150l0 = this.f247e;
        if (abstractC0150l0 != null && abstractC0150l0 != AbstractC0150l0.f280a) {
            sb.append(m897d);
            sb.append(this.f247e);
        }
        if (m1266b() > 0) {
            sb.append(atm.m897d("460F0A48"));
            sb.append(m1266b());
        }
        sb.append(')');
        return sb.toString();
    }
}
