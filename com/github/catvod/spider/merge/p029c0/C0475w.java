package com.github.catvod.spider.merge.p029c0;

import com.github.catvod.spider.merge.atm;
import com.github.catvod.spider.merge.p025a0.C0293m;

/* renamed from: com.github.catvod.spider.merge.c0.w */
/* loaded from: classes.dex */
public final class C0475w extends AbstractC0440N {

    /* renamed from: a */
    private final String f894a;

    public C0475w(String str) {
        this.f894a = str;
    }

    @Override // com.github.catvod.spider.merge.p029c0.AbstractC0440N
    /* renamed from: a */
    public final boolean mo599a(C0293m c0293m, C0293m c0293m2) {
        return this.f894a.equals(c0293m2.m978e0());
    }

    public final String toString() {
        return String.format(atm.m897d("495F09"), this.f894a);
    }
}
