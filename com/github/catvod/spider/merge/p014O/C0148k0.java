package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p010K.C0052e;
import com.github.catvod.spider.merge.p013N.AbstractC0067B;
import com.github.catvod.spider.merge.p013N.C0068C;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.O.k0 */
/* loaded from: classes.dex */
public final class C0148k0 extends AbstractC0150l0 {

    /* renamed from: b */
    public final int f274b;

    /* renamed from: c */
    public final int f275c;

    /* renamed from: d */
    public final boolean f276d;

    /* JADX INFO: Access modifiers changed from: protected */
    public C0148k0() {
        this.f274b = -1;
        this.f275c = -1;
        this.f276d = false;
    }

    public C0148k0(int i, int i2, boolean z) {
        this.f274b = i;
        this.f275c = i2;
        this.f276d = z;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0150l0
    /* renamed from: c */
    public final boolean mo1248c(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        abstractC0067B.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0148k0) {
            if (this == obj) {
                return true;
            }
            C0148k0 c0148k0 = (C0148k0) obj;
            return this.f274b == c0148k0.f274b && this.f275c == c0148k0.f275c && this.f276d == c0148k0.f276d;
        }
        return false;
    }

    public final int hashCode() {
        return C0052e.m1415d(C0052e.m1411h(C0052e.m1411h(C0052e.m1411h(0, this.f274b), this.f275c), this.f276d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("11"));
        m635a.append(this.f274b);
        m635a.append(atm.m897d("50"));
        m635a.append(this.f275c);
        m635a.append(atm.m897d("1745"));
        return m635a.toString();
    }
}
