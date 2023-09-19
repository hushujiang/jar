package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.O.W */
/* loaded from: classes.dex */
public final class C0123W extends AbstractC0153n {

    /* renamed from: b */
    public final int f227b;

    /* renamed from: c */
    public final int f228c;

    /* renamed from: d */
    public final boolean f229d;

    public C0123W(AbstractC0151m abstractC0151m, int i, int i2, boolean z) {
        super(abstractC0151m);
        this.f227b = i;
        this.f228c = i2;
        this.f229d = z;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: a */
    public final int mo1235a() {
        return 4;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: b */
    public final boolean mo1234b() {
        return true;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: d */
    public final boolean mo1233d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("1A081F1113"));
        m635a.append(this.f227b);
        m635a.append(atm.m897d("50"));
        m635a.append(this.f228c);
        return m635a.toString();
    }
}
