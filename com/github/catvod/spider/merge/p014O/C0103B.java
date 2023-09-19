package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.AbstractC0094s;
import com.github.catvod.spider.merge.p013N.InterfaceC0079d;
import com.github.catvod.spider.merge.p015P.C0175b;
import com.github.catvod.spider.merge.p015P.C0178e;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.O.B */
/* loaded from: classes.dex */
public final class C0103B extends AbstractC0149l {

    /* renamed from: d */
    protected final AbstractC0094s f187d;

    /* renamed from: e */
    protected int f188e;

    /* renamed from: f */
    protected int f189f;

    /* renamed from: g */
    protected int f190g;

    /* renamed from: h */
    public final C0175b[] f191h;

    /* renamed from: i */
    protected int f192i;

    /* renamed from: j */
    protected final C0102A f193j;

    public C0103B(AbstractC0094s abstractC0094s, C0127a c0127a, C0175b[] c0175bArr, C0125Y c0125y) {
        super(c0127a, c0125y);
        this.f188e = -1;
        this.f189f = 1;
        this.f190g = 0;
        this.f192i = 0;
        this.f193j = new C0102A();
        this.f191h = c0175bArr;
        this.f187d = abstractC0094s;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0149l
    /* renamed from: a */
    public final void mo1251a() {
        C0102A c0102a = this.f193j;
        c0102a.f183a = -1;
        c0102a.f184b = 0;
        c0102a.f185c = -1;
        c0102a.f186d = null;
        this.f188e = -1;
        this.f189f = 1;
        this.f190g = 0;
        this.f192i = 0;
    }

    /* renamed from: b */
    protected final void m1309b(C0178e c0178e, int i, C0178e c0178e2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c0178e) {
            if (c0178e.f317c == null) {
                c0178e.f317c = new C0178e[128];
            }
            c0178e.f317c[i + 0] = c0178e2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* renamed from: c */
    protected final C0178e m1308c(C0137f c0137f) {
        C0129b c0129b;
        C0178e c0178e = new C0178e(c0137f);
        Iterator<C0129b> it = c0137f.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0129b = null;
                break;
            }
            c0129b = it.next();
            if (c0129b.f243a instanceof C0136e0) {
                break;
            }
        }
        if (c0129b != null) {
            c0178e.f318d = true;
            c0178e.f320f = ((C0173z) c0129b).m1228e();
            c0178e.f319e = this.f278a.f240g[c0129b.f243a.f283c];
        }
        C0175b c0175b = this.f191h[this.f192i];
        synchronized (c0175b.f306a) {
            C0178e c0178e2 = (C0178e) c0175b.f306a.get(c0178e);
            if (c0178e2 != null) {
                return c0178e2;
            }
            c0178e.f315a = c0175b.f306a.size();
            c0137f.f253a = true;
            c0137f.f254b = null;
            c0178e.f316b = c0137f;
            c0175b.f306a.put(c0178e, c0178e);
            return c0178e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: d */
    protected final boolean m1307d(InterfaceC0079d interfaceC0079d, C0173z c0173z, C0137f c0137f, boolean z, boolean z2, boolean z3) {
        C0173z c0173z2;
        C0173z c0173z3;
        AbstractC0151m abstractC0151m = c0173z.f243a;
        boolean z4 = true;
        if (abstractC0151m instanceof C0136e0) {
            AbstractC0124X abstractC0124X = c0173z.f245c;
            if (abstractC0124X == null || abstractC0124X.m1275e()) {
                AbstractC0124X abstractC0124X2 = c0173z.f245c;
                if (abstractC0124X2 != null && !abstractC0124X2.mo1237f()) {
                    c0137f.m1261a(new C0173z(c0173z, c0173z.f243a, AbstractC0124X.f230b), null);
                } else {
                    c0137f.m1261a(c0173z, null);
                    return true;
                }
            } else {
                z4 = z;
            }
            AbstractC0124X abstractC0124X3 = c0173z.f245c;
            if (abstractC0124X3 == null || abstractC0124X3.mo1237f()) {
                return z4;
            }
            boolean z5 = z4;
            for (int i = 0; i < c0173z.f245c.mo1236h(); i++) {
                if (c0173z.f245c.mo1238d(i) != Integer.MAX_VALUE) {
                    z5 = m1307d(interfaceC0079d, new C0173z(c0173z, (AbstractC0151m) this.f278a.f234a.get(c0173z.f245c.mo1238d(i)), c0173z.f245c.mo1239c(i)), c0137f, z5, z2, z3);
                }
            }
            return z5;
        }
        if (!abstractC0151m.f284d && (!z || !c0173z.m1227f())) {
            c0137f.m1261a(c0173z, null);
        }
        AbstractC0151m abstractC0151m2 = c0173z.f243a;
        boolean z6 = z;
        for (int i2 = 0; i2 < abstractC0151m2.m1244b(); i2++) {
            AbstractC0166t0 m1243d = abstractC0151m2.m1243d(i2);
            int mo1235a = m1243d.mo1235a();
            if (mo1235a != 10) {
                switch (mo1235a) {
                    case 1:
                        c0173z3 = new C0173z(c0173z, m1243d.f298a);
                        c0173z2 = c0173z3;
                        break;
                    case 2:
                    case 5:
                    case 7:
                        if (z3 && m1243d.mo1233d(-1, 1114111)) {
                            c0173z3 = new C0173z(c0173z, m1243d.f298a);
                            c0173z2 = c0173z3;
                            break;
                        }
                        c0173z2 = null;
                        break;
                    case 3:
                        c0173z2 = new C0173z(c0173z, m1243d.f298a, C0154n0.m1242i(c0173z.f245c, ((C0138f0) m1243d).f263c.f282b));
                        break;
                    case 4:
                        C0123W c0123w = (C0123W) m1243d;
                        c0137f.f258f = true;
                        if (this.f187d != null && z2) {
                            int i3 = this.f190g;
                            int i4 = this.f189f;
                            int mo1342i = interfaceC0079d.mo1342i();
                            interfaceC0079d.mo1345e();
                            try {
                                m1306e(interfaceC0079d);
                                this.f187d.getClass();
                            } finally {
                                this.f190g = i3;
                                this.f189f = i4;
                                interfaceC0079d.mo1344f(mo1342i);
                                interfaceC0079d.mo1346a();
                            }
                        }
                        c0173z3 = new C0173z(c0173z, m1243d.f298a);
                        c0173z2 = c0173z3;
                        break;
                    case 6:
                        AbstractC0124X abstractC0124X4 = c0173z.f245c;
                        if (abstractC0124X4 != null && !abstractC0124X4.m1275e()) {
                            c0173z3 = new C0173z(c0173z, m1243d.f298a);
                            c0173z2 = c0173z3;
                            break;
                        } else {
                            c0173z2 = new C0173z(c0173z, m1243d.f298a, C0105D.m1300a(c0173z.m1228e(), this.f278a.f241h[((C0155o) m1243d).f291c]));
                            break;
                        }
                        break;
                    default:
                        c0173z2 = null;
                        break;
                }
                if (c0173z2 != null) {
                    z6 = m1307d(interfaceC0079d, c0173z2, c0137f, z6, z2, z3);
                }
            } else {
                throw new UnsupportedOperationException(atm.m897d("3A081F16293C0F1419106C28181F1E1C2F391E1F09552D2A0F5A141A3878190F0A05232A1E1F1E5525364A161F0D292A1954"));
            }
        }
        return z6;
    }

    /* renamed from: e */
    public final void m1306e(InterfaceC0079d interfaceC0079d) {
        if (interfaceC0079d.mo1343h(1) == 10) {
            this.f189f++;
            this.f190g = 0;
        } else {
            this.f190g++;
        }
        interfaceC0079d.mo1341j();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0124 A[EDGE_INSN: B:86:0x0124->B:69:0x0124 ?: BREAK  , SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int m1305f(com.github.catvod.spider.merge.p013N.InterfaceC0079d r22, com.github.catvod.spider.merge.p015P.C0178e r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0103B.m1305f(com.github.catvod.spider.merge.N.d, com.github.catvod.spider.merge.P.e):int");
    }

    /* renamed from: g */
    public final int m1304g() {
        return this.f190g;
    }

    /* renamed from: h */
    public final int m1303h() {
        return this.f189f;
    }

    /* renamed from: i */
    public final int m1302i(InterfaceC0079d interfaceC0079d, int i) {
        this.f192i = i;
        interfaceC0079d.mo1345e();
        try {
            this.f188e = interfaceC0079d.mo1342i();
            C0102A c0102a = this.f193j;
            c0102a.f183a = -1;
            c0102a.f184b = 0;
            c0102a.f185c = -1;
            c0102a.f186d = null;
            C0175b c0175b = this.f191h[i];
            return c0175b.f307b == null ? m1301j(interfaceC0079d) : m1305f(interfaceC0079d, c0175b.f307b);
        } finally {
            interfaceC0079d.mo1346a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.github.catvod.spider.merge.O.r0>, java.util.ArrayList] */
    /* renamed from: j */
    protected final int m1301j(InterfaceC0079d interfaceC0079d) {
        AbstractC0151m abstractC0151m = (AbstractC0151m) this.f278a.f242i.get(this.f192i);
        C0170w c0170w = AbstractC0124X.f230b;
        C0118Q c0118q = new C0118Q();
        int i = 0;
        while (i < abstractC0151m.m1244b()) {
            int i2 = i + 1;
            m1307d(interfaceC0079d, new C0173z(abstractC0151m.m1243d(i).f298a, i2, c0170w), c0118q, false, false, false);
            i = i2;
        }
        boolean z = c0118q.f258f;
        c0118q.f258f = false;
        C0178e m1308c = m1308c(c0118q);
        if (!z) {
            this.f191h[this.f192i].f307b = m1308c;
        }
        return m1305f(interfaceC0079d, m1308c);
    }
}
