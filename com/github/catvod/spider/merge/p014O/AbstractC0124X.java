package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p013N.C0068C;
import java.util.IdentityHashMap;

/* renamed from: com.github.catvod.spider.merge.O.X */
/* loaded from: classes.dex */
public abstract class AbstractC0124X {

    /* renamed from: b */
    public static final C0170w f230b = new C0170w();

    /* renamed from: a */
    public final int f231a;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC0124X(int i) {
        this.f231a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: a */
    public static AbstractC0124X m1277a(C0127a c0127a, C0068C c0068c) {
        if (c0068c == null) {
            c0068c = C0068C.f110c;
        }
        C0068C c0068c2 = c0068c.f111a;
        return (c0068c2 == null || c0068c == C0068C.f110c) ? f230b : C0154n0.m1242i(m1277a(c0127a, c0068c2), ((C0138f0) ((AbstractC0151m) c0127a.f234a.get(c0068c.f112b)).m1243d(0)).f263c.f282b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map<com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X>, java.util.HashMap] */
    /* renamed from: b */
    public static AbstractC0124X m1276b(AbstractC0124X abstractC0124X, C0125Y c0125y, IdentityHashMap<AbstractC0124X, AbstractC0124X> identityHashMap) {
        if (abstractC0124X.mo1237f()) {
            return abstractC0124X;
        }
        AbstractC0124X abstractC0124X2 = identityHashMap.get(abstractC0124X);
        if (abstractC0124X2 != null) {
            return abstractC0124X2;
        }
        AbstractC0124X abstractC0124X3 = (AbstractC0124X) c0125y.f232a.get(abstractC0124X);
        if (abstractC0124X3 != null) {
            identityHashMap.put(abstractC0124X, abstractC0124X3);
            return abstractC0124X3;
        }
        AbstractC0124X[] abstractC0124XArr = new AbstractC0124X[abstractC0124X.mo1236h()];
        boolean z = false;
        for (int i = 0; i < abstractC0124XArr.length; i++) {
            AbstractC0124X m1276b = m1276b(abstractC0124X.mo1239c(i), c0125y, identityHashMap);
            if (z || m1276b != abstractC0124X.mo1239c(i)) {
                if (!z) {
                    abstractC0124XArr = new AbstractC0124X[abstractC0124X.mo1236h()];
                    for (int i2 = 0; i2 < abstractC0124X.mo1236h(); i2++) {
                        abstractC0124XArr[i2] = abstractC0124X.mo1239c(i2);
                    }
                    z = true;
                }
                abstractC0124XArr[i] = m1276b;
            }
        }
        if (!z) {
            c0125y.m1273a(abstractC0124X);
            identityHashMap.put(abstractC0124X, abstractC0124X);
            return abstractC0124X;
        }
        AbstractC0124X m1242i = abstractC0124XArr.length == 0 ? f230b : abstractC0124XArr.length == 1 ? C0154n0.m1242i(abstractC0124XArr[0], abstractC0124X.mo1238d(0)) : new C0157p(abstractC0124XArr, ((C0157p) abstractC0124X).f293d);
        c0125y.m1273a(m1242i);
        identityHashMap.put(m1242i, m1242i);
        identityHashMap.put(abstractC0124X, m1242i);
        return m1242i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
        if (r1 == r9) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
        if (r19 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00dc, code lost:
        r19.m1214b(r0, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0104, code lost:
        if (r19 != 0) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Type inference failed for: r10v11, types: [com.github.catvod.spider.merge.O.p] */
    /* JADX WARN: Type inference failed for: r10v15, types: [com.github.catvod.spider.merge.O.p] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.github.catvod.spider.merge.Q.d<com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X>, com.github.catvod.spider.merge.Q.d] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.github.catvod.spider.merge.p014O.AbstractC0124X m1274g(com.github.catvod.spider.merge.p014O.AbstractC0124X r16, com.github.catvod.spider.merge.p014O.AbstractC0124X r17, boolean r18, com.github.catvod.spider.merge.p016Q.C0182d<com.github.catvod.spider.merge.p014O.AbstractC0124X, com.github.catvod.spider.merge.p014O.AbstractC0124X, com.github.catvod.spider.merge.p014O.AbstractC0124X> r19) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.p014O.AbstractC0124X.m1274g(com.github.catvod.spider.merge.O.X, com.github.catvod.spider.merge.O.X, boolean, com.github.catvod.spider.merge.Q.d):com.github.catvod.spider.merge.O.X");
    }

    /* renamed from: c */
    public abstract AbstractC0124X mo1239c(int i);

    /* renamed from: d */
    public abstract int mo1238d(int i);

    /* renamed from: e */
    public final boolean m1275e() {
        return mo1238d(mo1236h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public boolean mo1237f() {
        return this == f230b;
    }

    /* renamed from: h */
    public abstract int mo1236h();

    public final int hashCode() {
        return this.f231a;
    }
}
