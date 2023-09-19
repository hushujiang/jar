package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p013N.AbstractC0067B;
import com.github.catvod.spider.merge.p013N.C0068C;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.O.j0 */
/* loaded from: classes.dex */
public final class C0146j0 extends AbstractC0150l0 implements Comparable<C0146j0> {

    /* renamed from: b */
    public final int f267b;

    protected C0146j0() {
        this.f267b = 0;
    }

    public C0146j0(int i) {
        this.f267b = i;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0150l0
    /* renamed from: c */
    public final boolean mo1248c(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        return abstractC0067B.mo1334h(this.f267b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C0146j0 c0146j0) {
        return this.f267b - c0146j0.f267b;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0150l0
    /* renamed from: d */
    public final AbstractC0150l0 mo1247d(AbstractC0067B<?, ?> abstractC0067B, C0068C c0068c) {
        if (abstractC0067B.mo1334h(this.f267b)) {
            return AbstractC0150l0.f280a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0146j0) {
            return this == obj || this.f267b == ((C0146j0) obj).f267b;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f267b;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("11"));
        m635a.append(this.f267b);
        m635a.append(atm.m897d("54470A07293B1745"));
        return m635a.toString();
    }
}
