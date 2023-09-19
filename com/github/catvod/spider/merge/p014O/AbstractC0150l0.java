package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.p013N.AbstractC0067B;
import com.github.catvod.spider.merge.p013N.C0068C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.github.catvod.spider.merge.O.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC0150l0 {

    /* renamed from: a */
    public static final C0148k0 f280a = new C0148k0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static List m1250a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC0150l0 abstractC0150l0 = (AbstractC0150l0) it.next();
            if (abstractC0150l0 instanceof C0146j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C0146j0) abstractC0150l0);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: b */
    public static AbstractC0150l0 m1249b(AbstractC0150l0 abstractC0150l0, AbstractC0150l0 abstractC0150l02) {
        C0148k0 c0148k0;
        if (abstractC0150l0 == null || abstractC0150l0 == (c0148k0 = f280a)) {
            return abstractC0150l02;
        }
        if (abstractC0150l02 == null || abstractC0150l02 == c0148k0) {
            return abstractC0150l0;
        }
        C0140g0 c0140g0 = new C0140g0(abstractC0150l0, abstractC0150l02);
        AbstractC0150l0[] abstractC0150l0Arr = c0140g0.f265b;
        return abstractC0150l0Arr.length == 1 ? abstractC0150l0Arr[0] : c0140g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static AbstractC0150l0 m1246e(AbstractC0150l0 abstractC0150l0, AbstractC0150l0 abstractC0150l02) {
        if (abstractC0150l0 == null) {
            return abstractC0150l02;
        }
        if (abstractC0150l02 == null) {
            return abstractC0150l0;
        }
        C0148k0 c0148k0 = f280a;
        C0148k0 c0148k02 = c0148k0;
        c0148k02 = c0148k0;
        if (abstractC0150l0 != c0148k0 && abstractC0150l02 != c0148k0) {
            C0142h0 c0142h0 = new C0142h0(abstractC0150l0, abstractC0150l02);
            AbstractC0150l0[] abstractC0150l0Arr = c0142h0.f266b;
            c0148k02 = c0142h0;
            if (abstractC0150l0Arr.length == 1) {
                return abstractC0150l0Arr[0];
            }
        }
        return c0148k02;
    }

    /* renamed from: c */
    public abstract boolean mo1248c(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c);

    /* renamed from: d */
    public AbstractC0150l0 mo1247d(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        return this;
    }
}
