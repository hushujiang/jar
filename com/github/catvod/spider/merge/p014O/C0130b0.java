package com.github.catvod.spider.merge.p014O;

import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge.O.b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0130b0 {
    /* renamed from: a */
    public static boolean m1264a(C0137f c0137f) {
        Iterator<C0129b> it = c0137f.iterator();
        while (it.hasNext()) {
            if (!(it.next().f243a instanceof C0136e0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static Collection<BitSet> m1263b(C0137f c0137f) {
        C0128a0 c0128a0 = new C0128a0();
        Iterator<C0129b> it = c0137f.iterator();
        while (it.hasNext()) {
            C0129b next = it.next();
            BitSet bitSet = (BitSet) c0128a0.get(next);
            if (bitSet == null) {
                bitSet = new BitSet();
                c0128a0.put(next, bitSet);
            }
            bitSet.set(next.f244b);
        }
        return c0128a0.values();
    }

    /* renamed from: c */
    public static int m1262c(Collection<BitSet> collection) {
        BitSet bitSet = new BitSet();
        for (BitSet bitSet2 : collection) {
            bitSet.set(bitSet2.nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }
}
