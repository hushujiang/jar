package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.AbstractC0098w;
import com.github.catvod.spider.merge.p013N.C0068C;
import com.github.catvod.spider.merge.p013N.C0096u;
import com.github.catvod.spider.merge.p013N.C0099x;
import com.github.catvod.spider.merge.p013N.C0100y;
import com.github.catvod.spider.merge.p013N.InterfaceC0072G;
import com.github.catvod.spider.merge.p015P.C0175b;
import com.github.catvod.spider.merge.p015P.C0177d;
import com.github.catvod.spider.merge.p015P.C0178e;
import com.github.catvod.spider.merge.p016Q.C0182d;
import com.github.catvod.spider.merge.p016Q.C0189k;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.O.S */
/* loaded from: classes.dex */
public final class C0119S extends AbstractC0149l {

    /* renamed from: k */
    public static final boolean f217k;

    /* renamed from: d */
    protected final AbstractC0098w f218d;

    /* renamed from: e */
    public final C0175b[] f219e;

    /* renamed from: f */
    protected C0182d<AbstractC0124X, AbstractC0124X, AbstractC0124X> f220f;

    /* renamed from: g */
    protected InterfaceC0072G f221g;

    /* renamed from: h */
    protected int f222h;

    /* renamed from: i */
    protected C0099x f223i;

    /* renamed from: j */
    protected C0175b f224j;

    static {
        String str;
        try {
            str = System.getenv(atm.m897d("3E2F283B13172C3C25391E0726353525131D242E282C131A383B34360407252A2E"));
        } catch (SecurityException unused) {
            str = null;
        }
        f217k = Boolean.parseBoolean(str);
    }

    public C0119S(AbstractC0098w abstractC0098w, C0127a c0127a, C0175b[] c0175bArr, C0125Y c0125y) {
        super(c0127a, c0125y);
        this.f218d = abstractC0098w;
        this.f219e = c0175bArr;
    }

