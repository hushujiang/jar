package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0067B;
import com.github.catvod.spider.merge.p013N.C0068C;
import com.github.catvod.spider.merge.p048m.C0618b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.O.h0 */
/* loaded from: classes.dex */
public final class C0142h0 extends AbstractC0144i0 {

    /* renamed from: b */
    public final AbstractC0150l0[] f266b;

    public C0142h0(AbstractC0150l0 abstractC0150l0, AbstractC0150l0 abstractC0150l02) {
        HashSet hashSet = new HashSet();
        if (abstractC0150l0 instanceof C0142h0) {
            hashSet.addAll(Arrays.asList(((C0142h0) abstractC0150l0).f266b));
        } else {
            hashSet.add(abstractC0150l0);
        }
        if (abstractC0150l02 instanceof C0142h0) {
            hashSet.addAll(Arrays.asList(((C0142h0) abstractC0150l02).f266b));
        } else {
            hashSet.add(abstractC0150l02);
        }
        List m1250a = AbstractC0150l0.m1250a(hashSet);
        if (!m1250a.isEmpty()) {
            hashSet.add((C0146j0) Collections.max(m1250a));
        }
        this.f266b = (AbstractC0150l0[]) hashSet.toArray(new AbstractC0150l0[hashSet.size()]);
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0150l0
    /* renamed from: c */
    public final boolean mo1248c(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        for (AbstractC0150l0 abstractC0150l0 : this.f266b) {
            if (abstractC0150l0.mo1248c(abstractC0067B, c0068c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0150l0
    /* renamed from: d */
    public final AbstractC0150l0 mo1247d(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        ArrayList arrayList = new ArrayList();
        AbstractC0150l0[] abstractC0150l0Arr = this.f266b;
        int length = abstractC0150l0Arr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                if (i2 == 0) {
                    return this;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                AbstractC0150l0 abstractC0150l0 = (AbstractC0150l0) arrayList.get(0);
                while (r6 < arrayList.size()) {
                    abstractC0150l0 = AbstractC0150l0.m1246e(abstractC0150l0, (AbstractC0150l0) arrayList.get(r6));
                    r6++;
                }
                return abstractC0150l0;
            }
            AbstractC0150l0 abstractC0150l02 = abstractC0150l0Arr[i];
            AbstractC0150l0 mo1247d = abstractC0150l02.mo1247d(abstractC0067B, c0068c);
            i2 |= mo1247d == abstractC0150l02 ? 0 : 1;
            C0148k0 c0148k0 = AbstractC0150l0.f280a;
            if (mo1247d == c0148k0) {
                return c0148k0;
            }
            if (mo1247d != null) {
                arrayList.add(mo1247d);
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0142h0) {
            return Arrays.equals(this.f266b, ((C0142h0) obj).f266b);
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0150l0[] abstractC0150l0Arr = this.f266b;
        int hashCode = C0142h0.class.hashCode();
        for (AbstractC0150l0 abstractC0150l0 : abstractC0150l0Arr) {
            hashCode = C0052e.m1410i(hashCode, abstractC0150l0);
        }
        return C0052e.m1415d(hashCode, abstractC0150l0Arr.length);
    }

    public final String toString() {
        return C0618b.m205b(Arrays.asList(this.f266b).iterator(), atm.m897d("1606"));
    }
}
