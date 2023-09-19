package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p016Q.C0189k;
import java.util.BitSet;
import java.util.Set;

/* renamed from: com.github.catvod.spider.merge.O.y */
/* loaded from: classes.dex */
public final class C0172y {

    /* renamed from: a */
    public final C0127a f303a;

    public C0172y(C0127a c0127a) {
        this.f303a = c0127a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List<com.github.catvod.spider.merge.O.m>, java.util.ArrayList] */
    /* renamed from: a */
    public final void m1231a(AbstractC0151m abstractC0151m, AbstractC0124X abstractC0124X, C0189k c0189k, Set set, BitSet bitSet) {
        if (set.add(new C0129b(abstractC0151m, 0, abstractC0124X, AbstractC0150l0.f280a))) {
            if (abstractC0151m == null) {
                if (abstractC0124X == null) {
                    c0189k.m1204a(-2);
                    return;
                } else if (abstractC0124X.mo1237f()) {
                    c0189k.m1204a(-1);
                    return;
                }
            }
            if (abstractC0151m instanceof C0136e0) {
                if (abstractC0124X == null) {
                    c0189k.m1204a(-2);
                    return;
                } else if (abstractC0124X.mo1237f()) {
                    c0189k.m1204a(-1);
                    return;
                } else if (abstractC0124X != AbstractC0124X.f230b) {
                    boolean z = bitSet.get(abstractC0151m.f283c);
                    try {
                        bitSet.clear(abstractC0151m.f283c);
                        for (int i = 0; i < abstractC0124X.mo1236h(); i++) {
                            m1231a((AbstractC0151m) this.f303a.f234a.get(abstractC0124X.mo1238d(i)), abstractC0124X.mo1239c(i), c0189k, set, bitSet);
                        }
                        if (z) {
                            return;
                        }
                        return;
                    } finally {
                        if (z) {
                            bitSet.set(abstractC0151m.f283c);
                        }
                    }
                }
            }
            int m1244b = abstractC0151m.m1244b();
            for (int i2 = 0; i2 < m1244b; i2++) {
                AbstractC0166t0 m1243d = abstractC0151m.m1243d(i2);
                if (m1243d.getClass() == C0138f0.class) {
                    C0138f0 c0138f0 = (C0138f0) m1243d;
                    if (bitSet.get(c0138f0.f298a.f283c)) {
                        continue;
                    } else {
                        C0154n0 m1242i = C0154n0.m1242i(abstractC0124X, c0138f0.f263c.f282b);
                        try {
                            bitSet.set(((C0138f0) m1243d).f298a.f283c);
                            m1231a(m1243d.f298a, m1242i, c0189k, set, bitSet);
                        } finally {
                            bitSet.clear(c0138f0.f298a.f283c);
                        }
                    }
                } else if ((m1243d instanceof AbstractC0153n) || m1243d.mo1234b()) {
                    m1231a(m1243d.f298a, abstractC0124X, c0189k, set, bitSet);
                } else if (m1243d.getClass() == C0168u0.class) {
                    c0189k.m1202c(C0189k.m1198g(1, this.f303a.f239f));
                } else {
                    C0189k mo1240c = m1243d.mo1240c();
                    if (mo1240c != null) {
                        if (m1243d instanceof C0117P) {
                            C0189k m1198g = C0189k.m1198g(1, this.f303a.f239f);
                            if (m1198g.m1199f()) {
                                mo1240c = null;
                            } else if (mo1240c.m1199f()) {
                                mo1240c = new C0189k(new int[0]);
                                mo1240c.m1202c(m1198g);
                            } else {
                                mo1240c = C0189k.m1194k(m1198g, mo1240c);
                            }
                        }
                        c0189k.m1202c(mo1240c);
                    }
                }
            }
        }
    }
}