    /* renamed from: o */
    protected static int m1280o(C0137f c0137f) {
        Iterator<C0129b> it = c0137f.iterator();
        int i = 0;
        while (it.hasNext()) {
            C0129b next = it.next();
            if (i == 0) {
                i = next.f244b;
            } else if (next.f244b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0149l
    /* renamed from: a */
    public final void mo1251a() {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.github.catvod.spider.merge.Q.d<com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X>, com.github.catvod.spider.merge.P.b] */
    /* renamed from: b */
    public final int m1293b(InterfaceC0072G interfaceC0072G, int i, C0099x c0099x) {
        this.f221g = interfaceC0072G;
        this.f222h = interfaceC0072G.mo1342i();
        this.f223i = c0099x;
        C0175b c0175b = this.f219e[i];
        this.f224j = c0175b;
        interfaceC0072G.mo1345e();
        int i2 = this.f222h;
        try {
            C0178e m1226a = c0175b.m1225b() ? c0175b.m1226a(this.f218d.m1327p()) : c0175b.f307b;
            if (m1226a == null) {
                if (c0099x == null) {
                    c0099x = C0068C.f110c;
                }
                C0137f m1286i = m1286i(c0175b.f309d, C0068C.f110c, false);
                if (c0175b.m1225b()) {
                    c0175b.f307b.f316b = m1286i;
                    m1226a = m1291d(c0175b, new C0178e(m1290e(m1286i)));
                    c0175b.m1224c(this.f218d.m1327p(), m1226a);
                } else {
                    m1226a = m1291d(c0175b, new C0178e(m1286i));
                    c0175b.f307b = m1226a;
                }
            }
            return m1283l(c0175b, m1226a, interfaceC0072G, i2, c0099x);
        } finally {
            this.f220f = null;
            this.f224j = null;
            interfaceC0072G.mo1344f(i2);
            interfaceC0072G.mo1346a();
        }
    }

    /* renamed from: c */
    protected final C0178e m1292c(C0175b c0175b, C0178e c0178e, int i, C0178e c0178e2) {
        if (c0178e2 == null) {
            return null;
        }
        C0178e m1291d = m1291d(c0175b, c0178e2);
        if (i < -1 || i > this.f278a.f239f) {
            return m1291d;
        }
        synchronized (c0178e) {
            if (c0178e.f317c == null) {
                c0178e.f317c = new C0178e[this.f278a.f239f + 1 + 1];
            }
            c0178e.f317c[i + 1] = m1291d;
        }
        return m1291d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.P.e>] */
    /* renamed from: d */
    protected final C0178e m1291d(C0175b c0175b, C0178e c0178e) {
        if (c0178e == AbstractC0149l.f277c) {
            return c0178e;
        }
        synchronized (c0175b.f306a) {
            C0178e c0178e2 = (C0178e) c0175b.f306a.get(c0178e);
            if (c0178e2 != null) {
                return c0178e2;
            }
            c0178e.f315a = c0175b.f306a.size();
            C0137f c0137f = c0178e.f316b;
            if (!c0137f.f253a) {
                c0137f.m1260b(this);
                C0137f c0137f2 = c0178e.f316b;
                c0137f2.f253a = true;
                c0137f2.f254b = null;
            }
            c0175b.f306a.put(c0178e, c0178e);
            return c0178e;
        }
    }

    /* renamed from: e */
    protected final C0137f m1290e(C0137f c0137f) {
        AbstractC0124X abstractC0124X;
        AbstractC0150l0 mo1247d;
        HashMap hashMap = new HashMap();
        C0137f c0137f2 = new C0137f(c0137f.f260h);
        Iterator<C0129b> it = c0137f.iterator();
        while (it.hasNext()) {
            C0129b next = it.next();
            if (next.f244b == 1 && (mo1247d = next.f247e.mo1247d(this.f218d, this.f223i)) != null) {
                hashMap.put(Integer.valueOf(next.f243a.f282b), next.f245c);
                if (mo1247d != next.f247e) {
                    c0137f2.m1261a(new C0129b(next, next.f243a, next.f245c, mo1247d), this.f220f);
                } else {
                    c0137f2.m1261a(next, this.f220f);
                }
            }
        }
        Iterator<C0129b> it2 = c0137f.iterator();
        while (it2.hasNext()) {
            C0129b next2 = it2.next();
            if (next2.f244b != 1 && (next2.m1265c() || (abstractC0124X = (AbstractC0124X) hashMap.get(Integer.valueOf(next2.f243a.f282b))) == null || !abstractC0124X.equals(next2.f245c))) {
                c0137f2.m1261a(next2, this.f220f);
            }
        }
        return c0137f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: f */
    protected final void m1289f(C0129b c0129b, C0137f c0137f, Set<C0129b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c0129b.f243a instanceof C0136e0) {
            if (!c0129b.f245c.mo1237f()) {
                for (int i2 = 0; i2 < c0129b.f245c.mo1236h(); i2++) {
                    if (c0129b.f245c.mo1238d(i2) != Integer.MAX_VALUE) {
                        C0129b c0129b2 = new C0129b((AbstractC0151m) this.f278a.f234a.get(c0129b.f245c.mo1238d(i2)), c0129b.f244b, c0129b.f245c.mo1239c(i2), c0129b.f247e);
                        c0129b2.f246d = c0129b.f246d;
                        m1289f(c0129b2, c0137f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0137f.m1261a(new C0129b(c0129b, c0129b.f243a, AbstractC0124X.f230b, c0129b.f247e), this.f220f);
                    } else {
                        m1288g(c0129b, c0137f, set, z, z2, i, z3);
                    }
                }
                return;
            } else if (z2) {
                c0137f.m1261a(c0129b, this.f220f);
                return;
            }
        }
        m1288g(c0129b, c0137f, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0200  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void m1288g(com.github.catvod.spider.merge.p014O.C0129b r17, com.github.catvod.spider.merge.p014O.C0137f r18, java.util.Set<com.github.catvod.spider.merge.p014O.C0129b> r19, boolean r20, boolean r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0119S.m1288g(com.github.catvod.spider.merge.O.b, com.github.catvod.spider.merge.O.f, java.util.Set, boolean, boolean, int, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0141, code lost:
        if (r15 == 0) goto L94;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.github.catvod.spider.merge.p014O.C0137f m1287h(com.github.catvod.spider.merge.p014O.C0137f r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0119S.m1287h(com.github.catvod.spider.merge.O.f, int, boolean):com.github.catvod.spider.merge.O.f");
    }

    /* renamed from: i */
    protected final C0137f m1286i(AbstractC0151m abstractC0151m, C0068C c0068c, boolean z) {
        AbstractC0124X m1277a = AbstractC0124X.m1277a(this.f278a, c0068c);
        C0137f c0137f = new C0137f(z);
        int i = 0;
        while (i < abstractC0151m.m1244b()) {
            int i2 = i + 1;
            m1289f(new C0129b(abstractC0151m.m1243d(i).f298a, i2, m1277a, AbstractC0150l0.f280a), c0137f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0137f;
    }

    /* renamed from: j */
    protected final BitSet m1285j(C0177d[] c0177dArr, C0099x c0099x) {
        BitSet bitSet = new BitSet();
        for (C0177d c0177d : c0177dArr) {
            AbstractC0150l0 abstractC0150l0 = c0177d.f313a;
            if (abstractC0150l0 == AbstractC0150l0.f280a || m1284k(abstractC0150l0, c0099x)) {
                bitSet.set(c0177d.f314b);
            }
        }
        return bitSet;
    }

    /* renamed from: k */
    protected final boolean m1284k(AbstractC0150l0 abstractC0150l0, C0099x c0099x) {
        return abstractC0150l0.mo1248c(this.f218d, c0099x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r9 == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final int m1283l(com.github.catvod.spider.merge.p015P.C0175b r17, com.github.catvod.spider.merge.p015P.C0178e r18, com.github.catvod.spider.merge.p013N.InterfaceC0072G r19, int r20, com.github.catvod.spider.merge.p013N.C0099x r21) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.C0119S.m1283l(com.github.catvod.spider.merge.P.b, com.github.catvod.spider.merge.P.e, com.github.catvod.spider.merge.N.G, int, com.github.catvod.spider.merge.N.x):int");
    }

    /* renamed from: m */
    protected final int m1282m(C0137f c0137f) {
        C0189k c0189k = new C0189k(new int[0]);
        Iterator<C0129b> it = c0137f.iterator();
        while (it.hasNext()) {
            C0129b next = it.next();
            if (next.m1266b() > 0 || ((next.f243a instanceof C0136e0) && next.f245c.m1275e())) {
                c0189k.m1204a(next.f244b);
            }
        }
        if (c0189k.m1195j() == 0) {
            return 0;
        }
        return c0189k.m1200e();
    }

    /* renamed from: n */
    protected final int m1281n(C0137f c0137f, C0099x c0099x) {
        int m1282m;
        C0137f c0137f2 = new C0137f(c0137f.f260h);
        C0137f c0137f3 = new C0137f(c0137f.f260h);
        Iterator<C0129b> it = c0137f.iterator();
        while (it.hasNext()) {
            C0129b next = it.next();
            AbstractC0150l0 abstractC0150l0 = next.f247e;
            if (abstractC0150l0 == AbstractC0150l0.f280a || m1284k(abstractC0150l0, c0099x)) {
                c0137f2.m1261a(next, null);
            } else {
                c0137f3.m1261a(next, null);
            }
        }
        int m1282m2 = m1282m(c0137f2);
        if (m1282m2 != 0) {
            return m1282m2;
        }
        if (c0137f3.size() <= 0 || (m1282m = m1282m(c0137f3)) == 0) {
            return 0;
        }
        return m1282m;
    }

    /* renamed from: p */
    protected final C0096u m1279p(InterfaceC0072G interfaceC0072G, C0099x c0099x, C0137f c0137f, int i) {
        return new C0096u(this.f218d, interfaceC0072G, interfaceC0072G.get(i), interfaceC0072G.mo1359g(1), c0099x);
    }

    /* renamed from: q */
    protected final void m1278q(C0175b c0175b, int i, int i2, BitSet bitSet, C0137f c0137f) {
        AbstractC0098w abstractC0098w = this.f218d;
        if (abstractC0098w != null) {
            ((C0100y) abstractC0098w.m1393e()).mo1317b(this.f218d, c0175b, i, i2, bitSet, c0137f);
        }
    }
}
