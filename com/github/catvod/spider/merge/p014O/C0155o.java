package com.github.catvod.spider.merge.p014O;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.O.o */
/* loaded from: classes.dex */
public final class C0155o extends AbstractC0166t0 {

    /* renamed from: b */
    public final int f290b;

    /* renamed from: c */
    public final int f291c;

    public C0155o(AbstractC0151m abstractC0151m, int i, int i2) {
        super(abstractC0151m);
        this.f290b = i;
        this.f291c = i2;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: a */
    public final int mo1235a() {
        return 6;
    }

    @Override // com.github.catvod.spider.merge.p014O.AbstractC0166t0
    /* renamed from: d */
    public final boolean mo1233d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("0B190E1C233635"));
        m635a.append(this.f290b);
        m635a.append(atm.m897d("50"));
        m635a.append(this.f291c);
        return m635a.toString();
    }
}
