package com.github.catvod.spider.merge.p015P;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p014O.AbstractC0150l0;
import com.github.catvod.spider.merge.p028c.C0424a;

/* renamed from: com.github.catvod.spider.merge.P.d */
/* loaded from: classes.dex */
public final class C0177d {

    /* renamed from: a */
    public AbstractC0150l0 f313a;

    /* renamed from: b */
    public int f314b;

    public C0177d(AbstractC0150l0 abstractC0150l0, int i) {
        this.f314b = i;
        this.f313a = abstractC0150l0;
    }

    public final String toString() {
        StringBuilder m635a = C0424a.m635a(atm.m897d("42"));
        m635a.append(this.f313a);
        m635a.append(atm.m897d("465A"));
        m635a.append(this.f314b);
        m635a.append(atm.m897d("43"));
        return m635a.toString();
    }
}
