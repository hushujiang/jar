package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p016Q.C0189k;

/* renamed from: com.github.catvod.spider.merge.O.c0 */
/* loaded from: classes.dex */
public final class C0132c0 extends AbstractC0166t0 {

    /* renamed from: b */
    public final int f248b;

    /* renamed from: c */
    public final int f249c;

    public C0132c0(AbstractC0151m abstractC0151m, int i, int i2) {
        super(abstractC0151m);
        this.f248b = i;
        this.f249c = i2;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: a */
    public final int mo1235a() {
        return 2;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: c */
    public final C0189k mo1240c() {
        return C0189k.m1198g(this.f248b, this.f249c);
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: d */
    public final boolean mo1233d(int i, int i2) {
        return i >= this.f248b && i <= this.f249c;
    }

    public final String toString() {
        String m897d = atm.m897d("4D");
        StringBuilder appendCodePoint = new StringBuilder(m897d).appendCodePoint(this.f248b);
        appendCodePoint.append(atm.m897d("4D545452"));
        StringBuilder appendCodePoint2 = appendCodePoint.appendCodePoint(this.f249c);
        appendCodePoint2.append(m897d);
        return appendCodePoint2.toString();
    }
}
